import javax.swing.BoxLayout; import javax.swing.JButton; import javax.swing.JFrame: import javax.swing.JPanel:
public class Boxlayout(
public static void main(String[] args) {
JFrame frame = new JFrame BoxLayout Vertical Example"); frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE):
frame.setSize(300, 200):
// 1. Create the panel
JPanel panel = new JPanel():
// 2. Set BoxLayout with Y AXIS (vertical stacking) // The first argument is the container it's managing panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
// 3. Add buttons to the panel
}
panel.add(new JButton("Button 1")): panel.add(new JButton("Button 2")):
II 4. Add the vertical panel to the frame frame.add(panel);
frame.setVisible(true);
}
