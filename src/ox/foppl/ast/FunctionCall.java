package ox.foppl.ast;

import ox.foppl.misc.Position;
import ox.foppl.visitors.VisitorInterface;

import java.util.List;

/**
 * Created by lezkus on 6/12/16.
 */
public class FunctionCall extends Expr{

    public FunctionCall(Identifier id, List<Expr> args, Position p) {
        super(p);
        this.id = id;
        this.args = args;
    }

    @Override
    public String toString() {
        String ret = "(" + id.toString();
        for(Expr e : args)
            ret += " " + e.toString();
        ret += ")";
        return ret;
    }


    private Identifier id;
    private List<Expr> args;
}
