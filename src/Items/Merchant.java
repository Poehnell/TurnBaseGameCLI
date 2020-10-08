package Items;

import Main.Screen;

import java.util.ArrayList;
import java.util.Scanner;

public class Merchant {
    Scanner scan = new Scanner(System.in);
    Screen screen = new Screen();
    int desission;
    int playerGold;
    ArrayList<String> playerItems;
    ItemBag merchantItems = new ItemBag();

    public Merchant(int playerGold, ArrayList<String> playerItems) {
        this.playerGold = playerGold;
        this.playerItems = playerItems;
        merchantBob();
        merchantMenue();

    }

    public void merchantImage() {
        System.out.println("" +
                "   ░░░░╔══╗░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "   ░░░░║╔╗║░░░░░░░░░░░░░░░░░░██░░░░░░██░░░░░░░░░░░╔═══╗░░╔╗╔╗░░░░░░░\n" +
                "   ░░░░║╚╝╚╦╗╔╦╗░╔╗░░░░░░░░░████████████░░░░░░░░░░║╔═╗║░░║║║║░░░░░░░\n" +
                "   ░░░░║╔═╗║║║║║░║║░░░░░░░░███████░░░░███░░░░░░░░░║╚══╦══╣║║║░░░░░░░\n" +
                "   ░░░░║╚═╝║╚╝║╚═╝║░░░░░░░██████░░░░░░░░██░░░░░░░░╚══╗║║═╣║║║░░░░░░░\n" +
                "   ░░░░╚═══╩══╩═╗╔╝░░░░░░████░░░░░░░░░░░░██░░░░░░░║╚═╝║║═╣╚╣╚╗░░░░░░\n" +
                "   ░░░░░░░░░░░╔═╝║░░░░████████████████████████░░░░╚═══╩══╩═╩═╝░░░░░░\n" +
                "   ░░░░░░░░░░░╚══╝░░░░░░█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀██░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "   ░░░░░░░░░░░░░░░░░░░░█▀░░░░▀▄░░░░░░░░▄▀░░░█░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "   ░░░░░░░▄█▀▀▀▀▀▀▀▀▀██░░░░░░▌░▀░░░░░░░▐░░░░░██▀▀▀▀▀▀▀█▄▄░░░░░░░░░░░\n" +
                "   ░░░░░█▀░█▌░░░░░░░░█╬░░░░░░░░░░░░░░░░░░░░░░▐█░░░░░░░█░░▀█▄░░░░░░░░\n" +
                "   ░░░▄█░░░░█░░░░░░░▐█╬╬░░░░░░░░█░░░█▄░░░░░░░╬█▌░░░░░░▌░░░░░▀█▄░░░░░\n" +
                "   ░░░██░░░░░▌░░░░░░▐█╬╬░░░░░░░█░░░░░░▌░░░░░░╬░▐░░░░░░▌░░█░░░▐█░░░░░\n" +
                "   ░░█░░░░░░░█░░░░░░░░█╬╬░░░░░░▀▄▄▄▄▄▄▌░░░░░╬╬░█░░░░░░▌░░▐░░▐░█░░░░░\n" +
                "   ░██░░░░▌░░▐░░░░░░░░░█╬╬░░░░░░░░░░░░░░░░░╬╬╬█░░░░░░░▌░░░░░░█░█░░░░\n" +
                "   ░█▌░░░░░░░▐░░░░░░░░░░█╬╬░░▐█▀▀▀▀▀▀▀▀▀▀█░╬╬█░░░░░░░░█░░░░░░░░░▌░░░\n" +
                "   ▐░░░░░░░░░▐░░░░░░░░░░░███▄░░──────────░░▄█░░░░░░░░░▐░░░░░░░░░▐░░░\n" +
                "   ▐░░░▐░░░▀░█░░░░░░░░░░░░░▀█░░░░░░░░░░░░░█▀░░░░░░░░░░▐░░░▌░░░░░░▌░░\n" +
                "   █░░░░░░░░░▌░░░░░░░░░░░░░░░▌░░░░░▐░░░░░░▐░░░░░░░░░░░▐░░░░░░░░░░█░░\n" +
                "   ▌░░░░░░▌░░▌░░░░░░░░░░░░░░░█▄▄▄▄▄█▄▄▄▄▄▄▀░░░░░░░░░░░░▌░░░░░░░░░░▌░\n" +
                "   ▌░░░░░░░░█▌░░░░░░░░░░░░░╔══╗░░░╔╗░╔═╦═╦═╗░░░░░░░░░░░█░░░░░░░░░░█░\n" +
                "   ░░░░░░░░░█░░░░░░░░░░░░░░║═╦╬╦╦═╣╠╗║║║═╣═╣░░░░░░░░░░░░▌░░░░░░░░░▐░\n" +
                "   ░░░░░░░░░█░░░░░░░░░░░░░░║╔╝║║║═╣═╣║║║╔╣╔╝░░░░░░░░░░░░█░░░░░░░░░░▌\n");
    }

    public void cash() {

    }

    public void merchantMenue() {
        screen.updateScreen();
        merchantImage();
        System.out.println("\n\n What the fuck do you want? \n" +
                "\n 1. Buy Items. \n" +
                " 2. Sell Items. \n" +
                " 3. Leave ");

        desission = screen.optionScreen();
        if (desission == 1) {
            buyMenue();
        } else if (desission == 2) {
            sellMenue();
        }
    }

    public void buyMenue() {
        screen.updateScreen();
        merchantImage();
        System.out.println("\n\n Hurry up already and pick something");
        System.out.print("\n 1. ");
        merchantItems.displayItem("Health Potion", 0);
        System.out.print("\n 2. ");
        merchantItems.displayItem("Mana Potion", 1);
        System.out.print("\n 3. Return");
        System.out.println(merchantItems.prices);
        desission = screen.optionScreen();

        if (desission == 1) {
            System.out.println("\n\n            All sold out");
            screen.nextScreen();
            buyMenue();
        } else if (desission == 2) {
            System.out.println("\n\n            Nope non of those");
            screen.nextScreen();
            buyMenue();
        } else if (desission == 3) {
            merchantMenue();

        }
    }

    public void buyItem(int choice, String itemName) {
        if (playerGold > merchantItems.prices.get(choice - 1)) {
            playerGold = merchantItems.prices.get(choice - 1) - playerGold;
            playerItems.add(itemName);
        }
    }


    public void sellMenue() {
        screen.updateScreen();
        merchantImage();
        System.out.println("\n\n You don't have any items you worth selling");
        screen.nextScreen();
        merchantMenue();
    }

    public void merchantBob() {
        merchantItems.addItem("Health Potion");
        merchantItems.addItem("Health Potion");
        merchantItems.addItem("Health Potion");
        merchantItems.addItem("Mana Potion");
        merchantItems.addItem("Mana Potion");


    }
}


