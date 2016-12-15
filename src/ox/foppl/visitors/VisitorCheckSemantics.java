package ox.foppl.visitors;

import ox.foppl.ast.*;
import ox.foppl.ast.binary.*;
import ox.foppl.ast.unary.*;
import ox.foppl.ast.unary.Sample;

import java.util.Map;

/**
 * Created by lezkus on 14/12/16.
 */
public class VisitorCheckSemantics {


    public void addFunc(FuncDecl f){
        funcs.put(f.getId(), f);
    }

    public void addVar(VarDecl v){
        funcs.put(v.getId(), v);
    }

    public boolean idExists(Identifier id){
        String sid = id.getId();
        return funcs.containsKey(sid) || vars.containsKey(sid);

    }

    Map<String, FuncDecl> funcs;
    Map<String, VarDecl> vars;
}
