import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class App extends JFrame{
    //create global variables and widgets to use
    private Container c = getContentPane();
    private TextField numberField;
    private TextField outputField;
    private JButton clearButton;
    private String numberInput;

    //display method
    public static String displayTokens(int[] i, int length) {
        //create a string buffer to allow creation of single output string
        StringBuffer outputBuffer = new StringBuffer("The contents of the array are: ");

        //loop to add all contents of token array to stringbuffer
        for (int e = 0; e < length; e++) {
            outputBuffer.append(String.valueOf(i[e]) + " ");
        }

        //set string buffer equal to single string and return that single string value
        String output = String.valueOf(outputBuffer);
        return output;
    }



    //________________________________________________________________________________

    public static void main(String[] args) {
        //create and show container
        App frame = new App();
        frame.setSize(500,300);
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
        outputField = new TextField(50);
        c.add(outputField);
        outputField.setText("Output of array will appear here");
        outputField.setEditable(false);
        outputField.addActionListener(eventHandler);

        //add clear button to container 
        clearButton = new JButton("Clear");
        c.add(clearButton);
        clearButton.addActionListener(eventHandler);

    }

    private class Handler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            //input textfield logic
            //get input from textfield and store in string
            numberInput = numberField.getText();

            //create tokenizer for input string with space and comma deliminator
            StringTokenizer toks = new StringTokenizer (numberInput, (", "));

            //while loop to store all tokens in an array
            int i = 0;
            int numTok = toks.countTokens();
            String tokens = "";
            int[] nums = new int[numTok];
            while (toks.hasMoreTokens()) {
                tokens = toks.nextToken();
                nums[i] = (Integer.parseInt(tokens));
                i++;
            }

            //output textfield display logic
            //print contents of token array in the label for the output
            outputField.setText(displayTokens(nums,numTok));

            //clear button logic
            if(event.getSource() == clearButton) {
                //clear input field
                numberField.setText("");
                //clear output field
                outputField.setText("");
            }
            
        }
    }
}
