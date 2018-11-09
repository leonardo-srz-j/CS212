import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Leo
 *
 */
public class WordGUI extends JFrame {
    static JFrame myFrame;
    static Container cPane;
    static TextArea sorted, unsorted;

    public static void frameGUI() {
        initialize();
        createFileMenu();
        myFrame.setLayout(new GridLayout(1, 2));
        myFrame.setTitle("Project 3");
        cPane = myFrame.getContentPane();
        cPane.add(unsorted);
        cPane.add(sorted);
        WordGUI.unsorted.append("Unsorted" + "\n");
        WordGUI.sorted.append("Sorted:" + "\n");
        WordGUI.myFrame.setVisible(true);
    }

    public static void initialize() { //initialize GUI panel
        sorted = new TextArea();
        unsorted = new TextArea();
        myFrame = new JFrame();
        myFrame.setSize(400, 400);
        myFrame.setLocation(200, 200);
        myFrame.setTitle("");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static void createFileMenu() {
        JMenuItem item;
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        FileMenuHandler fmh = new FileMenuHandler(myFrame);

        item = new JMenuItem("Open");    //Open...
        item.addActionListener(fmh);
        fileMenu.add(item);

        fileMenu.addSeparator();           //add a horizontal separator line

        item = new JMenuItem("Quit");       //Quit
        item.addActionListener(fmh);
        fileMenu.add(item);
        menuBar.add(fileMenu);
        myFrame.setJMenuBar(menuBar);
    } //createMenu
}

