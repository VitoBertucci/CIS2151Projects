import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddSubtract extends JFrame {
    //container
    private Container c = getContentPane();

    //global widgets
    private TextField firstNumTField;
    private TextField secondNumTField;
    private JButton addButton;
    private JButton subtractButton;

    //global variables to use
    private int firstNum;
    private int secondNum;
    private int sumDifference;
    
    //main method
    public static void main(String[] args) {
        AddSubtract frame = new AddSubtract();
        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //constructor
    public AddSubtract() {
        //create event handler for widgets
        Handler eventHandler = new Handler();

        //set title and layout
        setTitle("Add and Subtract in Class Project");
        c.setLayout(new FlowLayout());

        //add first label and textfield w/ event handler
        Label firstNumLabel = new Label("Enter a number");
        c.add(firstNumLabel);
        firstNumTField = new TextField(10);
        c.add(firstNumTField);
        firstNumTField.addActionListener(eventHandler);

        //add second label and textfield w/ event handler
        Label secondNumLabel = new Label("Enter another number");
        c.add(secondNumLabel);
        secondNumTField = new TextField(10);
        c.add(secondNumTField);
        secondNumTField.addActionListener(eventHandler);

        //add add and subtract buttons w/ event handlers
        addButton = new JButton("Add");
        c.add(addButton);
        addButton.addActionListener(eventHandler);
        subtractButton = new JButton("Subtract");
        c.add(subtractButton);
        subtractButton.addActionListener(eventHandler);
    }

    //event handler for textfields
    private class Handler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            //get text from textfields
            firstNum = Integer.parseInt(firstNumTField.getText());
            secondNum = Integer.parseInt(secondNumTField.getText());

            //display user entries
            System.out.println("The first number entered was: " + firstNum);
            System.out.println("The second number entered was: " + secondNum);
            System.out.println("Press either button to add or subtract the two numbers");

            //event handlers
            if(event.getSource() == addButton) {
                sumDifference = firstNum + secondNum;
                System.out.println("The sum of the two numbers is: " + sumDifference);
            } else {
                sumDifference = firstNum - secondNum;
                System.out.println("The difference of the two numbers is: " + sumDifference);
            }

            System.out.println("____________________________________________________________");
        }
    }
}
