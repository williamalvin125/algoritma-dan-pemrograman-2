package tugasbesar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainclass implements ActionListener {
private static JButton button;
private static JFrame frame;

public static void main(String args[]) {
JLabel label = new JLabel();
label.setText("Berita seputar Departemen Matematika ITS");

button = new JButton();
button.setBounds(400, 300, 100, 50);
mainclass main = new mainclass();
button.addActionListener(main);

frame = new JFrame();
frame.setTitle("ITSNews by William and Najwa");
frame.setLayout(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(1000, 700);
frame.setVisible(true);
frame.add(button);
}

public void actionPerformed(ActionEvent e) {
if (e.getSource() == button) {
// Create a new instance of NewFrame and pass the old frame
NewFrame newFrame = new NewFrame(frame);
}
}
}

