package ox.foppl.ast.binary;

import ox.foppl.ast.Expr;
import ox.foppl.misc.Position;
import ox.foppl.visitors.VisitorInterface;

public class Div extends BinaryFunction{
    public Div(Expr e1, Expr e2, Position p) {
        super(e1, e2, p);
    }

    @Override
    public String toString(){
        return String.format("(div %s %s)", e1, e2);
    }

}
