package ox.foppl.ast.binary;

import ox.foppl.ast.Expr;
import ox.foppl.misc.Position;
import ox.foppl.visitors.VisitorInterface;

public class Add extends BinaryFunction{
    public Add(Expr e1, Expr e2, Position p) {
        super(e1, e2, p);
    }

    @Override
    public String toString(){
        return String.format("(add %s %s)", e1, e2);
    }

}
