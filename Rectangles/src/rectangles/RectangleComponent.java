package rectangles;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class RectangleComponent extends JComponent {

    public void paintComponent(Graphics g) {
	// Drawing instructions
	Graphics2D g2 = (Graphics2D) g;
	Rectangle box = new Rectangle(5, 10, 20, 30);
	g2.draw(box);

	box.translate(25, 25);
	g2.draw(box);

	Graphics2D g3 = (Graphics2D) g;
	Ellipse2D.Double ell = new Ellipse2D.Double(50, 50, 40, 40);
	g3.draw(ell);

    }
}
