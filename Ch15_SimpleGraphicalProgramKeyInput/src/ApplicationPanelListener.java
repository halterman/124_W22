import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ApplicationPanelListener extends KeyAdapter {
    private ApplicationPanel app;

    public ApplicationPanelListener(ApplicationPanel app) {
        this.app = app;
    }

    @Override
    public void keyPressed(KeyEvent ev) {
        switch (ev.getKeyChar()) {
            case 'k', 'K' -> app.moveRight();
            case 'j', 'J' -> app.moveLeft();
        }
    }
}
