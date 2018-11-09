import java.util.Comparator;


/**
 * Created by Leo on 5/9/17.
 */
public class WordComparator implements Comparator <Word> {
    public int compare(Word w1, Word w2){
        return w1.getWord().compareTo(w2.getWord());
    }
}
