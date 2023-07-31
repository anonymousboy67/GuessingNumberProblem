import java.util.Scanner;

public class GuessingNuber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);
        int userNumber;

        do {
            System.out.println("Guess my number(1-100) :");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("Woo..........CORRECT NUMBER!!!");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Your number is too large");
            } else {
                System.out.println("Your number is too small");
            }
        } while (true); // Run the loop indefinitely until 'break' is encountered

        System.out.println("My number was: " + myNumber);
    }
}
