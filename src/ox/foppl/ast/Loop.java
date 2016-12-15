package ox.foppl.ast;

import ox.foppl.misc.Position;

import java.util.List;

/**
 * Created by lezkus on 6/12/16.
 */
public class Loop extends Expr{

    public Loop(Expr times, Identifier f, Expr init, List<Expr> args, Position p) {
        super(p);
        this.times = times;
        this.f = f;
        this.init = init;
        this.args = args;
    }

    @Override
    public String toString() {
        String ret = String.format("(loop %s %s %s", times, f, init);
        for(Expr e : args)
            ret += " " + e.toString();
        ret += ")";
        return ret;
    }

    private Expr times;
    private Identifier f;
    private Expr init;
    private List<Expr> args;
}
