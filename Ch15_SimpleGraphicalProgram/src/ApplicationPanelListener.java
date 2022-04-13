import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ApplicationPanelListener extends MouseAdapter {
   private ApplicationPanel app;
   
   public ApplicationPanelListener(ApplicationPanel app) {
       this.app = app;
   }

   @Override
   public void mouseReleased(MouseEvent ev) {
        app.move();
   }
}
