package cumulative.poetry;

import java.util.Arrays;
import java.util.List;

public class Parser {

    public boolean isRecite;
    public boolean isEcho;
    public boolean isRevealForDay;
    public int day;
    public Parser(String[] args) {
        List argsAsList = Arrays.asList(args);
        if (!argsAsList.isEmpty()) {
            if (argsAsList.contains("--echo")) {
                isEcho = true;
            }
            if (argsAsList.contains("--reveal-for-day")) {
                isRevealForDay = true;
                day = Integer.parseInt((String) argsAsList.get(argsAsList.indexOf("--reveal-for-day") + 1));
            }
            if (argsAsList.contains("--recite")) {
                isRecite = true;
                day = 12;
            }
        }
    }

}
