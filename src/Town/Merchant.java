package Town;

import Items.Potions.HealthPotion;
import Items.ItemBag;
import Items.Potions.ManaPotion;
import Items.Rope;
import Items.scrolls.Cure;
import Items.scrolls.FireBall;
import Main.Screen;
import Player.Player;

import java.util.Scanner;

public class Merchant {
    Scanner scan = new Scanner(System.in);
    Screen screen = new Screen();
    private int decision;
    private int towerFloor;
    private Player player;
    private ItemBag merchantBag;
    ItemBag merchantBobsBag = new ItemBag();

    public Merchant(Player player) {
        this.player = player;
        this.towerFloor = towerFloor;
        if (towerFloor >= 0) {
            merchantBob();
            merchantBag = merchantBobsBag;
        }


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


    public void merchantMenue(ItemBag merchantBag) {
        screen.updateScreen();
        merchantImage();
        System.out.println("\n                   What the fuck do you want? \n" +
                "\n 1. Buy Items. \n" +
                "\n 2. Sell Items. \n" +
                "\n 3. Leave ");

        decision = screen.optionScreen();
        if (decision == 1) {
            buyMenue(merchantBag);
        } else if (decision == 2) {
            sellMenue(player.getItemBag());
        } else if (decision == 3) {
            this.player.setPlayerLocation(0);
        } else if (decision == 0) {
            merchantMenue(merchantBag);
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
        decision = screen.optionScreen();
        if (decision == previousMenue) {
            merchantMenue(merchantBag);
        } else if (decision == 0) {
            buyMenue(merchantBag);
        } else {
            buyItem(merchantBag);
        }

    }


    public void buyItem(ItemBag merchantBag) {
        if (this.player.getGold() >= merchantBag.getItem(decision - 1).cost()) {
            this.player.removeGold(merchantBag.getItem(decision - 1).cost());
            this.player.getItemBag().transferItem(merchantBag.getItem(decision - 1));
            merchantBag.removeItem(merchantBag.getItem(decision - 1), 1);
            screen.updateScreen();
            buyMenue(merchantBag);
        } else {
            screen.updateScreen();
            merchantImage();
            System.out.println("                You do NOT have enough gold you Poor bastard");
            screen.nextScreen();
            buyMenue(merchantBag);
        }
    }

    public void sellMenue(ItemBag playersBag) {
        screen.updateScreen();
        if (playersBag.getInventory().size() == 0) {
            merchantImage();
            System.out.println("    WTF is this?... Don't bullshit me! Y ou have nothing of value");
            screen.nextScreen();
            merchantMenue(merchantBag);
        }
        int previousMenue = playersBag.getInventory().size() + 1;
        merchantImage();
        System.out.println("    HA! like you have anything i would want. show me your shit! \n" +
                "\n                             Your Gold: " + this.player.getGold() + "\n");
        playersBag.showInventoryAll();
        System.out.println("\n " + previousMenue + ". - Return");
        decision = screen.optionScreen();
        if (decision == previousMenue) {
            merchantMenue(merchantBag);
        } else if (decision == 0) {
            sellItem(playersBag);
        }else {
            sellItem(playersBag);
        }
    }

    public void sellItem(ItemBag playersBag) {
        screen.updateScreen();
        merchantImage();
        System.out.println("                            " + playersBag.getItem(decision - 1).name() + "\n\n\n                        Hmmm...Ill give you " +
                playersBag.getItem(decision - 1).cost() / 2 + "g.");
        System.out.println("\n\n   1. YES \n" +
                "\n   2. NO");
        decision = screen.optionScreen();
        if (decision == 1) {
            this.player.addGold(playersBag.getItem(decision - 1).cost() / 2);
            playersBag.removeItem(playersBag.getItem(decision - 1), 1);
            sellMenue(playersBag);
        } else if (decision == 2) {
            sellMenue(playersBag);
        } else if (decision == 0) {
            sellItem(playersBag);
        }
    }

    public void merchantBob() {
        merchantBobsBag.addItem(new HealthPotion(1), 3);
        merchantBobsBag.addItem(new ManaPotion(2), 3);
        merchantBobsBag.addItem(new Cure(200),2);
        merchantBobsBag.addItem(new FireBall(201),1);
        merchantBobsBag.addItem(new Rope(0), 2);


    }

    public ItemBag getMerchantBag() {
        return merchantBag;
    }

    public void setMerchantBag(ItemBag merchantBag) {
        this.merchantBag = merchantBag;
    }
}


