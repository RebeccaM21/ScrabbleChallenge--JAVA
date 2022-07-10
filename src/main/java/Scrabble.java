import java.util.HashMap;
import java.util.Map;

public class Scrabble {

    int score;
    String wordInput;
    HashMap<Character, Integer> letterValues = new HashMap<Character, Integer>();

    public Scrabble(String value) {
        this.wordInput = value;
        this.score = 0;
        scoreCounter();
    }

    public Scrabble(String value, Character[] letter, Character[] letter2, boolean letterTrue, boolean letterFalse) {
        this.wordInput = value;
    }

    public void scoreCounter() {
        letterValues.put('A', 1);
        letterValues.put('E', 1);
        letterValues.put('I', 1);
        letterValues.put('O', 1);
        letterValues.put('U', 1);
        letterValues.put('L', 1);
        letterValues.put('N', 1);
        letterValues.put('R', 1);
        letterValues.put('S', 1);
        letterValues.put('T', 1);
        letterValues.put('D', 2);
        letterValues.put('G', 2);
        letterValues.put('B', 3);
        letterValues.put('C', 3);
        letterValues.put('M', 3);
        letterValues.put('P', 3);
        letterValues.put('F', 4);
        letterValues.put('H', 4);
        letterValues.put('V', 4);
        letterValues.put('W', 4);
        letterValues.put('Y', 4);
        letterValues.put('K', 5);
        letterValues.put('J', 8);
        letterValues.put('X', 8);
        letterValues.put('Q', 10);
        letterValues.put('Z', 10);
    }


    public int score() {
        if (this.wordInput == null) {
            return 0;
        }
        this.wordInput = this.wordInput.toUpperCase();

        char[] chars = this.wordInput.toCharArray();

        for (char aChar : chars) {
            if (letterValues != null && letterValues.containsKey(aChar)) {
                score += letterValues.get(aChar);
            }
        }
        return score;
    }
}