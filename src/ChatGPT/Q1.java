package ChatGPT;
import javax.swing.*;
import java.awt.*;

public class Q1 {
    public static void main(String[] args) {
        // 建立主框架
        JFrame frame = new JFrame("Swing Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 繪製內容
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.drawRect(50, 50, 150, 100);
                g.drawString("Hello Swing!", 80, 40);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
