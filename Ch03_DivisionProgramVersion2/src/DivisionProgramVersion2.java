import javax.swing.JOptionPane;

public class DivisionProgramVersion2 {
    public static void main(String[] args) {
        String num1str = JOptionPane.showInputDialog(null, "Please enter an integer");
        String num2str = JOptionPane.showInputDialog(null, "Please enter another integer");
        int num1, num2;
        num1 = Integer.valueOf(num1str);
        num2 = Integer.valueOf(num2str);
        if (num2 != 0) {
            JOptionPane.showMessageDialog(null, 
                                          String.format("%d / %d = %d", 
                                                        num1, num2, num1/num2));
        } else {
            JOptionPane.showMessageDialog(null, "Cannot divide by zero");
        }
    }
}