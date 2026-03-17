import java.awt.BorderLayout; import javax.swing.JButton: import javax.swing.JFrame:
public class Layout(
public static void main(String[] args) {
// Create the main window (frame)
JFrame frame new JFrame("BorderLayout Example"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE):
frame.setSize(400, 300):
// Explicitly set the layout to BorderLayout
// Note: JFrame's content pane uses BorderLayout by default frame.setLayout(new BorderLayout());
// Add buttons to each of the 5 regions
frame.add(new JButton("North"), BorderLayout.NORTH): frame.add(new JButton("South"). BorderLayout.SOUTH): frame.add(new JButton("East"), BorderLayout.EAST): frame.add(new JButton("West"). BorderLayout.WEST): frame.add(new JButton("Center"), BorderLayout.CENTER);
// Display the window frame.setVisible(true):
