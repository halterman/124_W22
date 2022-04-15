import javax.swing.JFrame;

public class SimpleGraphicalProgramKeyInput {
    public static void main(String[] args) {
        JFrame window = new JFrame("Circle Mover");
        window.add(new ApplicationPanel());
        window.pack();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
