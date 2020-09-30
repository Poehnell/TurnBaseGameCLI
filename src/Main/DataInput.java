package Main;

import Player.Job;
import Player.Knight;
import Player.Mage;

import java.util.Random;
import java.util.Scanner;

public class DataInput {

    public static String playerName = "";
    public static String playerChoice = "";

    Job job = new Job(playerName, playerChoice);
    Knight startKnight = new Knight();
    Mage startMage = new Mage();
    Scanner scan = new Scanner(System.in);
    Random random = new Random();

    public DataInput() {

    }

    public void heroChoiceScanner() {

        System.out.print(" Choose your Destiny :\n " +
                "---------------------\n" +
                "1. Knight \n" +
                "   Vit =  " + startKnight.getVitality() + " \n" +
                "   Str = " + startKnight.getStrength() + " \n" +
                "   Wis = " + startKnight.getWisdom() + " \n" +
                "\n" +
                "\n" +
                "2. Mage \n" +
                "   Vit =  " + startMage.getVitality() + " \n" +
                "   Str = " + startMage.getStrength() + " \n" +
                "   Wis = " + startMage.getWisdom() + " \n" +
                "\n" +
                "Choice : ");


        if (scan.nextInt() == 1) {
            playerChoice = "Knight";
            System.out.print("\n Your have chosen  the Knight \n Enter your name : ");
        } else if (scan.nextInt() == 2) {
            playerChoice = "Mage";
            System.out.println(" \n you have chasen the Mage \n Enter your Name");
        }
        playerName = scan.next();
        System.out.println("\n Prepare yourself sir " + playerName + " the " + playerChoice);

    }


}