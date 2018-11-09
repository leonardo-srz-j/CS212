/**
 *
 * @author Leo
 *
 */
public class Word {
    static int WORD_SIZE = 3;
    private String word;
    Word(String word) {
        if (word.length() != WORD_SIZE)
            throw new IllegalWordException(" "+ word);
        else
            this.word = word;
    }
    public static int getWordSize() {
        return WORD_SIZE;
    }
    /**
     *
     * @param wordSize
     */

    public static void setWordSize(int wordSize) {
        WORD_SIZE = wordSize;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String toString(){
        return word;
    }
}

