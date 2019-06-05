package cumulative.poetry;

import java.util.Arrays;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        IPoet poet;
        Parser parser = new Parser(args);
        String output = "";
        if (parser.isRecite) {
            poet= parser.isEcho ?  new PoetWithEcho(new Poem()) :  new PoetWithoutEcho(new Poem());
            output = poet.recite(parser);
        }
        if (parser.isRevealForDay) {
           poet= parser.isEcho ?   new PoetWithEcho(new Poem()): new PoetWithEcho(new Poem());
            output = poet.revealForTheDay(parser.day);
        }

        System.out.print(output);
    }
}
