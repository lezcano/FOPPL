package ox.foppl.ast;

import ox.foppl.misc.Position;

import java.util.List;

public class Vector extends Expr{
    public Vector(List<Expr> exprs, Position p){
        super(p);
        this.exprs = exprs;
    }

    public List<Expr> getExprs() { return exprs; }

    @Override
    public String toString(){
        String ret = "(vector";
        for(Expr e : exprs){
            ret += " " + e.toString();
        }
        ret += ")";
        return ret;
    }

    private List<Expr> exprs;
}
