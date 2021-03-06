/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cumulative.poetry;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PoetTest {
    PoetWithoutEcho poetWithoutEcho;
    PoetWithEcho poetWithEcho;

    @Before
    public void setup() {
        poetWithoutEcho = new PoetWithoutEcho(new Poem());
        poetWithEcho = new PoetWithEcho(new Poem());
    }

    @Test
    public void testRevealForSpecifiedDay() {
        assertEquals("This is the malt that lay in\n\t" + "the house that Jack built.", poetWithoutEcho.revealForTheDay(2));
    }

    @Test
    public void testRecite() {
        assertEquals("Day 1 -This is the house that Jack built.\n" +
                "\t\n" +
                "Day 2 -This is the malt that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\t\n" +
                "Day 3 -This is the rat that ate\n" +
                "\tthe malt that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\t\n" +
                "Day 4 -This is the cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malt that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\t\n" +
                "Day 5 -This is the dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malt that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\t\n" +
                "Day 6 -This is that cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malt that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\t\n" +
                "Day 7 -This is the maiden all forlorn that milked\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malt that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\t\n" +
                "Day 8 -This is the man all tattered and torn that kissed\n" +
                "\tthe maiden all forlorn that milked\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malt that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\t\n" +
                "Day 9 -This is the priest all shaven and shorn that married\n" +
                "\tthe man all tattered and torn that kissed\n" +
                "\tthe maiden all forlorn that milked\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malt that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\t\n" +
                "Day 10 -This is the rooster that crowed in the morn that woke\n" +
                "\tthe priest all shaven and shorn that married\n" +
                "\tthe man all tattered and torn that kissed\n" +
                "\tthe maiden all forlorn that milked\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malt that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\t\n" +
                "Day 11 -This is the farmer sowing his corn that kept\n" +
                "\tthe rooster that crowed in the morn that woke\n" +
                "\tthe priest all shaven and shorn that married\n" +
                "\tthe man all tattered and torn that kissed\n" +
                "\tthe maiden all forlorn that milked\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malt that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\t\n" +
                "Day 12 -This is the horse and the hound and the horn that belonged to\n" +
                "\tthe farmer sowing his corn that kept\n" +
                "\tthe rooster that crowed in the morn that woke\n" +
                "\tthe priest all shaven and shorn that married\n" +
                "\tthe man all tattered and torn that kissed\n" +
                "\tthe maiden all forlorn that milked\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malt that lay in\n" +
                "\tthe house that Jack built.", poetWithoutEcho.recite(new Parser(new String[]{"--recite"})));
    }

    @Test
    public void testEchoForReveal() {
        assertEquals("This is the malt that lay in\n" +
                "\tthe malt that lay in\n" +
                "\tthe house that Jack built\n" +
                "\tthe house that Jack built.", poetWithEcho.revealForTheDay(2));
    }

    @Test
    public void testEchoforRecite() {
        assertEquals("Day 1 -This is the house that Jack built\n" +
                "\tthe house that Jack built.\n" +
                "\t\n" +
                "Day 2 -This is the malt that lay in\n" +
                "\tthe malt that lay in\n" +
                "\tthe house that Jack built\n" +
                "\tthe house that Jack built.\n" +
                "\t\n" +
                "Day 3 -This is the rat that ate\n" +
                "\tthe rat that ate\n" +
                "\tthe malt that lay in\n" +
                "\tthe malt that lay in\n" +
                "\tthe house that Jack built\n" +
                "\tthe house that Jack built.\n" +
                "\t\n" +
                "Day 4 -This is the cat that killed\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe rat that ate\n" +
                "\tthe malt that lay in\n" +
                "\tthe malt that lay in\n" +
                "\tthe house that Jack built\n" +
                "\tthe house that Jack built.\n" +
                "\t\n" +
                "Day 5 -This is the dog that worried\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe rat that ate\n" +
                "\tthe malt that lay in\n" +
                "\tthe malt that lay in\n" +
                "\tthe house that Jack built\n" +
                "\tthe house that Jack built.\n" +
                "\t\n" +
                "Day 6 -This is that cow with the crumpled horn that tossed\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe rat that ate\n" +
                "\tthe malt that lay in\n" +
                "\tthe malt that lay in\n" +
                "\tthe house that Jack built\n" +
                "\tthe house that Jack built.\n" +
                "\t\n" +
                "Day 7 -This is the maiden all forlorn that milked\n" +
                "\tthe maiden all forlorn that milked\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe rat that ate\n" +
                "\tthe malt that lay in\n" +
                "\tthe malt that lay in\n" +
                "\tthe house that Jack built\n" +
                "\tthe house that Jack built.\n" +
                "\t\n" +
                "Day 8 -This is the man all tattered and torn that kissed\n" +
                "\tthe man all tattered and torn that kissed\n" +
                "\tthe maiden all forlorn that milked\n" +
                "\tthe maiden all forlorn that milked\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe rat that ate\n" +
                "\tthe malt that lay in\n" +
                "\tthe malt that lay in\n" +
                "\tthe house that Jack built\n" +
                "\tthe house that Jack built.\n" +
                "\t\n" +
                "Day 9 -This is the priest all shaven and shorn that married\n" +
                "\tthe priest all shaven and shorn that married\n" +
                "\tthe man all tattered and torn that kissed\n" +
                "\tthe man all tattered and torn that kissed\n" +
                "\tthe maiden all forlorn that milked\n" +
                "\tthe maiden all forlorn that milked\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe rat that ate\n" +
                "\tthe malt that lay in\n" +
                "\tthe malt that lay in\n" +
                "\tthe house that Jack built\n" +
                "\tthe house that Jack built.\n" +
                "\t\n" +
                "Day 10 -This is the rooster that crowed in the morn that woke\n" +
                "\tthe rooster that crowed in the morn that woke\n" +
                "\tthe priest all shaven and shorn that married\n" +
                "\tthe priest all shaven and shorn that married\n" +
                "\tthe man all tattered and torn that kissed\n" +
                "\tthe man all tattered and torn that kissed\n" +
                "\tthe maiden all forlorn that milked\n" +
                "\tthe maiden all forlorn that milked\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe rat that ate\n" +
                "\tthe malt that lay in\n" +
                "\tthe malt that lay in\n" +
                "\tthe house that Jack built\n" +
                "\tthe house that Jack built.\n" +
                "\t\n" +
                "Day 11 -This is the farmer sowing his corn that kept\n" +
                "\tthe farmer sowing his corn that kept\n" +
                "\tthe rooster that crowed in the morn that woke\n" +
                "\tthe rooster that crowed in the morn that woke\n" +
                "\tthe priest all shaven and shorn that married\n" +
                "\tthe priest all shaven and shorn that married\n" +
                "\tthe man all tattered and torn that kissed\n" +
                "\tthe man all tattered and torn that kissed\n" +
                "\tthe maiden all forlorn that milked\n" +
                "\tthe maiden all forlorn that milked\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe rat that ate\n" +
                "\tthe malt that lay in\n" +
                "\tthe malt that lay in\n" +
                "\tthe house that Jack built\n" +
                "\tthe house that Jack built.\n" +
                "\t\n" +
                "Day 12 -This is the horse and the hound and the horn that belonged to\n" +
                "\tthe horse and the hound and the horn that belonged to\n" +
                "\tthe farmer sowing his corn that kept\n" +
                "\tthe farmer sowing his corn that kept\n" +
                "\tthe rooster that crowed in the morn that woke\n" +
                "\tthe rooster that crowed in the morn that woke\n" +
                "\tthe priest all shaven and shorn that married\n" +
                "\tthe priest all shaven and shorn that married\n" +
                "\tthe man all tattered and torn that kissed\n" +
                "\tthe man all tattered and torn that kissed\n" +
                "\tthe maiden all forlorn that milked\n" +
                "\tthe maiden all forlorn that milked\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe rat that ate\n" +
                "\tthe malt that lay in\n" +
                "\tthe malt that lay in\n" +
                "\tthe house that Jack built\n" +
                "\tthe house that Jack built.", poetWithEcho.recite(new Parser(new String[]{"--recite", "--echo"})));
    }

}
