import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        //cars app:
        Cars Fiat = new Cars("Dope ass tires");
        System.out.println(Fiat.getTires());

        //Jewelery app:
        Jewelery ring = new Jewelery(4, 2.1);
        ring.display();
    }
}
