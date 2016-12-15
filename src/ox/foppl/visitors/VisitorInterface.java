package ox.foppl.visitors;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import ox.foppl.ast.*;
import ox.foppl.ast.binary.*;
import ox.foppl.ast.unary.*;
import ox.foppl.ast.unary.Sample;
import ox.foppl.gen.fopplBaseVisitor;
import ox.foppl.gen.fopplLexer;
import ox.foppl.gen.fopplParser;
import ox.foppl.misc.Position;

import java.util.ArrayList;
import java.util.stream.Collectors;

public interface VisitorInterface<T>{


    public T visit(Program p);
    public T visit(FuncDecl f);
    public T visit(Let l);
    public T visit(FunctionCall f);
    public T visit(ConstInt n);
    public T visit(ConstFloat f);

    // Expr
    public T visit(Expr e);
    public T visit(Identifier id);
    public T visit(VarDecl v);
    public T visit(If e);
    public T visit(Loop e);
    public T visit(Vector v);

    // Binary
    public T visit(Add v);
    public T visit(Sub v);
    public T visit(Mult v);
    public T visit(Div v);
    public T visit(Gamma v);
    public T visit(Normal v);
    public T visit(Observe v);

    // Unary
    public T visit(First v);
    public T visit(Second v);
    public T visit(Last v);
    public T visit(Sample v);
    public T visit(Sqrt v);
}
