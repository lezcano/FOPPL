package ox.foppl.misc;

import org.antlr.v4.runtime.Token;

/**
 * Created by lezkus on 14/12/16.
 */
public class Position {
    public Position(int l, int c) {
        this.l = l;
        this.c = c;
    }

    public Position(Token t){
        this.l = t.getLine();
        this.c = t.getCharPositionInLine();
    }

    public int l, c;
}
