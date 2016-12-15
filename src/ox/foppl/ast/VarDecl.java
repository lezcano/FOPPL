package ox.foppl.ast;

import ox.foppl.misc.Position;

public class VarDecl extends ASTNode{
    public VarDecl(Identifier id, Expr expr, Position p) {
        super(p);
        this.id = id;
        this.expr = expr;
    }

    @Override
    public String toString() {
        return id.toString() + " " + expr.toString();
    }

    public Identifier getId() {
        return id;
    }

    private Identifier id;
    private Expr expr;
}
