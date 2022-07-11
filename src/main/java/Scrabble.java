import java.util.HashMap;

public class Scrabble {

    int score;
    String wordInput;
    HashMap<Character, Integer> letterValues = new HashMap<Character, Integer>();
    Character[] doubleLetter;
    Character[] tripleLetter;
    boolean doubleWord;
    boolean tripleWord;

    public Scrabble(String value) {
        this.wordInput = value;
        this.score = 0;
        scoreCounter();
    }

    public Scrabble(String value, Character[] doubleLetter, Character[] tripleLetter, boolean doubleWord, boolean tripleWord) {
        this.wordInput = value;
        this.score = 0;
        scoreCounter();
        this.doubleWord = doubleWord;
        this.tripleWord = tripleWord;
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
        multiLetterWord();
        return score;
    }

    public void calculateScore() {
        char[] chars = this.wordInput.toCharArray();
        for (char aChar : chars) {
            if (letterValues != null && letterValues.containsKey(aChar)) {
                score += letterValues.get(aChar);
            }
        }
    }

    public void multiLetterWord() {
        calculateScore();
        if (doubleWord) {
            score = score * 2;
        } else if (tripleWord) {
            score = score * 3;
        }
    }
}