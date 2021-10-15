import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame 
{
    private Container c = getContentPane();
    private JTextField inputField, outputField;
    private Button button;
    private JRadioButton radio1, radio2;
    private ButtonGroup group;

    public static void main(String[] args) 
    {
        App frame = new App();
        frame.setSize(400,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public App()
    {
        EventHandler handler = new EventHandler();
        CRHandler listener = new CRHandler();

        setTitle("Title");
        c.setLayout(new FlowLayout());

        inputField = new JTextField(30);
        inputField.addActionListener(handler);
        outputField = new JTextField(30);
        outputField.addActionListener(handler);
        outputField.setEditable(false);        
        button = new Button("button");
        button.addActionListener(handler);
        radio1 = new JRadioButton("option 1");
        radio1.addItemListener(listener);
        radio2 = new JRadioButton("option 2"); 
        radio2.addItemListener(listener);
        group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);        

        c.add(inputField);
        c.add(outputField);
        c.add(button);
        c.add(radio1);
        c.add(radio2);

    }

    private class EventHandler implements ActionListener 
    {
      public void actionPerformed(ActionEvent e) 
      {
        String input = "";
        if(e.getSource() == inputField) 
        {
            input = inputField.getText();
            outputField.setText(input);
        } else if(e.getSource() == button)
        {
            outputField.setText("The button was pressed");
        }
      }
      
    }

    private class CRHandler implements ItemListener
    {
        public void itemStateChanged(ItemEvent e)
        {
            if(e.getSource() == radio1)
            {
                outputField.setText("Option 1");
            } else if(e.getSource() == radio2)
            {
                outputField.setText("Option 2");
            }
        }
    }



}

