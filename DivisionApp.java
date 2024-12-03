import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivisionApp {
    
    public static void main(String[] args) {
                JFrame frame = new JFrame("Integer Division");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

                JLabel label1 = new JLabel("Num1: ");
        JTextField num1Field = new JTextField(10);
        JLabel label2 = new JLabel("Num2: ");
        JTextField num2Field = new JTextField(10);
        JButton divideButton = new JButton("Divide");
        JTextField resultField = new JTextField(15);
        resultField.setEditable(false);  
                frame.add(label1);
        frame.add(num1Field);
        frame.add(label2);
        frame.add(num2Field);
        frame.add(divideButton);
        frame.add(new JLabel("Result: "));
        frame.add(resultField);
        divideButton.addActionListener(new ActionListener() {
                       public void actionPerformed(ActionEvent e) {
                try {
                    // Get the input values and parse them as integers
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    
                    // Perform division and display result
                    int result = num1 / num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    // Handle non-integer input
                    JOptionPane.showMessageDialog(frame, "Please enter valid integers.", "Input Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    // Handle division by zero
                    JOptionPane.showMessageDialog(frame, "Cannot divide by zero.", "Math Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

                frame.setVisible(true);
    }
}
