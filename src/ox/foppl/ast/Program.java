package ox.foppl.ast;

import ox.foppl.misc.Position;
import ox.foppl.visitors.VisitorCheckSemantics;

import java.util.List;

/**
 * Created by lezkus on 6/12/16.
 */
public class Program extends ASTNode{

    public Program(List<FuncDecl> decl, Expr expr, Position p) {
        super(p);
        this.decl = decl;
        this.expr = expr;
    }

    @Override
    public void accept(VisitorCheckSemantics v) {
        for(FuncDecl f : decl)
            f.accept(v);
        expr.accept(v);

    }

    @Override
    public String toString(){
        String ret = "";
        for(FuncDecl f : decl){
            ret += f.toString() + "\n";
        }
        return ret + expr.toString();
    }



    private List<FuncDecl> decl;
    private Expr expr;
}
