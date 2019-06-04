package cumulative.poetry;

import java.util.Arrays;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        Poet poet = new Poet(new Poem());
        Parser parser = new Parser(args);
        String output = "";
        if(parser.isRecite){
            output = poet.recite(parser.day,parser.isEcho);
        }
        if(parser.isRevealForDay){
           output = poet.revealForTheDay(parser.day,parser.isEcho);
        }
        System.out.print(output);
    }
}
