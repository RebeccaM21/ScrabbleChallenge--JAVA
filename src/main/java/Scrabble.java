import com.sun.org.apache.bcel.internal.generic.DCONST;

import java.lang.reflect.Array;
import java.util.HashMap;

public class Scrabble {

    int score = 0;
    String wordInput;
    HashMap<Character, Integer> letterValues = new HashMap<Character, Integer>();

    public Scrabble(String value) {
        this.wordInput = value;
        this.score = this.score();
    }

    public Scrabble(String value, Character[] letter, Character[] letter2, boolean letterTrue, boolean letterFalse) {
        this.wordInput = value;
        this.score = 0;
//        arrOfStr = this.wordInput.split("");
    }

//    String[] arrOfStr = this.wordInput.split("");

    public int score() {
        if (this.wordInput == null) {
            return 0;
        }
        return this.score;
    }

    public int calculateScore () {
        String[] arrOfStr = this.wordInput.split("");
        for (String a : arrOfStr) {
            score += scoreCounter.get(a);
        }

        public int getScoreCounter(input) {
                letterValues.get(input)
        }
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
}

