import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.Iterator;

/**
 *
 * @author Leo
 *
 */
public class FileMenuHandler implements ActionListener {
    JFrame jframe;

    public FileMenuHandler (JFrame jf) {jframe = jf;}

    public void actionPerformed(ActionEvent event){
        String menuName = event.getActionCommand();
        if (menuName.equals("Open"))
            openFile();

        else if (menuName.equals("Quit")){
            JOptionPane.showMessageDialog(null,"You clicked on Quit");
            System.exit(0);
        }
    } //actionPerformed

    private void openFile( ){
        JFileChooser chooser;
        int status;
        chooser = new JFileChooser( );
        status = chooser.showOpenDialog(null);
        // File f = chooser.getSelectedFile();
        if (status == JFileChooser.APPROVE_OPTION){

            try {
                reader(chooser.getSelectedFile());
            } catch (FileNotFoundException fnfe) {
                System.out.println(fnfe);
            }

        }
        else
            JOptionPane.showMessageDialog(null, "Open File dialog canceled");
    } //openFile
    /**
     *
     * @param fileName
     * @throws FileNotFoundException
     */
    public static void reader (File fileName) throws FileNotFoundException{
        Scanner fileInput = new Scanner(fileName);
        UnsortedWordList unsortedList = new UnsortedWordList();
        TreeMap <Word, Word> sortedList = new TreeMap (new WordComparator());
        String wordsInFile;
        System.out.println("List of invalid words: ");
        while (fileInput.hasNext())
        {
            wordsInFile = fileInput.nextLine();
            StringTokenizer st = new StringTokenizer(wordsInFile, ",");
            String token;
            while (st.hasMoreTokens()) {
                token = st.nextToken();

                if (token.length() == Word.WORD_SIZE) //checks if the length of the word is 3
                {
                    Word word = new Word(token);
                    unsortedList.add(word);//adds words as they come from the file into fileList
                    sortedList.put(word, word);//adds and sorts words into a sortedList
                } //if
                else System.out.println(token);
            } //while there is more tokens on the line
        }//while file has next
        fileInput.close();

        Iterator itr;
        itr = sortedList.keySet().iterator();
        while (itr.hasNext()) WordGUI.sorted.append(itr.next() + "\n");

        WordGUI.unsorted.append(unsortedList.toString());
    }
}






