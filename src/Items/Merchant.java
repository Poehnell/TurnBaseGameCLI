package Items;

import Main.Screen;
import Player.Player;

import java.util.Scanner;

public class Merchant {
    Scanner scan = new Scanner(System.in);
    Screen screen = new Screen();
    int desission;
    private Player player;
    ItemBag merchantBobsBag = new ItemBag();
    private ItemBag merchantBag = merchantBobsBag;

    public Merchant(Player player) {
        this.player = player;
        merchantBob();
        merchantMenue(merchantBag);


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

    public void merchantMenue(ItemBag merchantBag) {
        screen.updateScreen();
        merchantImage();
        System.out.println("\n                   What the fuck do you want? \n" +
                "\n 1. Buy Items. \n" +
                "\n 2. Sell Items. \n" +
                "\n 3. Leave ");

        desission = screen.optionScreen();
        if (desission == 1) {
            buyMenue(merchantBag);
        } else if (desission == 2) {
            sellMenue(player.getPlayersBag());
        }
    }

    public void buyMenue(ItemBag merchantBag) {
        screen.updateScreen();
        int previousMenue = merchantBag.getInventory().size() + 1;
        merchantImage();
        System.out.println("\n                   Hurry up already and pick something \n" +
                "\n                             Your Gold: " + this.player.getGold() + "\n");
        merchantBag.showInventoryCost();
        System.out.println(" " + previousMenue + ". - Return");
        desission = screen.optionScreen();
        if (desission == previousMenue) {
            merchantMenue(merchantBag);
        } else
            buyItem(merchantBag);
    }

    public void buyItem(ItemBag itemBag) {
        if (this.player.getGold() > itemBag.getItem(desission - 1).cost()) {
            this.player.removeGold(itemBag.getItem(desission - 1).cost());
            this.player.getPlayersBag().transferItem(itemBag.getItem(desission - 1));
            itemBag.removeItem(itemBag.getItem(desission - 1), 1);
            screen.updateScreen();
            buyMenue(itemBag);
        } else {
            System.out.println("                You do NOT have enough gold you Poor bastard");
            buyMenue(itemBag);
        }
    }

    public void sellMenue(ItemBag playersBag) {
        screen.updateScreen();
        if (playersBag.getInventory().size() == 0){
            merchantImage();
            System.out.println("    WTF is this?... Don't bullshit me! Y ou have nothing of value");
            screen.nextScreen();
            merchantMenue(merchantBag);
        }
        int previousMenue = playersBag.getInventory().size() + 1;
        merchantImage();
        System.out.println("    HA! like you have anything i would want. show me your shit! \n" +
                "\n                             Your Gold: " + this.player.getGold() + "\n");
        playersBag.showInventory();
        System.out.println("\n " + previousMenue + ". - Return");
        desission = screen.optionScreen();
        if (desission == previousMenue) {
            merchantMenue(merchantBag);
        } else
            sellItem(playersBag);
    }

    public void sellItem(ItemBag playersBag) {
        screen.updateScreen();
        merchantImage();
        System.out.println("                            " + playersBag.getItem(desission - 1).name() + "\n\n\n                        Hmmm...Ill give you " +
                playersBag.getItem(desission - 1).cost() / 2 + "g.");
        System.out.println("\n\n   1. YES \n" +
                "\n   2. NO");
        desission = screen.optionScreen();
        if (desission == 1) {
            this.player.addGold(playersBag.getItem(desission - 1).cost() / 2);
            playersBag.removeItem(playersBag.getItem(desission - 1), 1);
            sellMenue(playersBag);
        }
        else if (desission == 2){
            sellMenue(playersBag);

        }
    }

    public void merchantBob() {
        merchantBobsBag.addItem(new HealthPotion(1), 3);
        merchantBobsBag.addItem(new ManaPotion(2), 3);


    }
}


