package ox.foppl.ast.binary;

import ox.foppl.ast.Expr;
import ox.foppl.misc.Position;
import ox.foppl.visitors.VisitorInterface;

public class Mult extends BinaryFunction{
    public Mult(Expr e1, Expr e2, Position p) {
        super(e1, e2, p);
    }

    @Override
    public String toString(){
        return String.format("(mult %s %s)", e1, e2);
    }

}
