import javax.swing.*;
import java.awt.*;

public class Button2 {
    public static void main(String[] args) {
        Button2 gui = new Button2();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        JButton east = new JButton("EAST");
        JButton west = new JButton("WEST");
        JButton north = new JButton("NORTH");
        JButton south = new JButton("SOUTH");
        JButton center = new JButton("CENTER");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(BorderLayout.EAST, east);
        frame.getContentPane().add(BorderLayout.WEST, west);
        frame.getContentPane().add(BorderLayout.NORTH, north);
        frame.getContentPane().add(BorderLayout.SOUTH, south);
        frame.getContentPane().add(BorderLayout.CENTER, center);

        frame.setSize(700,700);
        frame.setVisible(true);
    }

}
