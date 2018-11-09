import java.awt.event.ActionListener;
/**
 *
 * @author Leo
 *
 */
abstract public class WordList implements ActionListener {
    WordNode data = new WordNode();
    protected WordNode first;
    protected WordNode last;
    protected int length;

    public WordList(){
        this.first = data;
        this.last = data;
        length = 0;
    }
    public String toString(){
        WordNode p = first.next;
        String input = "";
        while(p != null){
            input+=p.data.toString() + "\n";
            p = p.next;
        }
        return input;
    }
}
