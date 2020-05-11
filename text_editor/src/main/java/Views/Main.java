package Views;

import javax.swing.*;
import java.awt.event.ActionListener;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;

public class Main extends JFrame {

    private JPanel panel1;
    private JButton saveButton;
    private JTextField pathField;
    private JButton loadButton;
    private JTextArea textField;
    private JButton searchButton;
    private JButton nextButton;
    private JButton previousButton;
    private JLabel wordsCounter;
    private JFrame jFrame;

    private JMenuBar menuBarField;
    private JMenu menuFileButton,
            menuSearchButton;
    private JMenuItem saveMenuButton;
    private JMenuItem loadMenuButton;
    private JMenuItem exitMenuButton;

    private JMenuItem searchMenuButton;
    private JMenuItem nextMenuButton;
    private JMenuItem previousMenuButton;



    public Main() {}

    public void setSaveButton(ActionListener actionListener) {
        saveButton.addActionListener(actionListener);
    }
    public void setLoadButton(ActionListener actionListener) {
        loadButton.addActionListener(actionListener);
    }
    public void setSearchButton(ActionListener actionListener) {
        searchButton.addActionListener(actionListener);
    }
    public void setNextButton(ActionListener actionListener) {
        nextButton.addActionListener(actionListener);
    }
    public void setPreviousButton(ActionListener actionListener) {
        previousButton.addActionListener(actionListener);
    }


    public void setSaveMenuButton(ActionListener actionListener) { saveMenuButton.addActionListener(actionListener);}
    public void setLoadMenuButton(ActionListener actionListener) { loadMenuButton.addActionListener(actionListener);}
    public void setExitMenuButton(ActionListener actionListener) { exitMenuButton.addActionListener(actionListener);}

    public void setSearchMenuButton(ActionListener actionListener) { searchMenuButton.addActionListener(actionListener);}
    public void setNextMenuButton(ActionListener actionListener) { nextMenuButton.addActionListener(actionListener);}
    public void setPreviousMenuButton(ActionListener actionListener) { previousMenuButton.addActionListener(actionListener);}



    public void showMenuBar(JFrame frame) {
        menuBarField = new JMenuBar();

        //File Menu
        menuFileButton = new JMenu("File");
        menuFileButton.setMnemonic(KeyEvent.VK_F);

        menuBarField.add(menuFileButton);

        saveMenuButton = new JMenuItem("Save", KeyEvent.VK_S);
        saveMenuButton.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_S, InputEvent.CTRL_MASK));
        menuFileButton.add(saveMenuButton);

        loadMenuButton = new JMenuItem("Load", KeyEvent.VK_O);
        loadMenuButton.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_O, InputEvent.CTRL_MASK));
        menuFileButton.add(loadMenuButton);

        menuFileButton.addSeparator();

        exitMenuButton = new JMenuItem("Exit", KeyEvent.VK_E);
        menuFileButton.add(exitMenuButton);


        //Search Menu
        menuSearchButton = new JMenu("Search");
        menuSearchButton.setMnemonic(KeyEvent.VK_S);
        menuBarField.add(menuSearchButton);

        searchMenuButton = new JMenuItem("Search", KeyEvent.VK_S);
        searchMenuButton.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK));
        menuSearchButton.add(searchMenuButton);

        menuSearchButton.addSeparator();

        nextMenuButton = new JMenuItem("Next Match", KeyEvent.VK_N);
        nextMenuButton.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
        menuSearchButton.add(nextMenuButton);

        previousMenuButton = new JMenuItem("Previous Match", KeyEvent.VK_P);
        previousMenuButton.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
        menuSearchButton.add(previousMenuButton);
    }
    public void show(JFrame frame) {
        frame.setTitle("Text Editor");
        File file = new File("");
        ImageIcon imageIcon = new ImageIcon(file.getAbsolutePath() + "\\src\\main\\resources\\2.png");
        frame.setIconImage(imageIcon.getImage());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(panel1);

        frame.setSize(800, 500);

        frame.setJMenuBar(menuBarField);
        frame.setVisible(true);
    }



    public JTextField getPathField() {
        return pathField;
    }
    public JTextArea getTextField() {
        return textField;
    }
    public JLabel getWordsCounter() {
        return wordsCounter;
    }
}
