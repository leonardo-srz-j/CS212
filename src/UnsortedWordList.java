import java.awt.event.ActionEvent;
/**
 *
 * @author Leo
 *
 */
public class UnsortedWordList extends WordList {
    public UnsortedWordList() {
        WordNode ln = new WordNode (null);
        this.first = ln;
        this.last = ln;
        length = 0;
    }

    public void add(Word w) {
        WordNode n = new WordNode(w);
        last.next = n;
        last = n;
        length++;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }
}