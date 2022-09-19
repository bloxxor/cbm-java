package Basics;
import java.awt.*; import javax.swing.*;

public class Playground {

    public static void main(String[] args) {
        createWindow();
    }

    private static void createWindow() {

        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel textlabel = new JLabel("I`m a label!", SwingConstants.CENTER);
        textlabel.setPreferredSize( new Dimension(300, 100));
        frame.getContentPane().add(textlabel, BorderLayout.CENTER);

        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);

    }

}
