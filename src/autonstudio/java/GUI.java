package autonstudio.java;

import javax.swing.*;
import java.awt.*;

public class GUI {

    private ImageIcon imageA;
    private JLabel labelA;

    public static void main ( String [] args ) {
            JFrame frame = new JFrame("My First GUI");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800,800);
            JButton button = new JButton("Press");
            frame.getContentPane().add(button); // Adds Button to content pane of frame
            frame.setVisible(true);
        }
    }

/*class Image extends JFrame {
    private ImageIcon imageA;
    private JLabel labelA;
    private ImageIcon imageB;
    private JLabel labelB;

    public Image (){
        setLayout(new FlowLayout());

    }
}
*/



