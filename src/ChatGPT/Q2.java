package ChatGPT;
import java.awt.*;
import java.awt.event.*;

public class Q2 {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT GUI Example");
        Button button = new Button("Click Me");
        Label label = new Label("No button clicked yet.");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked!");
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(button);
        frame.setSize(300, 150);
        frame.setVisible(true);

        // 關閉視窗功能
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
