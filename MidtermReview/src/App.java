import java.util.Scanner;
public class App {
    //create a method to search for a string and return the value of the index
    public static int searchStrAry(String[] ary, String input, int arySize) {
        int index = -1;
        for (int i = 0; i < arySize; i++) {
            if (ary[i].equalsIgnoreCase(input)) {
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {

        //---------------------------------------------------
        // STRING EXAM REVIEW QUESTIONS:
        // create and set a string to a variable

        /*
        String var = "some string";

        String userInput = "";
        int searchIndex;
        Scanner kb = new Scanner(System.in);

        //create array of strings w 3 tools and search array
        String[] tools = {"hammer", "saw", "drill"};
        System.out.println("search:");
        userInput = kb.next();
        searchIndex = searchStrAry(tools, userInput, tools.length);
        System.out.println("index of search :" + searchIndex);

        //describe and use each method
        //trim()
        String str = " John  ";
        String trimString = str.trim();
        System.out.println(trimString + "this");

        //indexOf
        String str1 = "Good Day";
        String str2 = "Good Evening";  
        int index = -1;
        index = str1.indexOf("Day");
        System.out.println(index);

        //charAt
        char exChar = str1.charAt(3);
        System.out.println(exChar);

        //equals
        Boolean exEqual = str1.equals(str2);
        System.out.println(exEqual);

        //compareTo
        int exComp = str1.compareTo(str2);
        System.out.println(exComp);


        String example1 = "JAVA";
        String example2 = "java";
        String example3 = "the brown cow said ow";
        String example4 = "ow";
        String example5 = "  Hi ";

        //what will these output:
        Boolean match = example1.equalsIgnoreCase(example2);
        System.out.println(match);      //true

        int code = example1.compareTo(example2);
        System.out.println(code);       //-32

        Boolean againMatch = example1.equals(example2);
        System.out.println(againMatch);     //false

        String lowerCase = example1.toLowerCase();
        System.out.print(lowerCase);    //java 
        */

        //---------------------------------------------------
    }
}
