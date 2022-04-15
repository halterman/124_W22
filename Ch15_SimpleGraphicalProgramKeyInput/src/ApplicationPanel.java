import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class ApplicationPanel extends JPanel {
    private int position;

    public ApplicationPanel() {
        setBackground(Color.CYAN);
        position = 0;
        addKeyListener(new ApplicationPanelListener(this));
        setFocusable(true);
        requestFocus();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 400);
    } 

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(position, 200, 20, 20);
    }

    public void moveRight() {
        position += 10;
        repaint();
    }

    public void moveLeft() {
        position -= 10;
        repaint();
    }
}
