package Main;


import Player.Knight;
import Player.Mage;


import java.util.Random;
import java.util.Scanner;

public class PlayerInitiator {

    private String playerChoice = "";
    private String playerName = "";


    Knight startKnight = new Knight();
    Mage startMage = new Mage();
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    Screen screen = new Screen();
    int decision;

    public PlayerInitiator() {
        menue();

    }
public void menue(){
        screen.updateScreen();
        System.out.print("\n                         Choose your Destiny :\n " +
                "------------------------------------------------------------------------\n\n" +
                "            1. Knight:                             2. Mage: \n" +
                "   ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░         ░░░░░░░░░░░░░░░░░▄▀▀▄░░░░░░░░░\n" +
                "   ░░░░░░░░░░░░▄█▀█░░░░░░░░░░░░░░         ░░░░░░░░░░░░░░░░█░░░░█░░░░░░░░\n" +
                "   ░░░░░░░░░░▄█▀░░█░░░░░░░░░░░░░░         ░░░░░░░░░░░░░▄█▀░░░█▄░█░░░░░░░\n" +
                "   ░░░░░░░░▄█░░░░░█████▄▄░░░░░░░░         ░░░░░░░░░░░░█░░░░░░▐░▀█▌░░░░░░\n" +
                "   ░░░░░░▄█░░▄▄▀░░█░░░░░░▀█▄░░░░░         ░░░░░░░░░░▄█░░░░░░░█░░░░░░░░░░\n" +
                "   ░░░░░█░░░█▀░░░░░█░▄▄▄░░░░█░░░░         ░░░░░░░░░█░░░░░░░░░▌░░░░░░░░░░\n" +
                "   ░░░░█░░░▀░░░░░░░▐█▀░░▀█░░░█░░░         ░░░░░░░░█░░░░░░░░░░█░░░░░░░░░░\n" +
                "   ░░░▐▌░░░░░░▄▄▄▄█▀█░█▌░▐░░░░█░░         ░░░░░░██░░░░░░░░░░░█▀█▄░░░░░░░\n" +
                "   ░░░▐█░░████▀░░░░░█░░░░█░░░░█░░         ░░░█▀▀▀▀░░░░░░░░░░░░░░░▀█▄░░░░\n" +
                "   ░░█▀▀▀▀▀▀▀░░░░░▐█░▀██▀░░░░▐█░░         ░██▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄██░░░\n" +
                "   ░░█░░░░░░░░░░░░█▀░░░░░░░░░█░░░         ░░░░░░▐█░░░░░░░░░▐███░░░░░░░░░\n" +
                "   ░░█░▌░█░░▌░░░█▀░░░░░░░░░░█░░░░         ░░░░░░▐██░░░░░░░░█████░░░░░░░░\n" +
                "   ░░█░█░▐░░░░▄▀░░░░░░░░░░▄▀░░░░░         ░░░░░█▀░░░░░░░░░░█████░░░░░░░░\n" +
                "   ░░█░░▌░█░░█░░░░░░░░░░░▐▌░░░░░░         ░░░░█░░░▄░░░░░░░██████░░░░░░░░\n" +
                "   ░░░█░░░░░██▄░░░░░░▄▄▄▄██▄░░░░░         ░░░░▀▀▀██▄▄░░░░████████░░░░░░░\n" +
                "   ░░░░█░░░█░░░█░▄██▀▀░░░░░░▀░░░░         ░░░░░░░█░░░██▌░███░░░███░░░░░░\n" +
                "   ░░░░░█░░▌░░▄██▀░░░░░░░░░░░░░░░         ░░░░░░░░██▄██████░░░░░██░░░░░░\n" +
                "   ░░░░░░▀█▌░░▀░░░░░░░░░░░░░░░░░░         ░░░░░░░░███████░░░░░░░░█▌░░░░░\n" +
                "   ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░         ░░░░░░░░█████░░░░░░░░░░░░░░░░░\n" +
                "   ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░         ░░░░░░░░░██▀▀░░░░░░░░░░░░░░░░░\n" +
                "    Vit = " + startKnight.getVitality() + "                               Vit = " + startMage.getVitality() + " \n" +
                "    Str = " + startKnight.getStrength() + "                               Str = " + startMage.getStrength() + " \n" +
                "    Wis = " + startKnight.getWisdom() + "                                Wis = " + startMage.getWisdom() + " \n" +
                "\n" +
                "\n" +

                "   Make your choice : ");

        decision = screen.optionScreen();
        if (decision == 1) {
            screen.updateScreen();
            System.out.println("" +
                    "   ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                    "   ░░░░░░░░░░░░▄█▀█░░░░░░░░░░░░░░\n" +
                    "   ░░░░░░░░░░▄█▀░░█░░░░░░░░░░░░░░\n" +
                    "   ░░░░░░░░▄█░░░░░█████▄▄░░░░░░░░\n" +
                    "   ░░░░░░▄█░░▄▄▀░░█░░░░░░▀█▄░░░░░\n" +
                    "   ░░░░░█░░░█▀░░░░░█░▄▄▄░░░░█░░░░\n" +
                    "   ░░░░█░░░▀░░░░░░░▐█▀░░▀█░░░█░░░\n" +
                    "   ░░░▐▌░░░░░░▄▄▄▄█▀█░█▌░▐░░░░█░░\n" +
                    "   ░░░▐█░░████▀░░░░░█░░░░█░░░░█░░\n" +
                    "   ░░█▀▀▀▀▀▀▀░░░░░▐█░▀██▀░░░░▐█░░\n" +
                    "   ░░█░░░░░░░░░░░░█▀░░░░░░░░░█░░░\n" +
                    "   ░░█░▌░█░░▌░░░█▀░░░░░░░░░░█░░░░\n" +
                    "   ░░█░█░▐░░░░▄▀░░░░░░░░░░▄▀░░░░░\n" +
                    "   ░░█░░▌░█░░█░░░░░░░░░░░▐▌░░░░░░\n" +
                    "   ░░░█░░░░░██▄░░░░░░▄▄▄▄██▄░░░░░\n" +
                    "   ░░░░█░░░█░░░█░▄██▀▀░░░░░░▀░░░░\n" +
                    "   ░░░░░█░░▌░░▄██▀░░░░░░░░░░░░░░░\n" +
                    "   ░░░░░░▀█▌░░▀░░░░░░░░░░░░░░░░░░\n" +
                    "   ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                    "   ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");

            playerChoice = "Knight";
            System.out.print("\n   You have chosen  the Knight \n\n   Enter your name : ");
        } else if (decision == 2) {
            screen.updateScreen();
            System.out.println("" +
                    "   ░░░░░░░░░░░░░░░░░▄▀▀▄░░░░░░░░░\n" +
                    "   ░░░░░░░░░░░░░░░░█░░░░█░░░░░░░░\n" +
                    "   ░░░░░░░░░░░░░▄█▀░░░█▄░█░░░░░░░\n" +
                    "   ░░░░░░░░░░░░█░░░░░░▐░▀█▌░░░░░░\n" +
                    "   ░░░░░░░░░░▄█░░░░░░░█░░░░░░░░░░\n" +
                    "   ░░░░░░░░░█░░░░░░░░░▌░░░░░░░░░░\n" +
                    "   ░░░░░░░░█░░░░░░░░░░█░░░░░░░░░░\n" +
                    "   ░░░░░░██░░░░░░░░░░░█▀█▄░░░░░░░\n" +
                    "   ░░░█▀▀▀▀░░░░░░░░░░░░░░░▀█▄░░░░\n" +
                    "   ░██▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄██░░░\n" +
                    "   ░░░░░░▐█░░░░░░░░░▐███░░░░░░░░░\n" +
                    "   ░░░░░░▐██░░░░░░░░█████░░░░░░░░\n" +
                    "   ░░░░░█▀░░░░░░░░░░█████░░░░░░░░\n" +
                    "   ░░░░█░░░▄░░░░░░░██████░░░░░░░░\n" +
                    "   ░░░░▀▀▀██▄▄░░░░████████░░░░░░░\n" +
                    "   ░░░░░░░█░░░██▌░███░░░███░░░░░░\n" +
                    "   ░░░░░░░░██▄██████░░░░░██░░░░░░\n" +
                    "   ░░░░░░░░███████░░░░░░░░█▌░░░░░\n" +
                    "   ░░░░░░░░█████░░░░░░░░░░░░░░░░░\n" +
                    "   ░░░░░░░░░██▀▀░░░░░░░░░░░░░░░░░");
            playerChoice = "Mage";
            System.out.print(" \n   You have chosen the Mage \n\n   Enter your Name : ");
        }else if (decision == 0) {
            menue();
        }
        playerName = scan.next();
        screen.updateScreen();
        if (playerChoice == "Knight") {
            System.out.println("\n Prepare yourself Sir " + playerName + " the " + playerChoice);
        } else if (playerChoice == "Mage")
            System.out.println("\n Prepare yourself Wise " + playerName + " the " + playerChoice);

    }

    public String getPlayerChoice() {
        return playerChoice;
    }

    public void setPlayerChoice(String playerChoice) {
        this.playerChoice = playerChoice;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void choiceScanner() {
        decision = scan.nextInt();


    }


}