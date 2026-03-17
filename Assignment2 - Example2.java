import java.awt.GridLayout: import javax.swing.JButton; import javax.swing.JFrame:
public class GridLayout {
public static void main(String[] args) {
JFrame frame = new JFrame("GridLayout (2x2)"): frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE):
frame.setSize(300. 200):
// Sets the layout to 2 rows and 2 columns frame.setLayout(new GridLayout(2, 2));
</>
ווויד
JAVA
Il Components are added in order: top-left, top-right, bottom-left, bottom-right frame.add(new JButton("1")):
frame.add(new JButton("2"));
frame.add(new JButton("3"));
}
frame.add(new JButton("4"));
frame.setVisible(true);
}
