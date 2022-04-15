import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ApplicationPanel extends JPanel {
    private int position;

    public ApplicationPanel() {
        setBackground(Color.YELLOW);
        position = 0;
        // Example of an anonymous inner class
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ev) {
                switch (ev.getKeyChar()) {
                    case 'k', 'K' -> moveRight();
                    case 'j', 'J' -> moveLeft();
                }
            }
        });
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
        g.setColor(Color.BLACK);
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
