import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame 
{
    Container c = getContentPane();
    private JTextField field;
    private JTextField input;
    private JButton button1;
    private JButton button2;

    public App() 
    {
        EventHandler handler = new EventHandler();
        c.setLayout(new FlowLayout());
        setTitle("My Stupid Project");

        field = new JTextField(30);
        field.setEditable(false);
        field.addActionListener(handler);
        c.add(field);

        input = new JTextField(30);
        input.setEditable(true);
        input.addActionListener(handler);
        c.add(input);

        button1 = new JButton("Option 1");
        button2 = new JButton("Option 2");
        button1.addActionListener(handler);
        button2.addActionListener(handler);
        c.add(button1);
        c.add(button2);
    }


    public static void main(String[] args)
    {
        App frame = new App();
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class EventHandler implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            if(e.getSource() == button1)
            {
                field.setText("Button 1 was pressed.");
            } else if(e.getSource() == button2)
            {
                field.setText("Button 2 was pressed.");
            } else if(e.getSource() == input)
            {
                String inputString = input.getText();
                field.setText("You typed: " + inputString);
            }
        }
    }
}
