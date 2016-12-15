package ox.foppl.ast;

import ox.foppl.misc.Position;
import ox.foppl.visitors.VisitorInterface;

/**
 * Created by lezkus on 6/12/16.
 */
public class If extends Expr{
    public If(Expr cond, Expr e1, Expr e2, Position p) {
        super(p);
        this.cond = cond;
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public String toString(){
        return String.format("(if %s %s %s)", cond, e1, e2);
    }

    private Expr cond, e1, e2;
}
