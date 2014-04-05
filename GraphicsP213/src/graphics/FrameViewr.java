package graphics;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameViewr {
public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        JLabel label = new JLabel("Hello, Jonathan!");
        label.setOpaque(true);
        label.setBackground(Color.green);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    
    }   
}
