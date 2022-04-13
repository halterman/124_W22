import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class ApplicationPanel extends JPanel {
    private int position;

    public ApplicationPanel() {
        setBackground(Color.GREEN);
        position = 0;
        addMouseListener(new ApplicationPanelListener(this));
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 400);
    } 

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(position, 200, 20, 20);
    }

    public void move() {
        position += 10;
        repaint();
    }
}
