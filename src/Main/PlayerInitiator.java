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
    int heroOption;

    public PlayerInitiator() {


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
                "    Vit = "  + startKnight.getVitality() + "                               Vit = "  + startMage.getVitality() + " \n" +
                "    Str = "  + startKnight.getStrength() + "                               Str = "  + startMage.getStrength() + " \n" +
                "    Wis = "  + startKnight.getWisdom()   + "                                Wis = "  +startMage.getWisdom()  + " \n" +
                "\n" +
                "\n" +

                "   Make your choice : ");

        choiceScanner();
        if (heroOption == 1) {
            playerChoice = "Knight";
            System.out.print("\n You have chosen  the Knight \n Enter your name : ");
        } else if (heroOption == 2) {
            playerChoice = "Mage";
            System.out.print(" \n you have chosen the Mage \n Enter your Name : ");
        }
        playerName = scan.next();
        screen.updateScreen();
        if (playerChoice == "Knight"){
            System.out.println("\n Prepare yourself Sir " + playerName + " the " + playerChoice);
        }else if (playerChoice == "Mage")
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
        heroOption = scan.nextInt();


    }


}