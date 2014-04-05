package rectangles;


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
		

		EllipseComponent oval = new EllipseComponent();
		frame.add(component);
		
		
	}

}
