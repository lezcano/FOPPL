package ox.foppl.visitors;

import org.antlr.v4.runtime.*;
import ox.foppl.ast.*;
import ox.foppl.ast.ConstFloat;
import ox.foppl.ast.binary.*;
import ox.foppl.ast.unary.*;
import ox.foppl.ast.unary.Sample;
import ox.foppl.gen.fopplBaseVisitor;
import ox.foppl.gen.fopplLexer;
import ox.foppl.gen.fopplParser;
import ox.foppl.misc.Position;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class BuildAST extends fopplBaseVisitor<Object> {


    public static Program parse(CharStream charStream) {
        fopplLexer lexer = new fopplLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        fopplParser parser = new fopplParser(tokens);

        return new BuildAST().visitProgram(parser.program());
    }

    @Override
    public Program visitProgram(fopplParser.ProgramContext ctx){
        // Rule: funcDecl* expr
        ArrayList<FuncDecl> funcs = ctx.funcDecl()
                .stream()
                .map(this::visitFuncDecl)
                .collect(Collectors.toCollection(ArrayList::new));

        Expr expr = (Expr)visit(ctx.expr());

        return new Program(funcs, expr, new Position(0,0));
    }

    @Override
    public FuncDecl visitFuncDecl(fopplParser.FuncDeclContext ctx){
        Identifier f = visitIdentifier(ctx.f);
        ArrayList<Identifier> args = visitIdList(ctx.idList());
        ArrayList<Expr> body =  new ArrayList<>();
        for(fopplParser.ExprContext e : ctx.expr())
            body.add((Expr) visit(e));
        Position p = new Position(ctx.DEFN().getSymbol());
        return new FuncDecl(f, args, body, p);
    }

    @Override
    public Identifier visitIdentifier(fopplParser.IdentifierContext ctx){
        Position p = new Position(ctx.IDENTIFIER().getSymbol());
        return new Identifier(ctx.IDENTIFIER().getText(), p);
    }

    @Override
    public ConstInt visitInt(fopplParser.IntContext ctx){
        Position p = new Position(ctx.INT().getSymbol());
        return new ConstInt(Integer.parseInt(ctx.INT().getText()), p);
    }

    @Override
    public ConstFloat visitFloat(fopplParser.FloatContext ctx){
        Position p = new Position(ctx.FLOAT().getSymbol());
        return new ConstFloat(java.lang.Float.parseFloat(ctx.FLOAT().getText()), p);
    }

    @Override
    public VarDecl visitVarDecl(fopplParser.VarDeclContext ctx){
        Identifier id = visitIdentifier(ctx.identifier());
        Expr e = (Expr) visit(ctx.expr());
        Position p = id.getPosition();
        return new VarDecl(id, e, p);
    }

    @Override
    public Expr visitConstExpr(fopplParser.ConstExprContext ctx){
        return (Expr) visit(ctx.constant());
    }

    @Override
    public Expr visitIdExpr(fopplParser.IdExprContext ctx){
        return (Expr) visit(ctx.identifier());
    }

    @Override
    public ArrayList<Expr> visitExprList(fopplParser.ExprListContext ctx){
        ArrayList<Expr> l = new ArrayList<>();
        for(fopplParser.ExprContext e : ctx.expr())
            l.add((Expr) visit(e));
        return l;
    }

    @Override
    public ArrayList<Identifier> visitIdList(fopplParser.IdListContext ctx) {
        return ctx.identifier()
                .stream()
                .map(this::visitIdentifier)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public Expr visitLetExpr(fopplParser.LetExprContext ctx){
        ArrayList<VarDecl> def = new ArrayList<>();
        ArrayList<Expr> exprs = new ArrayList<>();
        def.addAll(ctx.varDecl().stream().map(this::visitVarDecl).collect(Collectors.toList()));
        for(fopplParser.ExprContext e : ctx.expr())
            exprs.add((Expr) visit(e));
        Position p = new Position(ctx.LET().getSymbol());
        return new Let(def, exprs, p);
    }

    @Override
    public Expr visitPrimitiveCallExpr(fopplParser.PrimitiveCallExprContext ctx){
        return (Expr) visit(ctx.primitiveCall());
    }

    @Override
    public Expr visitFuncCallExpr(fopplParser.FuncCallExprContext ctx){
        Identifier id = visitIdentifier(ctx.identifier());
        ArrayList<Expr> args = new ArrayList<>();
        for(fopplParser.ExprContext e : ctx.expr())
            args.add((Expr) visit(e));
        Position p = id.getPosition();
        return new FunctionCall(id, args, p);
    }

    @Override
    public If visitIfExpr(fopplParser.IfExprContext ctx){
        Expr e1 = (Expr) visit(ctx.e1);
        Expr e2 = (Expr) visit(ctx.e2);
        Expr e3 = (Expr) visit(ctx.e3);
        Position p = new Position(ctx.IF().getSymbol());
        return new If(e1, e2, e3, p);
    }

    @Override
    public Loop visitLoopExpr(fopplParser.LoopExprContext ctx){
        Expr e1 = (Expr) visit(ctx.e1);
        Identifier f = visitIdentifier(ctx.id);
        Expr e2 = (Expr) visit(ctx.e2);
        ArrayList<Expr> args = visitExprList(ctx.exprList());
        Position p = new Position(ctx.LOOP().getSymbol());
        return new Loop(e1, f, e2, args, p);
    }

    @Override
    public Vector visitVectorExpr(fopplParser.VectorExprContext ctx){
        ArrayList<Expr> elems =  new ArrayList<>();
        for(fopplParser.ExprContext e : ctx.expr())
            elems.add((Expr) visit(e));
        Position p = new Position(ctx.VECTOR().getSymbol());
        return new Vector(elems, p);
    }

    @Override
    public Expr visitUnaryExpr(fopplParser.UnaryExprContext ctx){
        return visitUnaryFunction(ctx.unaryFunction());
    }

    @Override
    public Expr visitBinaryExpr(fopplParser.BinaryExprContext ctx){
        return visitBinaryFunction(ctx.binaryFunction());
    }

    @Override
    public Expr visitUnaryFunction(fopplParser.UnaryFunctionContext ctx){
        Expr e1 = (Expr) visit(ctx.expr());
        Position p = new Position(ctx.op);
        switch (ctx.op.getType()) {
            case fopplLexer.FIRST: return new First(e1, p);
            case fopplLexer.SECOND: return new Second(e1, p);
            case fopplLexer.LAST: return new Last(e1, p);
            case fopplLexer.SQRT: return new Sqrt(e1, p);
            case fopplLexer.SAMPLE: return new Sample(e1, p);
            default: throw new RuntimeException("This should never happen (Unary)");
        }
    }

    @Override
    public Expr visitBinaryFunction(fopplParser.BinaryFunctionContext ctx) {
        Expr lhs = (Expr) visit(ctx.lhs);
        Expr rhs = (Expr) visit(ctx.rhs);

        Position p = new Position(ctx.op);
        switch (ctx.op.getType()) {
            case fopplLexer.ADD: return new Add(lhs, rhs, p);
            case fopplLexer.SUB: return new Sub(lhs, rhs, p);
            case fopplLexer.MULT: return new Mult(lhs, rhs, p);
            case fopplLexer.DIV: return new Div(lhs, rhs, p);
            case fopplLexer.NORMAL: return new Normal(lhs, rhs, p);
            case fopplLexer.GAMMA: return new Gamma(lhs, rhs, p);
            case fopplLexer.OBSERVE: return new Observe(lhs, rhs, p);
            default:
                throw new RuntimeException("This should never happen (Binary)");
        }
    }




}
