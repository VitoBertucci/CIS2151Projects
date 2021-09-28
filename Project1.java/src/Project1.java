import java.util.Scanner;
import java.util.ArrayList;
public class Project1 {
    public static void main(String[] args) {
        //create arrayList for storing of restaurant objects
        ArrayList<FastFoodAndSnack> Restaurants = new ArrayList<FastFoodAndSnack>();
        
        //declare string for user choice
        String choice = "y";

        //create scanner obj
        Scanner kb = new Scanner(System.in);

        //while loop for user to enter restaurants into arraylist
        while (choice.equalsIgnoreCase("y")) {
            System.out.println("---------------------");

            //prompt user and store responses
            System.out.println("Enter Name:");
            String userName = kb.nextLine();
            System.out.println("Enter FoodType:");
            String userFoodType = kb.nextLine();
            System.out.println("Enter URL:");
            String userURL = kb.nextLine();

            //create restaurant object with default constructor and set attributes with set methods
            FastFoodAndSnack restaurant = new FastFoodAndSnack();
            restaurant.setName(userName);
            restaurant.setFoodType(userFoodType);
            restaurant.setURL(userURL);

            //add that new object to list of objects
            Restaurants.add(restaurant);

            //prompt user to end loop or not
            System.out.println("Enter y to add another restaurant or n to finish adding restaurants");
            choice = kb.nextLine();
        }

        //print all contents of objects from arraylist and display using display method
        System.out.println("------------------------------------------------");
        System.out.println("All contents of stored restaurants:");
        for (int i = 0; i < Restaurants.size(); i++) {
            (Restaurants.get(i)).display();
        }
        System.out.println("------------------------------------------------");

        //prompt for user to search for a restaurant by name
        System.out.println("Please search for a restaurant by entering one of the restaurant's names:");

        //loop to print just the names of all restaurants for user to see
        for (int i = 0; i < Restaurants.size(); i++) {
            System.out.println(" - " + (Restaurants.get(i).getName()));
        }

        //create a string to store user search query
        String search = kb.nextLine();

        //search list for object with matching name
        Boolean found = false;
        int index = 0;
        while (!found && index < Restaurants.size()) {
            /*
            if the restaurant name at the index of the current iteration is the same as 
            search string, then display the restaurants url, if not, go to next iteration
            */
            if (((Restaurants.get(index)).getName()).equalsIgnoreCase(search)) {
                found = true;
                System.out.println("**********************");
                System.out.println("The searched restaurant's URL is: " + ((Restaurants.get(index)).getURL()));
                System.out.println("**********************");
            } else {
                index++;
            }
        }

        //session ended messages
        if (found) {
            System.out.println("Thank you, session ended.");
        } else {
            System.out.println("No restaurant found matching that name, session ended.");
        }
    }
}

