import javax.swing.*;
import java.awt.*;

public class Panel1 {
    public static void main(String[] args) {
        Panel1 gui = new Panel1();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button = new JButton("Click me");
        JButton buttonTwo = new JButton("bliss");
        JButton buttonThree = new JButton("here we go!");
        panel.add(button);
        panel.add(buttonTwo);
        panel.add(buttonThree);

        frame.getContentPane().add(BorderLayout.EAST, panel);

        frame.setSize(500,200);
        frame.setVisible(true);
    }

}
