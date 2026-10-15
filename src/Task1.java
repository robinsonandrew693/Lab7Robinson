import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userWord;
        String reversedWord = "";

        System.out.println("What is your word?");
        userWord = scan.nextLine();

        for (int i = userWord.length() - 1; i >= 0; i--) {
            reversedWord += userWord.substring(i,i+1);
        }

        if (reversedWord.equalsIgnoreCase(userWord)) {
            System.out.println("Your reversed word is " + reversedWord + ". This a palindrome.");
        }
        else {
            System.out.println("Your reversed word is " + reversedWord + ". This is not a palindrome.");
        }

    }
}
