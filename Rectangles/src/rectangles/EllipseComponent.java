package rectangles;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class EllipseComponent extends JComponent {


		@Override
		public void paintComponent(Graphics g) {
			Graphics2D g3 = (Graphics2D) g;
			Ellipse2D.Double ell = new Ellipse2D.Double(50, 50, 40, 40);
			g3.draw(ell);
			
		}
		
}
