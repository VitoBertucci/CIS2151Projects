import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class App extends JFrame{
    //create content field and JTextField
    //create global string
    private Container c = getContentPane();
    private TextField numberField;
    private String numberInput;

    //display method
    public static void displayTokens(String[] i) {
        System.out.println("The contents of the array are: " + (Arrays.toString(i)));
    }

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

        //put textfield in layout
        numberField = new TextField(30);
        c.add(numberField);
        numberField.addActionListener(eventHandler);

    }

    private class Handler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            //get input from textfield and store in string
            numberInput = numberField.getText();

            //create tokenizer for input string with space and comma deliminator
            StringTokenizer toks = new StringTokenizer (numberInput, (", "));

            //while loop to store all tokens in an array
            int i = 0;
            int numTok = toks.countTokens();
            String tokens = "";
            String []nums = new String[numTok];
            while (toks.hasMoreTokens()) {
                tokens = toks.nextToken();
                nums[i] = (tokens);
                i++;
            }

            //print contents of token array
            displayTokens(nums);
        }
    }
}
