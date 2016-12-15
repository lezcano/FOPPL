package ox.foppl;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import ox.foppl.ast.Program;
import ox.foppl.visitors.BuildAST;

import java.io.FileInputStream;

/**
 * Created by lezkus on 6/12/16.
 */
public class Main {
    public static void main(String[] args) throws java.io.IOException{


        String path = "examples/example2.clj";

        FileInputStream fis = new FileInputStream(path);
        CharStream charStream = new ANTLRInputStream(fis);
        Program program = BuildAST.parse(charStream);
        System.out.println(program);

    }
}
