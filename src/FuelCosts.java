import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double mpg = 0;
        double pricePerGallon = 0;
        String trash = "";
        boolean done = false;

        done = false;
        do {
            System.out.print("Enter the number of gallons in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You have to enter a valid number!");
            }
        } while (!done);

        done = false;
        do {
            System.out.print("Enter the fuel efficiency (miles per gallon): ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You have to enter a valid number!");
            }
        } while (!done);

        done = false;
        do {
            System.out.print("Enter the price of gas per gallon: $");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You have to enter a valid number!");
            }
        } while (!done);

        double costPer100 = (100.0 / mpg) * pricePerGallon;
        double rangeOnTank = gallons * mpg;

        System.out.println("Cost to drive 100 miles: $" + costPer100);
        System.out.println("Distance on a full tank: " + rangeOnTank + " miles");
    }
}