import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int secret = generator.nextInt(10) + 1;   // 1 to 10 inclusive
        int guess = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Guess a number from 1 to 10: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();
                if (guess >= 1 && guess <= 10) {
                    done = true;
                } else {
                    System.out.println("Your guess must be from 1 to 10!");
                }
            } else {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You have to enter a whole number from 1 to 10!");
            }
        } while (!done);

        System.out.println("The number was: " + secret);

        if (guess == secret) {
            System.out.println("On the money! You guessed it!");
        } else if (guess > secret) {
            System.out.println("Your guess was too high.");
        } else {
            System.out.println("Your guess was too low.");
        }
    }
}