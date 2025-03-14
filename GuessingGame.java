import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void guess(int targetNum, int low, int high, int attempt) {
        Scanner scan = new Scanner(System.in);

        while (low <= high && attempt > 0) {
            int mid = low + (high - low) / 2;
            System.out.println("Is your guess: " + mid + "? 1:Too low, 2:Too high, 3:Correct");
            int response = scan.nextInt();

            if (response == 3) {
                System.out.println("You got the correct number: " + mid);
                return; // Exit immediately
            } else if (response == 1) {
                low = mid + 1;
            } else if (response == 2) {
                high = mid - 1;
            } else {
                System.out.println("Wrong format of input, please enter 1, 2, or 3.");
                continue; // Skip the rest of the loop iteration
            }

            attempt--;
            if (attempt > 0) {
                System.out.println("Total attempts left: " + attempt);
                System.out.println("Do you want to continue? (Y/N)");
                String answer = scan.next();

                if (answer.equalsIgnoreCase("N")) {
                    System.out.println("Game Over!!");
                    return; // Exit the method
                }
            }
        }

        System.out.println("Out of attempts! The correct number was: " + targetNum);
        scan.close();
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int targetNum = rand.nextInt(100) + 1;
        int attempt = 6;
        guess(targetNum, 1, 100, attempt);
    }
}

