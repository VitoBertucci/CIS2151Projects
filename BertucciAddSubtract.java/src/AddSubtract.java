import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddSubtract extends JFrame {
    //container
    private Container c = getContentPane();

    //global widgets
    private TextField firstNumTField;
    private TextField secondNumTField;
    private TextField thirdNumTField;

    private JButton calculateButton;
    private JButton exitButton;

    //global variables to use
    private int firstNum;
    private int secondNum;
    private double thirdNum;
    
    //main method
    public static void main(String[] args) {
        AddSubtract frame = new AddSubtract();
        frame.setSize(500,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //constructor
    public AddSubtract() {
        //create event handler for widgets
        Handler eventHandler = new Handler();

        //set title and layout
        setTitle("Triangle Calculator");
        c.setLayout(new FlowLayout());

        //add first label and textfield w/ event handler
        Label firstNumLabel = new Label("Side A");
        c.add(firstNumLabel);
        firstNumTField = new TextField(10);
        c.add(firstNumTField);
        firstNumTField.addActionListener(eventHandler);

        //add second label and textfield w/ event handler
        Label secondNumLabel = new Label("Side B");
        c.add(secondNumLabel);
        secondNumTField = new TextField(10);
        c.add(secondNumTField);
        secondNumTField.addActionListener(eventHandler);

        Label thirdNumLabel = new Label("Side C");
        c.add(thirdNumLabel);
        thirdNumTField = new TextField(10);
        c.add(thirdNumTField);
        secondNumTField.addActionListener(eventHandler);

        //add add and subtract buttons w/ event handlers
        calculateButton = new JButton("Calculate");
        c.add(calculateButton);
        calculateButton.addActionListener(eventHandler);
        exitButton = new JButton("Exit");
        c.add(exitButton);
        exitButton.addActionListener(eventHandler);
    }

    //event handler for textfields
    private class Handler implements ActionListener {
        public void actionPerformed(ActionEvent event) throws NumberFormatException{
            //get text from textfields
                firstNum = Integer.parseInt(firstNumTField.getText());
                secondNum = Integer.parseInt(secondNumTField.getText());
            //event handlers

            try {
                if(event.getSource() == calculateButton) {
                    thirdNum = Math.sqrt((firstNum * firstNum) + (secondNum * secondNum));
                    System.out.println(thirdNum);
                    thirdNumTField.setText(String.valueOf(thirdNum));
                } else {
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Exception integer..." + nfe.toString()); 
            }
            
        }
    }
}
