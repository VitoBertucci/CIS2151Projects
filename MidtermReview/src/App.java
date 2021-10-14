import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class App extends JFrame {
    private Container c = getContentPane();
    private JRadioButton t1, t2, t3;
    private ButtonGroup group;
    private JLabel p1, p2, p3;
    private JTextField priceDisplay;
    private JTextField input;
    private Button button;

    public static void main(String[] args) {
        App frame = new App();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public App() {
        CRHandler handler = new CRHandler();
        EventHandler buttonHandler = new EventHandler();
        setTitle("Midterm Review on Classes");
        c.setLayout(new FlowLayout());
        
        p1 = new JLabel("$5.00");
        p2 = new JLabel("$8.00");
        p3 = new JLabel("$12.00");

        t1 = new JRadioButton("small");
        t2 = new JRadioButton("medium");
        t3 = new JRadioButton("large");
        
        group = new ButtonGroup();
        group.add(t1);
        group.add(t2);
        group.add(t3);
        
        priceDisplay = new JTextField(40);
        priceDisplay.setText("Price of pizza will go here");
        priceDisplay.setEditable(false);
        
        input = new JTextField(20);
        c.add(input);
        input.addActionListener(buttonHandler);
        
        button = new Button("press this shit");
        c.add(button);
        button.addActionListener(buttonHandler);
        
        c.add(priceDisplay);
        c.add(t1);
        t1.addItemListener(handler);
        c.add(p1);
        c.add(t2);
        t2.addItemListener(handler);
        c.add(p2);
        c.add(t3);
        t3.addItemListener(handler);
        c.add(p3);
        
    }


    private class EventHandler implements ActionListener 
    {
      public void actionPerformed(ActionEvent e) 
      {
         if(e.getSource() == button) 
         {
            input.setText("The fucking button was pressed");
         }
      }
    }


    private class CRHandler implements ItemListener 
    {
        public void itemStateChanged(ItemEvent event) 
        {
            if(event.getSource() == t1) 
            {
               priceDisplay.setText("price is 5");
            } else if(event.getSource() == t2)
            {
               priceDisplay.setText("price is 8");
            } else if(event.getSource() == t3)
            {
               priceDisplay.setText("price is 12");
            }
            
        }
    }
}