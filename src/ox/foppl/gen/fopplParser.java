// Generated from /home/lezkus/Documents/TFM/foppl/src/ox/foppl/grammar/foppl.g4 by ANTLR 4.5.3
package ox.foppl.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class fopplParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, SAMPLE=5, OBSERVE=6, LET=7, DEFN=8, IDENTIFIER=9, 
		INT=10, FLOAT=11, LOOP=12, IF=13, VECTOR=14, NORMAL=15, GAMMA=16, SQRT=17, 
		FIRST=18, SECOND=19, LAST=20, ADD=21, SUB=22, MULT=23, DIV=24, TRASH=25;
	public static final int
		RULE_program = 0, RULE_funcDecl = 1, RULE_expr = 2, RULE_constant = 3, 
		RULE_identifier = 4, RULE_varDecl = 5, RULE_primitiveCall = 6, RULE_unaryFunction = 7, 
		RULE_binaryFunction = 8, RULE_idList = 9, RULE_exprList = 10;
	public static final String[] ruleNames = {
		"program", "funcDecl", "expr", "constant", "identifier", "varDecl", "primitiveCall", 
		"unaryFunction", "binaryFunction", "idList", "exprList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "'['", "']'", "')'", "'sample'", "'observe'", "'let'", "'defn'", 
		null, null, null, "'loop'", "'if'", "'vector'", "'normal'", "'gamma'", 
		"'sqrt'", "'first'", "'second'", "'last'", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "SAMPLE", "OBSERVE", "LET", "DEFN", "IDENTIFIER", 
		"INT", "FLOAT", "LOOP", "IF", "VECTOR", "NORMAL", "GAMMA", "SQRT", "FIRST", 
		"SECOND", "LAST", "ADD", "SUB", "MULT", "DIV", "TRASH"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "foppl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public fopplParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<FuncDeclContext> funcDecl() {
			return getRuleContexts(FuncDeclContext.class);
		}
		public FuncDeclContext funcDecl(int i) {
			return getRuleContext(FuncDeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fopplVisitor ) return ((fopplVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(22);
					funcDecl();
					}
					} 
				}
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(28);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDeclContext extends ParserRuleContext {
		public IdentifierContext f;
		public TerminalNode DEFN() { return getToken(fopplParser.DEFN, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fopplVisitor ) return ((fopplVisitor<? extends T>)visitor).visitFuncDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(31);
			match(DEFN);
			setState(32);
			((FuncDeclContext)_localctx).f = identifier();
			setState(33);
			match(T__1);
			setState(34);
			idList();
			setState(35);
			match(T__2);
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				expr();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IDENTIFIER) | (1L << INT) | (1L << FLOAT))) != 0) );
			setState(41);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimitiveCallExprContext extends ExprContext {
		public PrimitiveCallContext primitiveCall() {
			return getRuleContext(PrimitiveCallContext.class,0);
		}
		public PrimitiveCallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fopplVisitor ) return ((fopplVisitor<? extends T>)visitor).visitPrimitiveCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallExprContext extends ExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FuncCallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fopplVisitor ) return ((fopplVisitor<? extends T>)visitor).visitFuncCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetExprContext extends ExprContext {
		public TerminalNode LET() { return getToken(fopplParser.LET, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LetExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fopplVisitor ) return ((fopplVisitor<? extends T>)visitor).visitLetExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstExprContext extends ExprContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fopplVisitor ) return ((fopplVisitor<? extends T>)visitor).visitConstExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fopplVisitor ) return ((fopplVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		int _la;
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new ConstExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				constant();
				}
				break;
			case 2:
				_localctx = new IdExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				identifier();
				}
				break;
			case 3:
				_localctx = new LetExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				match(T__0);
				setState(46);
				match(LET);
				setState(47);
				match(T__1);
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(48);
					varDecl();
					}
					}
					setState(51); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				setState(53);
				match(T__2);
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(54);
					expr();
					}
					}
					setState(57); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IDENTIFIER) | (1L << INT) | (1L << FLOAT))) != 0) );
				setState(59);
				match(T__3);
				}
				break;
			case 4:
				_localctx = new PrimitiveCallExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				match(T__0);
				setState(62);
				primitiveCall();
				setState(63);
				match(T__3);
				}
				break;
			case 5:
				_localctx = new FuncCallExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				match(T__0);
				setState(66);
				identifier();
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IDENTIFIER) | (1L << INT) | (1L << FLOAT))) != 0)) {
					{
					{
					setState(67);
					expr();
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(73);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FloatContext extends ConstantContext {
		public TerminalNode FLOAT() { return getToken(fopplParser.FLOAT, 0); }
		public FloatContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fopplVisitor ) return ((fopplVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ConstantContext {
		public TerminalNode INT() { return getToken(fopplParser.INT, 0); }
		public IntContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fopplVisitor ) return ((fopplVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constant);
		try {
			setState(79);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(FLOAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(fopplParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fopplVisitor ) return ((fopplVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fopplVisitor ) return ((fopplVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			identifier();
			setState(84);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveCallContext extends ParserRuleContext {
		public PrimitiveCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveCall; }
	 
		public PrimitiveCallContext() { }
		public void copyFrom(PrimitiveCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoopExprContext extends PrimitiveCallContext {
		public Token op;
		public ExprContext e1;
		public IdentifierContext id;
		public ExprContext e2;
		public ExprListContext args;
		public TerminalNode LOOP() { return getToken(fopplParser.LOOP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public LoopExprContext(PrimitiveCallContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fopplVisitor ) return ((fopplVisitor<? extends T>)visitor).visitLoopExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends PrimitiveCallContext {
		public UnaryFunctionContext unaryFunction() {
			return getRuleContext(UnaryFunctionContext.class,0);
		}
		public UnaryExprContext(PrimitiveCallContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fopplVisitor ) return ((fopplVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfExprContext extends PrimitiveCallContext {
		public ExprContext e1;
		public ExprContext e2;
		public ExprContext e3;
		public TerminalNode IF() { return getToken(fopplParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IfExprContext(PrimitiveCallContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fopplVisitor ) return ((fopplVisitor<? extends T>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExprContext extends PrimitiveCallContext {
		public BinaryFunctionContext binaryFunction() {
			return getRuleContext(BinaryFunctionContext.class,0);
		}
		public BinaryExprContext(PrimitiveCallContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fopplVisitor ) return ((fopplVisitor<? extends T>)visitor).visitBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VectorExprContext extends PrimitiveCallContext {
		public Token op;
		public TerminalNode VECTOR() { return getToken(fopplParser.VECTOR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public VectorExprContext(PrimitiveCallContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fopplVisitor ) return ((fopplVisitor<? extends T>)visitor).visitVectorExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveCallContext primitiveCall() throws RecognitionException {
		PrimitiveCallContext _localctx = new PrimitiveCallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_primitiveCall);
		int _la;
		try {
			setState(105);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(IF);
				setState(87);
				((IfExprContext)_localctx).e1 = expr();
				setState(88);
				((IfExprContext)_localctx).e2 = expr();
				setState(89);
				((IfExprContext)_localctx).e3 = expr();
				}
				break;
			case LOOP:
				_localctx = new LoopExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				((LoopExprContext)_localctx).op = match(LOOP);
				setState(92);
				((LoopExprContext)_localctx).e1 = expr();
				setState(93);
				((LoopExprContext)_localctx).id = identifier();
				setState(94);
				((LoopExprContext)_localctx).e2 = expr();
				setState(95);
				((LoopExprContext)_localctx).args = exprList();
				}
				break;
			case VECTOR:
				_localctx = new VectorExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				((VectorExprContext)_localctx).op = match(VECTOR);
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(98);
					expr();
					}
					}
					setState(101); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IDENTIFIER) | (1L << INT) | (1L << FLOAT))) != 0) );
				}
				break;
			case SAMPLE:
			case SQRT:
			case FIRST:
			case SECOND:
			case LAST:
				_localctx = new UnaryExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				unaryFunction();
				}
				break;
			case OBSERVE:
			case NORMAL:
			case GAMMA:
			case ADD:
			case SUB:
			case MULT:
			case DIV:
				_localctx = new BinaryExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				binaryFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryFunctionContext extends ParserRuleContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FIRST() { return getToken(fopplParser.FIRST, 0); }
		public TerminalNode SECOND() { return getToken(fopplParser.SECOND, 0); }
		public TerminalNode LAST() { return getToken(fopplParser.LAST, 0); }
		public TerminalNode SQRT() { return getToken(fopplParser.SQRT, 0); }
		public TerminalNode SAMPLE() { return getToken(fopplParser.SAMPLE, 0); }
		public UnaryFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fopplVisitor ) return ((fopplVisitor<? extends T>)visitor).visitUnaryFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryFunctionContext unaryFunction() throws RecognitionException {
		UnaryFunctionContext _localctx = new UnaryFunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unaryFunction);
		try {
			setState(117);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				((UnaryFunctionContext)_localctx).op = match(FIRST);
				setState(108);
				expr();
				}
				break;
			case SECOND:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				((UnaryFunctionContext)_localctx).op = match(SECOND);
				setState(110);
				expr();
				}
				break;
			case LAST:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				((UnaryFunctionContext)_localctx).op = match(LAST);
				setState(112);
				expr();
				}
				break;
			case SQRT:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				((UnaryFunctionContext)_localctx).op = match(SQRT);
				setState(114);
				expr();
				}
				break;
			case SAMPLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				((UnaryFunctionContext)_localctx).op = match(SAMPLE);
				setState(116);
				expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryFunctionContext extends ParserRuleContext {
		public Token op;
		public ExprContext lhs;
		public ExprContext rhs;
		public TerminalNode ADD() { return getToken(fopplParser.ADD, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUB() { return getToken(fopplParser.SUB, 0); }
		public TerminalNode MULT() { return getToken(fopplParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(fopplParser.DIV, 0); }
		public TerminalNode NORMAL() { return getToken(fopplParser.NORMAL, 0); }
		public TerminalNode GAMMA() { return getToken(fopplParser.GAMMA, 0); }
		public TerminalNode OBSERVE() { return getToken(fopplParser.OBSERVE, 0); }
		public BinaryFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fopplVisitor ) return ((fopplVisitor<? extends T>)visitor).visitBinaryFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryFunctionContext binaryFunction() throws RecognitionException {
		BinaryFunctionContext _localctx = new BinaryFunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_binaryFunction);
		try {
			setState(147);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				((BinaryFunctionContext)_localctx).op = match(ADD);
				setState(120);
				((BinaryFunctionContext)_localctx).lhs = expr();
				setState(121);
				((BinaryFunctionContext)_localctx).rhs = expr();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				((BinaryFunctionContext)_localctx).op = match(SUB);
				setState(124);
				((BinaryFunctionContext)_localctx).lhs = expr();
				setState(125);
				((BinaryFunctionContext)_localctx).rhs = expr();
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				((BinaryFunctionContext)_localctx).op = match(MULT);
				setState(128);
				((BinaryFunctionContext)_localctx).lhs = expr();
				setState(129);
				((BinaryFunctionContext)_localctx).rhs = expr();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				((BinaryFunctionContext)_localctx).op = match(DIV);
				setState(132);
				((BinaryFunctionContext)_localctx).lhs = expr();
				setState(133);
				((BinaryFunctionContext)_localctx).rhs = expr();
				}
				break;
			case NORMAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				((BinaryFunctionContext)_localctx).op = match(NORMAL);
				setState(136);
				((BinaryFunctionContext)_localctx).lhs = expr();
				setState(137);
				((BinaryFunctionContext)_localctx).rhs = expr();
				}
				break;
			case GAMMA:
				enterOuterAlt(_localctx, 6);
				{
				setState(139);
				((BinaryFunctionContext)_localctx).op = match(GAMMA);
				setState(140);
				((BinaryFunctionContext)_localctx).lhs = expr();
				setState(141);
				((BinaryFunctionContext)_localctx).rhs = expr();
				}
				break;
			case OBSERVE:
				enterOuterAlt(_localctx, 7);
				{
				setState(143);
				((BinaryFunctionContext)_localctx).op = match(OBSERVE);
				setState(144);
				((BinaryFunctionContext)_localctx).lhs = expr();
				setState(145);
				((BinaryFunctionContext)_localctx).rhs = expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fopplVisitor ) return ((fopplVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(149);
				identifier();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fopplVisitor ) return ((fopplVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IDENTIFIER) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				{
				setState(155);
				expr();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33\u00a4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\6\3(\n\3\r\3\16\3)\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\6\4\64"+
		"\n\4\r\4\16\4\65\3\4\3\4\6\4:\n\4\r\4\16\4;\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\7\4G\n\4\f\4\16\4J\13\4\3\4\3\4\5\4N\n\4\3\5\3\5\5\5R\n\5\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\6\bf\n\b\r\b\16\bg\3\b\3\b\5\bl\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\tx\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0096\n"+
		"\n\3\13\7\13\u0099\n\13\f\13\16\13\u009c\13\13\3\f\7\f\u009f\n\f\f\f\16"+
		"\f\u00a2\13\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2\u00b3\2\33\3\2"+
		"\2\2\4 \3\2\2\2\6M\3\2\2\2\bQ\3\2\2\2\nS\3\2\2\2\fU\3\2\2\2\16k\3\2\2"+
		"\2\20w\3\2\2\2\22\u0095\3\2\2\2\24\u009a\3\2\2\2\26\u00a0\3\2\2\2\30\32"+
		"\5\4\3\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\36"+
		"\3\2\2\2\35\33\3\2\2\2\36\37\5\6\4\2\37\3\3\2\2\2 !\7\3\2\2!\"\7\n\2\2"+
		"\"#\5\n\6\2#$\7\4\2\2$%\5\24\13\2%\'\7\5\2\2&(\5\6\4\2\'&\3\2\2\2()\3"+
		"\2\2\2)\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7\6\2\2,\5\3\2\2\2-N\5\b\5\2."+
		"N\5\n\6\2/\60\7\3\2\2\60\61\7\t\2\2\61\63\7\4\2\2\62\64\5\f\7\2\63\62"+
		"\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\679\7"+
		"\5\2\28:\5\6\4\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\7"+
		"\6\2\2>N\3\2\2\2?@\7\3\2\2@A\5\16\b\2AB\7\6\2\2BN\3\2\2\2CD\7\3\2\2DH"+
		"\5\n\6\2EG\5\6\4\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2J"+
		"H\3\2\2\2KL\7\6\2\2LN\3\2\2\2M-\3\2\2\2M.\3\2\2\2M/\3\2\2\2M?\3\2\2\2"+
		"MC\3\2\2\2N\7\3\2\2\2OR\7\f\2\2PR\7\r\2\2QO\3\2\2\2QP\3\2\2\2R\t\3\2\2"+
		"\2ST\7\13\2\2T\13\3\2\2\2UV\5\n\6\2VW\5\6\4\2W\r\3\2\2\2XY\7\17\2\2YZ"+
		"\5\6\4\2Z[\5\6\4\2[\\\5\6\4\2\\l\3\2\2\2]^\7\16\2\2^_\5\6\4\2_`\5\n\6"+
		"\2`a\5\6\4\2ab\5\26\f\2bl\3\2\2\2ce\7\20\2\2df\5\6\4\2ed\3\2\2\2fg\3\2"+
		"\2\2ge\3\2\2\2gh\3\2\2\2hl\3\2\2\2il\5\20\t\2jl\5\22\n\2kX\3\2\2\2k]\3"+
		"\2\2\2kc\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\17\3\2\2\2mn\7\24\2\2nx\5\6\4\2"+
		"op\7\25\2\2px\5\6\4\2qr\7\26\2\2rx\5\6\4\2st\7\23\2\2tx\5\6\4\2uv\7\7"+
		"\2\2vx\5\6\4\2wm\3\2\2\2wo\3\2\2\2wq\3\2\2\2ws\3\2\2\2wu\3\2\2\2x\21\3"+
		"\2\2\2yz\7\27\2\2z{\5\6\4\2{|\5\6\4\2|\u0096\3\2\2\2}~\7\30\2\2~\177\5"+
		"\6\4\2\177\u0080\5\6\4\2\u0080\u0096\3\2\2\2\u0081\u0082\7\31\2\2\u0082"+
		"\u0083\5\6\4\2\u0083\u0084\5\6\4\2\u0084\u0096\3\2\2\2\u0085\u0086\7\32"+
		"\2\2\u0086\u0087\5\6\4\2\u0087\u0088\5\6\4\2\u0088\u0096\3\2\2\2\u0089"+
		"\u008a\7\21\2\2\u008a\u008b\5\6\4\2\u008b\u008c\5\6\4\2\u008c\u0096\3"+
		"\2\2\2\u008d\u008e\7\22\2\2\u008e\u008f\5\6\4\2\u008f\u0090\5\6\4\2\u0090"+
		"\u0096\3\2\2\2\u0091\u0092\7\b\2\2\u0092\u0093\5\6\4\2\u0093\u0094\5\6"+
		"\4\2\u0094\u0096\3\2\2\2\u0095y\3\2\2\2\u0095}\3\2\2\2\u0095\u0081\3\2"+
		"\2\2\u0095\u0085\3\2\2\2\u0095\u0089\3\2\2\2\u0095\u008d\3\2\2\2\u0095"+
		"\u0091\3\2\2\2\u0096\23\3\2\2\2\u0097\u0099\5\n\6\2\u0098\u0097\3\2\2"+
		"\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\25"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009f\5\6\4\2\u009e\u009d\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\27\3\2\2"+
		"\2\u00a2\u00a0\3\2\2\2\17\33)\65;HMQgkw\u0095\u009a\u00a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}