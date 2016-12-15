package ox.foppl.ast;

import ox.foppl.misc.Position;
import ox.foppl.visitors.VisitorInterface;

/**
 * Created by lezkus on 6/12/16.
 */
public abstract class Expr extends ASTNode{

    public Expr(Position p) {
        super(p);
    }


}
