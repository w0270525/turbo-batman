package rectangles;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Frame {

	public static void main(String[] args) {
		//The frame (window)
		JFrame frame = new JFrame();
		frame.setSize(300, 300);
		frame.setTitle("Hello, World!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		RectangleComponent component = new RectangleComponent();
		frame.add(component);
		
		JFrame frame2 = new JFrame();
		
		frame2.setTitle("second window");
		
		
	}

}
