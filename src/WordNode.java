public class WordNode {
    protected Word data;
    protected WordNode next;

    public WordNode(Word w) {
        this.data = w;
        this.next = null;
    }

    public WordNode() {
        this.data = null;
        this.next = null;
    }
}
