package cumulative.poetry;

public class PoetWithoutEcho implements IPoet {
    Poem poem;

    PoetWithoutEcho(Poem poem) {
        this.poem = poem;
    }

    @Override
    public String recite(Parser parser) {
        String recite = "";
        for (int index = 1; index <= parser.day; index++) {
            recite = recite + "Day " + index + " -";
            recite = recite + revealForTheDay(index) + "\n\t\n";
        }
        return recite.trim();
    }

    public String revealForTheDay(int day) {
        String recitePhrase = "This is ";
        for (int index = day - 1; index >= 0; index--) {
            if (index == 0) {
                recitePhrase = recitePhrase + poem.lines.get(index) + ".";
                return recitePhrase.trim();
            } else {
                recitePhrase = recitePhrase + poem.lines.get(index) + "\n\t";
            }
        }
        return recitePhrase.trim();
    }
}
