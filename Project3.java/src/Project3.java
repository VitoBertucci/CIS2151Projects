import java.util.Scanner;
public class Project3 {
    public static void main(String[] args) throws Exception {

        //all variables for main function
        Scanner kb = new Scanner(System.in);
        String loopChoice = "y";
        String shapeChoice = "";
        double userRadius = 0.0;
        double userWidth = 0.0;
        double userHeight = 0.0;

        System.out.println("Welcome to the Area Calculator");

        //while loop for user to try any amount of shapes
        while (loopChoice.equalsIgnoreCase("y")) {
            System.out.println("Calculate the area of a cirle, sqaure, or rectangle? (c/s/r)");
            shapeChoice = kb.nextLine();

            //switch case for user choice of shape
            switch(shapeChoice) {

                //creation of circle shape and output of area
                case "c": 
                System.out.println("Enter radius:");
                userRadius = kb.nextDouble();
                Circle c = new Circle(userRadius);
                System.out.println("The area of the Circle you enetered is " + c.getArea());
                break;

                //creation of sqaure shape and output of area
                case "s":
                System.out.println("Enter width");
                userWidth = kb.nextDouble();
                Sqaure s = new Sqaure(userWidth);
                System.out.println("The area of the Sqaure you enetered is " + s.getArea());
                break;

                //creation of Rectangle shape and output of area
                case "r":
                System.out.println("Enter width");
                userWidth = kb.nextDouble();
                System.out.println("Enter length");
                userHeight = kb.nextDouble();
                Rectangle r = new Rectangle(userWidth, userHeight);
                System.out.println("The area of the Rectangle you enetered is " + r.getArea());
                break;
            }

            //ask user for choice of loop again
            kb.nextLine();
            System.out.println("Continue? (y/n)");
            loopChoice = kb.nextLine();
        }
    }
}
