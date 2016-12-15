package ox.foppl.ast;

import ox.foppl.misc.Position;
import ox.foppl.visitors.VisitorInterface;

import java.util.List;

/**
 * Created by lezkus on 6/12/16.
 */
public class Let extends Expr{

    public Let(List<VarDecl> decl, List<Expr> exprs, Position p) {
        super(p);
        this.decl = decl;
        this.exprs = exprs;
    }

    @Override
    public String toString() {
        String ret = "(let [" + decl.get(0).toString();
        for(int i = 1; i < decl.size(); ++i)
            ret += "\n      " + decl.get(i).toString();
        ret += "]";

        for(Expr e : exprs)
            ret += "\n  " + e.toString();
        ret += ")";
        return ret;
    }

    private List<VarDecl> decl;
    private List<Expr> exprs;
}
