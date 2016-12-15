grammar foppl;

//v ::= variable
//c ::= constant value or primitive operation
//f ::= procedure
//e ::= c | v | ( let [v e 1 .. e n] e'1 .. e'k ) | ( if e 1 e 2 e 3 )
//| (f e 1 . . . e n ) | (c e 1 . . . e n )
//| ( sample e) | ( observe e 1 e 2 )
//q ::= e | ( defn f [v 1 ... v n ] e) q

program:
    funcDecl* expr
;

funcDecl:
    '(' DEFN f=identifier '[' idList ']' expr+ ')'
;

expr:
    constant                            # constExpr
|   identifier                          # idExpr
|   '(' LET '[' varDecl+ ']' expr+ ')'  # letExpr
|   '(' primitiveCall ')'               # primitiveCallExpr
|   '(' identifier expr* ')'            # funcCallExpr
;

constant:
    INT         # int
|   FLOAT       # float
;

identifier:
    IDENTIFIER
;


varDecl:
    identifier expr
;

primitiveCall:
    IF e1=expr e2=expr e3=expr                              # ifExpr
|   op=LOOP e1=expr id=identifier e2=expr  args=exprList    # loopExpr
|   op=VECTOR expr+                                         # vectorExpr
|   unaryFunction                                           # unaryExpr
|   binaryFunction                                          # binaryExpr
;

unaryFunction:
    op=FIRST    expr
|   op=SECOND   expr
|   op=LAST     expr
|   op=SQRT     expr
|   op=SAMPLE   expr
;

binaryFunction:
    op=ADD      lhs=expr rhs=expr
|   op=SUB      lhs=expr rhs=expr
|   op=MULT     lhs=expr rhs=expr
|   op=DIV      lhs=expr rhs=expr
|   op=NORMAL   lhs=expr rhs=expr
|   op=GAMMA    lhs=expr rhs=expr
|   op=OBSERVE  lhs=expr rhs=expr
;

idList:     identifier*;
exprList:   expr*;


// Lexers
//--------------------------------------------------------------------


// Main Keywords
SAMPLE:             'sample';
OBSERVE:            'observe';
LET:                'let';
DEFN:               'defn';

IDENTIFIER: ([a-zA-Z]|'_') ([a-zA-Z0-9]|'_'|'-')*;

// Constants
INT: [+-]?[0-9]+;
FLOAT: INT '.' [0-9]+;

// Primitive operations
LOOP:               'loop';
IF:                 'if';
VECTOR:             'vector';
NORMAL:             'normal';
GAMMA:              'gamma';
SQRT:               'sqrt';
FIRST:              'first';
SECOND:             'second';
LAST:               'last';



// Operations
ADD:                '+';
SUB:                '-';
MULT:               '*';
DIV:                '/';

// Discard
//--------------------------------------------------------------------

fragment
WS : [ \n\r\t\,] ;

fragment
COMMENT: ';' ~[\r\n]* ;

TRASH
    : ( WS | COMMENT ) -> channel(HIDDEN)
    ;
