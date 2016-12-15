package ox.foppl.ast;

import ox.foppl.misc.Position;
import ox.foppl.visitors.VisitorCheckSemantics;

/**
 * Created by lezkus on 14/12/16.
 */
public abstract class ASTNode {

    public abstract void accept(VisitorCheckSemantics v);

    public ASTNode(Position p) {
        this.p = p;
    }

    public abstract String toString();

    public Position getPosition() {
        return p;
    }

    protected Position p ;
}
