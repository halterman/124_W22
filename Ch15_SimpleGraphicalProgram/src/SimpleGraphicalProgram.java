import javax.swing.JFrame;

public class SimpleGraphicalProgram {
    public static void main(String[] args) throws Exception {
        JFrame window = new JFrame("Simple Graphical Application");
        window.add(new ApplicationPanel());
        window.pack();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
