package ox.foppl.ast.binary;

import ox.foppl.ast.Expr;
import ox.foppl.misc.Position;

public abstract class BinaryFunction extends Expr{


    public BinaryFunction(Expr e1, Expr e2, Position p) {
        super(p);
        this.e1 = e1;
        this.e2 = e2;
    }

    protected Expr e1;
    protected Expr e2;
}
