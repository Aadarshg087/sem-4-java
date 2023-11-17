import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrames {
    public static void main(String s[]) {
        JFrame frame = new JFrame("JFrame Example");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("JFrame By Example");
        JButton button = new JButton();
        button.setText("Button");
        JTextField field = new JTextField("Enter the name");
        JTextField field1 = new JTextField("Enter the Age");
        panel.add(label);
        panel.add(button);
        panel.add(field);
        panel.add(field1);
        frame.add(panel);
        if (field != 1) {
            JOptionPanel.showMessageDialog(null, "Error");
            System.exit(0);

        }
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}