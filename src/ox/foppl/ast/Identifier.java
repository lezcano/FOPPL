package ox.foppl.ast;

import ox.foppl.misc.Position;
import ox.foppl.visitors.VisitorInterface;

/**
 * Created by lezkus on 6/12/16.
 */
public class Identifier extends Expr{

    public Identifier(String id, Position p) {
        super(p);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString(){
        return id;
    }

    private String id;
}
