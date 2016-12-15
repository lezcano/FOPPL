package ox.foppl.ast;

import ox.foppl.misc.Position;
import ox.foppl.visitors.VisitorInterface;

/**
 * Created by lezkus on 6/12/16.
 */
public class ConstInt extends Expr{

    public ConstInt(int val, Position p) {
        super(p);
        this.val = val;
    }

    @Override
    public String toString(){
        return String.valueOf(val);
    }

    private int val;
}
