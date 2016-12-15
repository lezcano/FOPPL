package ox.foppl.ast;

import ox.foppl.misc.Errors;
import ox.foppl.misc.Position;
import ox.foppl.visitors.VisitorCheckSemantics;
import ox.foppl.visitors.VisitorInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lezkus on 6/12/16.
 */
public class FuncDecl extends ASTNode{
    public FuncDecl(Identifier id, List<Identifier> args, List<Expr> body, Position p) {
        super(p);
        this.id = id;
        this.args = args;
        this.body = body;
    }

    @Override
    public void accept(VisitorCheckSemantics v) {
        Position p;
       if(v.idExists(id)){
           p = id.getPosition();
           Errors.printErr(String.format(
                   "The id %s declared in line %d column %d was already declared", id.getId(), p.l, p.c));
       }

       for(Identifier id : args){
           if(v.idExists(id) || id.equals(this.id) || argsMap.containsKey(id)){
               p = id.getPosition();
               Errors.printErr(String.format(
                       "The id %s declared in line %d column %d was already declared", id.getId(), p.l, p.c));
           }
           else{
               argsMap.put(id, new VarDecl(id, null, null));
           }
       }

       // TODO FINISH
    }

    @Override
    public String toString() {
        String ret = "(defn " + id.toString() + " [";
        for(Identifier e : args)
            ret += " " + e.toString();
        ret += "]";
        for(Expr e : body)
            ret += "\n  " + e.toString().replace("\n", "\n  ");
        ret += ")";
        return ret;
    }


    public Identifier getId() {
        return id;
    }

    private Identifier id;
    private List<Identifier> args;
    private List<Expr> body;

    private Map<Identifier, VarDecl> argsMap = new HashMap<>();
}
