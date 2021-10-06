import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.lang.String;

public class App extends JFrame{
    //create global variables and widgets to use
    private Container c = getContentPane();
    private TextField numberField;
    private TextField outputField;
    private TextField exprField;
    private JButton clearButton;
    private String numberInput;

    //display method
    public static String displayTokens(int[] i) {
        //create a string buffer to allow creation of single output string
        StringBuffer outputBuffer = new StringBuffer("The contents of the array are: ");

        //loop to add all contents of token array to stringbuffer
        for (int e = 0; e < 5; e++) {
            outputBuffer.append(String.valueOf(i[e]) + " ");
        }

        //set string buffer equal to single string and return that single string value
        String output = String.valueOf(outputBuffer);
        return output;
    }

    //evaluateInput method that converts the token to an int and stores it in the array
    public void evaluateInput(int[] ary, String s, int index) throws InvalidDecimalException {
        int tokInputted;
        if(s.indexOf(".") != -1) {
            throw new InvalidDecimalException("no decimals allowed");
        }
        tokInputted = Integer.parseInt(s);
        ary[index] = (tokInputted);
    }

    //________________________________________________________________________________

    public static void main(String[] args) {
        //create and show container
        App frame = new App();
        frame.setSize(600,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public App() { 
        Handler eventHandler = new Handler();
        //set title and layout
        setTitle("Project 6: Strings and Exceptions");
        c.setLayout(new FlowLayout());

        //put textfields in layout
        numberField = new TextField(30);
        c.add(numberField);
        numberField.addActionListener(eventHandler);

        //add output textfield to container and set its text and edit boolean
        outputField = new TextField(70);
        c.add(outputField);
        outputField.setText("Output of array will appear here");
        outputField.setEditable(false);
        outputField.addActionListener(eventHandler);

        //add output textfield to container and set its visibility and edit boolean
        exprField = new TextField(70);
        c.add(exprField);
        exprField.setText("Exception messages will appear here");
        exprField.setEditable(false);
        exprField.addActionListener(eventHandler);

        //add clear button to container 
        clearButton = new JButton("Clear");
        c.add(clearButton);
        clearButton.addActionListener(eventHandler);

    }

    //event handler
    private class Handler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            //input textfield logic
            //get input from textfield and store in string
            numberInput = numberField.getText();

            //create tokenizer for input string with space and comma deliminator
            StringTokenizer toks = new StringTokenizer (numberInput, (", "));

            //while loop to store all tokens in an array
            int i = 0;
            String token = "";

            //create int array with size and fill it with while loop
            int[] nums = new int[5];
            while (toks.hasMoreTokens()) {
                token = toks.nextToken();
                try {
                    evaluateInput(nums, token, i);
                } catch(ArrayIndexOutOfBoundsException aioob) {
                    exprField.setText(aioob.toString());
                } catch(InvalidDecimalException ide) {
                    exprField.setText(ide.toString());
                } catch (NumberFormatException nfe) {
                    exprField.setText(nfe.toString());
                }
                i++; 
            }   

            //output textfield display logic
            //print contents of token array in the label for the output
            outputField.setText(displayTokens(nums));

            //clear button logic
            if(event.getSource() == clearButton) {
                //clear input field
                numberField.setText("");
                //clear output field
                outputField.setText("");
                //clear exception field
                exprField.setText("Exception messages will appear here");
            }
        }
    }

    //class for InvalidDecimalException
    class InvalidDecimalException extends Exception {
        public InvalidDecimalException(String message) {
            super(message);
        }
    }
}
