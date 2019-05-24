package cumulative.poetry;

import java.lang.reflect.Array;
import java.util.*;

public class Poem {
    List<String> lines;

    public Poem() {

         String[] arrayOfString = new String[]{"the house that Jack built",
                "the malt that lay in",
                "the rat that ate",
                "the cat that killed",
                "the dog that worried",
                "that cow with the crumpled horn that tossed",
                "the maiden all forlorn that milked",
                "the man all tattered and torn that kissed",
                "the priest all shaven and shorn that married",
                "the rooster that crowed in the morn that woke",
                "the farmer sowing his corn that kept",
                "the horse and the hound and the horn that belonged to"};
         lines = Arrays.asList(arrayOfString);
    }
}
