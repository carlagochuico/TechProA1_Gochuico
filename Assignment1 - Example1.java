import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple Login");

        JLabel label = new JLabel("Username:");
        label.setBounds(60, 50, 100, 30);

        JTextField textField = new JTextField();
        textField.setBounds(150, 50, 150, 30);

        JButton button = new JButton("Login");
        button.setBounds(150, 100, 100, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = textField.getText();
                JOptionPane.showMessageDialog(frame,
                        "Welcome " + username);
            }
        });

        frame.add(label);
        frame.add(textField);
        frame.add(button);

        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
