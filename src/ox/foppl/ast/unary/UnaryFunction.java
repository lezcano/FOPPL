package ox.foppl.ast.unary;

import ox.foppl.ast.Expr;
import ox.foppl.misc.Position;

/**
 * Created by lezkus on 6/12/16.
 */
public abstract class UnaryFunction extends Expr{
    public UnaryFunction(Expr e, Position p) {
        super(p);
        this.e = e;
    }

    protected Expr e;
}
