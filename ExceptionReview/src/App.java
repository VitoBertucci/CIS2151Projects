import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.StringTokenizer;

public class App extends JFrame
{
    private Container c = getContentPane();
    private Button button;
    private JRadioButton add, subtract, multiply, divide;
    private ButtonGroup group;
    private JTextField inputField, outputField;
    private Button clear;
    private Button calculate;
    private String input = "", output = "";
    private int[] nums;
    private Boolean a,s,m,d;
    private int total;

    public static void main(String[] args)
    {
        App frame = new App();
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public App()
    {
        c.setLayout(new FlowLayout());
        setTitle("Example for review");
        handler handler = new handler();
        listener listener = new listener();

        add = new JRadioButton("add");
        add.addItemListener(listener);
        subtract = new JRadioButton("subtract");
        subtract.addItemListener(listener);
        multiply = new JRadioButton("multiply");
        multiply.addItemListener(listener);
        divide = new JRadioButton("divide");
        divide.addItemListener(listener);

        group = new ButtonGroup();

        group.add(add);
        group.add(subtract);
        group.add(multiply);
        group.add(divide);

        inputField = new JTextField(25);
        inputField.addActionListener(handler);
        outputField = new JTextField(25);
        outputField.addActionListener(handler);
        outputField.setEditable(false);

        clear = new Button("clear");
        clear.addActionListener(handler);
        calculate = new Button("calculate");
        calculate.addActionListener(handler);

        c.add(inputField);
        c.add(outputField);
        c.add(clear);
        c.add(add);
        c.add(subtract);
        c.add(multiply);
        c.add(divide);
        c.add(calculate);
    }

    private class handler implements ActionListener
    {
        public void actionPerformed (ActionEvent e) 
        {
            StringTokenizer tokens = new StringTokenizer(input, (", "));
            input = inputField.getText();
            int i = 0;
            
            String currentTok = "";


            nums = new int[5];
            while (tokens.hasMoreTokens()) 
            {
                currentTok = tokens.nextToken();
                nums[i] = Integer.parseInt(currentTok);
                i++;

            }


            if(e.getSource() == clear) 
            {
                inputField.setText("");
                outputField.setText("");
            }

            if (e.getSource() == calculate || a == true) 
            {
                for(int x = 0; x < 5; x++) {
                    total += nums[x];
                }
                output = String.valueOf(total);
                outputField.setText(String.valueOf(total));

            } else if (e.getSource() == calculate || s == true) 
            {
                

            } else if (e.getSource() == calculate || m == true) 
            {
                for(int x = 0; x < 5; x++) {
                    total *= nums[x];
                }
                output = String.valueOf(total);
                outputField.setText(output);

            } else if (e.getSource() == calculate || d == true) 
            {
                for(int x = 0; x < 5; x++) {
                    total /= nums[x];
                }
                output = String.valueOf(total);
                outputField.setText(output);
            }


        }
    }

    private class listener implements ItemListener
    {
        public void itemStateChanged(ItemEvent e) 
        {
            if(e.getSource() == add) 
            {
                a = true;
            } else if(e.getSource() == subtract) 
            {
                s = true;

                for(int x = 0; x < 5; x++) {
                    total -= nums[x];
                }
                output = String.valueOf(total);
                outputField.setText(output);
            } else if(e.getSource() == multiply) 
            {
                m = true;
            } else if(e.getSource() == divide) 
            {
                d = true;
            }
        }
    }
}
