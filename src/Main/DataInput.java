package Main;

import java.util.Scanner;

public class DataInput {

    public static String playerName = "";
    public static String playerChoice = "";

    public DataInput() {

    }

    public void heroChoiceScanner() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose your hero :\n 1. Knight \n 2. Mage ");
        int choice = scan.nextInt();
        if (choice == 1) {
            playerChoice = "Knight";
            System.out.println("Your have chosen  the Knight \n Enter your name : ");
        } else if (choice == 2) {
            playerChoice = "Mage";
            System.out.println(" you have chasen the Mage \n Enter your Name");
        }
        playerName = scan.next();
        System.out.println("Prepare yourself sir " + playerName + " the " + playerChoice);

    }
}