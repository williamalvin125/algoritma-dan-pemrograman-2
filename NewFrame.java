package tugasbesar;

import javax.swing.JFrame;


public class NewFrame {
private JFrame frame;

public NewFrame(JFrame oldFrame) {
frame = new JFrame();
frame.setTitle("New Frame");
frame.setSize(400, 300);
frame.setVisible(true);

// Close the old frame when the new frame is created
oldFrame.setVisible(false);
}

}
