import java.util.Scanner;

public class RetailPrice {
    public static void main (String [] args) {
        /*
        *This program will prompt the user to enter an
        * item name and cost, and determined the retail price
        * the user will keep adding item until he has no more
        * item to add
         */

        String cont;
        char response;
        double cost, retail, rate;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter the item name: ");
            cont = in.nextLine();
            in.nextLine();

            System.out.print("Enter the item price: ");
            cost = in.nextInt();

            rate = cost * (2.5/100);
            retail = cost + rate;

            System.out.println(cont + " will cost: $" + retail + " to retail.");
            in.nextLine();
            System.out.print("Do you have another item to enter ('Y' for yes " +
                    "or 'N' for no)? ");
            response = in.next().charAt(0);
        }while (response == 'Y' || response == 'y');

    }
}
