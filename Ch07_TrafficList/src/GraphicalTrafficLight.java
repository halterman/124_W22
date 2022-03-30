import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/** 
 * The drawing surface upon which the traffic light image 
 * will be rendered
 */
class TrafficLightPanel extends JPanel {
    /** The traffic light object */
	private TrafficLight light;
    /** The size of the drawing surface */
	private Dimension dimension;
	
    /**
     * Creates a visual traffic light
     * @param width the width of the light
     * @param height the height of the light
     */
	public TrafficLightPanel(int width, int height) {
		light = new TrafficLight();
		dimension = new Dimension(width, height);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent ev) {
				light.change();
				repaint();
			}
		});
	}
	
    /**
     * Renders the traffic light object in the graphical window.
     */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
        LightColor currentState = light.get();
		// Draw frame
		g.setColor(Color.GRAY);
		g.fillRect(20, 20, 200, 480);
        // Illunimate red lamp?
		if (currentState == LightColor.RED) {
			g.setColor(Color.RED);
		} else {
			g.setColor(Color.BLACK);
		}
        // Illuminate yellow lamp?
		g.fillOval(60, 60, 120, 120);
		if (currentState == LightColor.YELLOW) {
			g.setColor(Color.YELLOW);
		} else {
			g.setColor(Color.BLACK);
		}
        // Illuminate green lamp?
		g.fillOval(60, 200, 120, 120);
		if (currentState == LightColor.GREEN) {
			g.setColor(Color.GREEN);
		} else {
			g.setColor(Color.BLACK);
		}
		g.fillOval(60, 340, 120, 120);
	}

    /**
     * Returns the size of the drawing surface
     */
	@Override
	public Dimension getPreferredSize() {
	    return dimension;
	}
}

public class GraphicalTrafficLight {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			JFrame window = new JFrame("Traffic Light");
			window.add(new TrafficLightPanel(240, 540));
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.pack();
			window.setVisible(true);
		});
	}
}
