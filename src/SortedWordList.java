import java.awt.event.ActionEvent;
/**
 *
 * @author Leo
 *
 */
public class SortedWordList extends WordList {
    public SortedWordList(){
        WordNode ln = new WordNode(null);
        this.first = ln;
        this.last = ln;
        length = 0;
    }

    public void add (Word w){
        WordNode n = new WordNode(w);
        WordNode head = first;
        WordNode second = first.next;

        while(second != null && second.data.getWord().compareToIgnoreCase(w.getWord())<0){
            second = second.next;
            head = head.next;
        }
        if (second == null){
            last.next = n;
            last = n;
        }
        else{
            n.next = second;
            head.next = n;
        }
        length++;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }
}
