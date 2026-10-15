import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int specifiedTerm = 0;
        boolean properTerm = false;
        int previousTerm = 0;
        int currentTerm = 1;

        System.out.println("To how many terms do you want the Fibonacci Sequence to run?");

        do {
            if (scan.hasNextInt()) {
                specifiedTerm = scan.nextInt();
                if (specifiedTerm <= 0) {
                    System.out.println("You need to input a positive integer.");
                }
                else {
                    properTerm = true;
                }
            }
            else {
                System.out.println("You need to input a positive integer.");
            }
            scan.nextLine();
        } while (!properTerm);

        for (int i = 0; i < specifiedTerm; i++) {
            if (i == 0) {
                System.out.print(previousTerm + " ");
            }
            else if (i == 1) {
                System.out.print(currentTerm + " ");
            }
            else {
                int beforeChange = currentTerm;
                currentTerm = previousTerm + currentTerm;
                previousTerm = beforeChange;
                System.out.print(currentTerm + " ");
            }
        }
    }
}
