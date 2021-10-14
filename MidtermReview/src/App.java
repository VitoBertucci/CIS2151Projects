import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class App extends JFrame {
    private Container c = getContentPane();



    App() {
        setTitle("Midterm Review on Classes");
        c.setLayout(new FlowLayout());

        Handler evHandler = new Handler();
    }
    public static void main(String[] args) {
        App frame = new App();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class Handler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            
        }
    }
}