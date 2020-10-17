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

    public Merchant(Player player) {
        this.player = player;
        merchantBob();
        merchantMenue(merchantBobsBag);


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

    public void merchantMenue(ItemBag itemBag) {
        screen.updateScreen();
        merchantImage();
        System.out.println("\n\n What the fuck do you want? \n" +
                "\n 1. Buy Items. \n" +
                " 2. Sell Items. \n" +
                " 3. Leave ");

        desission = screen.optionScreen();
        if (desission == 1) {
            buyMenue(itemBag);
        } else if (desission == 2) {
            sellMenue();
        }
    }

    public void buyMenue(ItemBag itemBag) {
        screen.updateScreen();
        merchantImage();
        System.out.println("\n\n Hurry up already and pick something \n" +
                "\n Your Gold: " + this.player.getGold() );
        itemBag.showInventory();
        this.player.getPlayersBag().showInventory();
        desission = screen.optionScreen();

        buyItem(itemBag);
    }

        public void buyItem(ItemBag itemBag){
            if (this.player.getGold() > itemBag.getItem(desission - 1).cost()) {
                this.player.setGold(this.player.getGold() - itemBag.getItem(desission - 1).cost());
                this.player.getPlayersBag().createItem(itemBag.getItem(desission - 1));
                itemBag.removeItem(itemBag.getItem(desission - 1),1);


                screen.updateScreen();
                buyMenue(itemBag);
            } else {
                System.out.println("You do NOT have enough gold you Poor bastard");
                buyMenue(itemBag);
            }
        }

public void sellMenue(){
        screen.updateScreen();
        merchantImage();
        System.out.println("\n\n You don't have any items you worth selling");
        screen.nextScreen();
        //merchantMenue();
        }

public void merchantBob(){
        merchantBobsBag.addItem(new HealthPotion(1),3);
        merchantBobsBag.addItem(new ManaPotion(2),3);


        }
        }


