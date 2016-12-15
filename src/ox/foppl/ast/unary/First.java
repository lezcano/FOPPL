package ox.foppl.ast.unary;

import ox.foppl.ast.Expr;
import ox.foppl.misc.Position;
import ox.foppl.visitors.VisitorInterface;

/**
 * Created by lezkus on 6/12/16.
 */
public class First extends UnaryFunction{
    public First(Expr e, Position p) {
        super(e, p);
    }

    @Override
    public String toString(){
        return String.format("(first %s)", e);
    }
}
