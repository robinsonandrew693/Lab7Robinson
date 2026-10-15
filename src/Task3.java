import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double savingsGoal = 0;
        double totalSaved = 0;
        int numberOfDeposits = 0;
        double depositAmount = 0;
        double excessSaved;
        boolean validSavingsGoal = false;
        boolean validDepositAmount = false;

        do {
            System.out.println("What is your savings goal?");
            if (scan.hasNextDouble()) {
                savingsGoal = scan.nextDouble();
                if (savingsGoal > 0) {
                    validSavingsGoal = true;
                }
                else {
                    System.out.println("Please make your number a positive value.");
                }
            }
            else {
                System.out.println("Please make your input a positive value.");
            }
            scan.nextLine();
        } while (!validSavingsGoal);

        do {
            do {
                System.out.println("Your current savings total is $" + totalSaved);
                System.out.println("How much is your deposit?");
                if (scan.hasNextDouble()) {
                    depositAmount = scan.nextDouble();
                    if (depositAmount > 0) {
                        validDepositAmount = true;
                    }
                    else {
                        System.out.println("Please input a positive value.");
                        validDepositAmount = false;
                    }
                }
                else {
                    System.out.println("Please input a positive value.");
                    validDepositAmount = false;
                }
                scan.nextLine();
            } while (!validDepositAmount);
            totalSaved += depositAmount;
            numberOfDeposits++;
        } while (totalSaved < savingsGoal);

        excessSaved = totalSaved - savingsGoal;

        System.out.printf("\n%-15s%15d", "Number of Deposits:", numberOfDeposits);
        System.out.printf("\n%-15s%15.2f", "Total Saved ($):", totalSaved);
        System.out.printf("\n%-15s%15.2f", "Excess ($):", excessSaved);

    }
}
