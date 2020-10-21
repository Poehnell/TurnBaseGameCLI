package Main;

import java.io.IOException;
import java.util.Scanner;


public class Screen {
    Scanner scan = new Scanner(System.in);

    public Screen() {
    }

    public void updateScreen() {

        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    public void nextScreen() {
        System.out.print("\n\n                            press Enter ");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
    }

    public int optionScreen() {
        System.out.print("\n\n                              Choice : ");
        try {
            return scan.nextInt();
        } catch (Exception e) {
            return 0;
        }
    }
    public void intro(){
        updateScreen();
        System.out.println("" +
                "╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬\n" +
                "╬░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░╬\n" +
                "╬░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░╬\n" +
                "╬░░░░░░░░░░░░░╔══════════════════════════╗░░░░░░░░░░░░░░░░░░░░░░╬\n" +
                "╬░░░░░░░░░░░░░║░░░░╔═════════════════════╩══════╗░░░░░░░░░░░░░░░╬\n" +
                "╬░░░░░░░░░░░░░║░░╔═╩═════════════════════════╗░░║░░░░░░░░░░░░░░░╬\n" +
                "╬░░░░░░░░░░░░░║░░║╔═══╗░░░░░░╔═══╗░░░╔╗░░╔╗░░║░░║░░░░░░░░░░░░░░░╬\n" +
                "╬░░░░░░░░░░░░░║░░║╚╗╔╗║░░░░░░║╔══╝░░░║║░╔╝╚╗░║░░║░░░░░░░░░░░░░░░╬\n" +
                "╬░░░░░░░░░░░░░║░░║░║║║╠╦══╦══╣╚══╦╦══╣╚═╬╗╔╝░║░░║░░░░░░░░░░░░░░░╬\n" +
                "╬░░░░░░░░░░░░░║░░║░║║║╠╣╔═╣║═╣╔══╬╣╔╗║╔╗║║║░░║░░║░░░░░░░░░░░░░░░╬\n" +
                "╬░░░░░░░░░░░░░╚══║╔╝╚╝║║╚═╣║═╣║░░║║╚╝║║║║║╚╗░║░░║░░░░░░░░░░░░░░░╬\n" +
                "╬░░░░░░░░░░░░░░░░║╚═══╩╩══╩══╩╝░░╚╩═╗╠╝╚╝╚═╝░║░░║░░░░░░░░░░░░░░░╬\n" +
                "╬░░░░░░░░░░░░░░░░║░░░░░░░░░░░░░░░░╔═╝║░░░░░░░╠══╝░░░░░░░░░░░░░░░╬\n" +
                "╬░░░░░░░░░░░░░░░░╚═══════════════════════════╝░░░░░░░░░░░░░░░░░░╬\n" +
                "╬░░░░░░░░░░░░░░░░░░░░░░░░░░░░╦═══════╦░░░░░░░░░░░░░░░░░░░░░░░░░░╬\n" +
                "╬░░░░░░░░░░░░░░░░░░░░░░░╦═══════╦░░▄░║░░░░░░░░░░░░░░░░░░░░░░░░░░╬\n" +
                "╬░░░░░░░░░░░░░░░░░░░░░░░║░░░░░░░║░░░░║░░░░░░░░░░░░░░░░░░░░░░░░░░╬\n" +
                "╬░░░░░░░░░░░░░░░░░░░░░░░║░░░░░░░║▀░░░║░░░░░░░░░░░░░░░░░░░░░░░░░░╬\n" +
                "╬░░░░░░░░░░░░░░░░░░░░░░░║░░░▀░░░║░░▀░║░░░░░░░░░░░░░░░░░░░░░░░░░░╬\n" +
                "╬░░░░░░░░░░░░░░░░░░░░░░░║░░░░░░░║════╩░░░░░░░░░░░░░░░░░░░░░░░░░░╬\n" +
                "╬░░░░░░░░░░░░░░░░░░░░░░░╩═══════╩░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░╬\n" +
                "╬░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░╬\n" +
                "╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬\n");
        System.out.println("                             New Game");

        nextScreen();

    }
    public void town(){
        System.out.println("" +
                "   ░░▄▄▄░░░░░░░░░░░░░░░░░░░██████░░░░░░░░╬░░░░░░░░░░░░░░░░░░║│░░░░░░\n" +
                "   ░█████░░░░░░░░░░░░░░▄▄████▀▀▀████░░░░░║░░──┘░░───────────╢│░░░░░░\n" +
                "   ▐███████░░░░░░░░░░░▐███▀███▄██░░██░░░┌╫░┴────░░░░░░░░────╢│░░░░░░\n" +
                "   ░▀▀█████░░░░░░░░░░░░████████▀░░░██░░░│║░░┌──┐░░──┴───░░░░╟┘░░░░░░\n" +
                "   ░░░░▀▀▀░░░░░░░░░░░░░░░▀▀▀█████████░░░└╢░░└┐┌┴┬┬┬┬─┬┬┐░░┌─║░░░░░░░\n" +
                "   ░░░░░░░░░░░░░░░░░░░░░░░░░░░▀▀▀▀▀░░░░░░╟░░░││┼││││┴┤┌┘─┬┴─╢░░░░░░░\n" +
                "   ░░░░░╦═════════════╦░░░░░░░░░░░░░░░░░░╟░░░└┴─┴──┴─┴┘░░└┬─╢░░░░░░░\n" +
                "   ░░░░░║░╔══╦╗░░░░░░░║░░░░░░░░░░░░░░░░░░║░░═╦═════════╦═░│░╟┐░░░░░░\n" +
                "   ░░╔══╣░║══╣╚╦═╦═╗░░╠══╗░░░░░░░░░░░░░░░║░┐░║░░░░░░░░░║┌─┴─╫┘░░░░░░\n" +
                "   ╔═╣░░║░╠══║║║╬║╬║░░║░░╠══╗░░░░░░░░░░░░║░░░║░░░███░░░║└───╢░░░░░░░\n" +
                "   ╚═╩══╩═╚══╩╩╩═╣╔╝══╩══╩══╩═══╗░░░░░░░╔╗░┴─║░░░███░░░║░░░░╔╗░░░░░░\n" +
                "   █░░░░▄█▀░░░░░░╚╝░░░░░░░░░░░░░║░░░░░░░╚╝░░░║░░╔▀▀▀╗░░║────╚╝░░░░░░\n" +
                "   ░█░█▀░░░░░░░░░░░░░░░░░░░░░░░░║░░░░░░╔╩═╗░░║╔═╩═══╨─╗║░░░╔═╩╗░░░░░\n" +
                "   ░░█▌░░░░░┌─────┐░░░╔═╤╤═╗░░░░║░░░░░░║▌│║░╔╙╨═══════╨╨╖░░║█│║░░░░░\n" +
                "   ░░█▌░▄█░░║░░░░░│░░░╟─┤├─╢░░░░║░░░░░░║▌│╟─╨────═══════╩══╢▌│║░░░░░\n" +
                "   █▄███░░░░║░░░░░│░░░╚═╧╧═╝░░░░║░░░░░░║▌│╟═══──═══════════╢█│║░░░░░\n" +
                "   ░███░░░░░│░░░░▄│░░░░░░░░░░░░░║░░░░░░║█│╟─═══════──══════╢▐│║░░░░░\n" +
                "   ░▐███▀░░░║░░░░░│░░░╔═╗░░░░░░░║░░░░░░║█│╟──═══════───════╢▐│║░░░░░\n" +
                "   ░████░░░░║░░░░░│░░╔╝█╚╗╔╗░░░░║░░░░░░║█│╟─▄──────────────╢▐▌║░░░░░\n" +
                "   ██████═══╧═════╧═╔╝███╚╣╚╗═══╝░█░░░░╚══╝▐██████████████▄╚══╝░░░░░\n" +
                "   ██████░████████░░╚╗███╔╝█╚╗░██████░░░███░░███████████████████░░░░\n" +
                "   ░░░░▄▄▄██████████░╚═══╩═══╝░░██████░░░███░░░▀████████████████░░░░\n" +
                "   █████████████████████████████████████░░▀████░░▀██████████████████\n");

        System.out.println("                            Where to Driver? \n");
        System.out.println("\n   1. Buy or Sell some shit! \n" +
                "\n   2. Test your Might! \n");

    }
    public void towerMainFloor() {
        System.out.println("" +
                "░░░││░░│░░░░░░░░┌─░░░░░░░░░░│░░░░░░░░░░░░░░░░░║████║░░░║░║░║░║░║░\n" +
                "░░░├┘░░│░░░░┌───┤░░░░░░░────┤░░░░░░░░░░░░░░░░░║████║░░░║░║░║░║░║░\n" +
                "░░┌┤░░░└─░──┘░░░│░░░░░░░░░░░│░░░░░░░░│░░░░░╔╦╦╬╦╦╦╦╩═══╣░║░║░║░║░\n" +
                "░░││░░░░░░░░░░░░└┐┌┐░░│░░░░┌┘░░░░░░░░│░░░░░║║║║║║║╟╥───╨─╢░║░║░║░\n" +
                "░░├┘░│░░░░░░░░░░░├┴┴┐░└───░│░░┌─┐░░░░└┐░░░░║║║║║║║║╟╥────╨─╢░║░║░\n" +
                "░░│░░│░░░░░░░░░░░├──┘░░░░░░├─┬┴─┤░░░░░│░░░░║║║║║║║║║╟╥─────╨─║░║░\n" +
                "░░│░┌┘░░░░░░░░░░░│░░░░░│░░░│░└──┘░░░░░│░░░░║║║║║║║║║║╟╥──────╨─╢░\n" +
                "░░░░░░░░░░░┌─░░░░░░░░┌─┘░░░│░░░░░░░░░─┤░░░░║║║║║║║║║║║╟╥╥╥─────╨─\n" +
                "░░░░░░░░┌─┬┘░░░░░░░░─┘░░░░░░░░░░░░░░░░└┬─┐░║║║║║║║║║║║║║║╟╥────▀▀\n" +
                "░╔════╗░└┐│░░░░░░░░░░░░┌────┐░░░░░░░░░░│░░░║║║║║║║║║║║║║║║╟─────▀\n" +
                "░║████║░░└┤░░░░░░░░░┌──┴─┐╤╤╡╒╤╤╕░░░░░░│░░░║║║║║║║║║║║║║║╟╨▀▀▀▀──\n" +
                "░║████║░░░│░░░░░░░░░╞╤╤╤╤╡││╞││││════╗░░░░░║║║║║║║║║║║║║╟╨▀▀▀▀───\n" +
                "░║████║░░░░░░░╔═════│││││││││││││▀▀▀░╚═════╩╣║║║║║║║║║║╟╨▀▀▀─────\n" +
                "░║████║░░░╔═══╝█▀▀▀▀│││││╞╧╧╛╘╧╧╛░░░░░░░░░░░╚╩╩╣║║║║║║╟╨▀▀───────\n" +
                "░║████╠▄▄▄▄█▀▀▀▀░░░░╘╧╧╧╧╛░░░░░░░░░░░░░░░░░░░░░╚╩╣║╢║╟╨▀─────────\n" +
                "═╩════╝░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░╚╣║╟╨───────────\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░┌╨╨╨────────────\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░┌┴───────────────\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░┌┴───────────────▀\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░┌─┴───────────────▀▀\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░─┴──────────────▀▀▀▀▀\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n");
        System.out.println("\n   1. Back to Town \n" +
                "\n   2. It's time to kick ass and chew bubble gum. And I'm all out of gum. \n");
    }
    public void upperFloor(){
        System.out.println("" +
                "░│░░░░░░░░░░░░░░░░│░░░░░░░░░░░░░░░░░░░░░░░░░░░║████║░░░║░║░║░║░║░\n" +
                "░│░░░░░░░░░░░░░░░┌┘░░░░░░░░░░░░░░░░░░░░░░░░░░░║████║░░░║░║░║░║░║░\n" +
                "░└┬─┐░░░░░░░░░░─┐└─┐░░░░░░░░░░░░░░░░░┌─░░░░╔╦╦╬╦╦╦╦╩═══╣░║░║░║░║░\n" +
                "░░└─┤░░░░═██╗░░░└┐░│░░═╦═╗░░░░░░░░░┌─┘░░░░░║║║║║║║╟╥───╨─╢░║░║░║░\n" +
                "░░░┌┘░░░░░╚█╩╗░░░├─┘░░░║█╚═▄══╗░░┌─┘░░░░░░░║║║║║║║║╟╥────╨─╢░║░║░\n" +
                "░░┌┤░░░░░░░░░║░░░│░░░░░║█████═║░░│░│░░░░░░░║║║║║║║║║╟╥─────╨─║░║░\n" +
                "░░││░░░░░░░░░░░░░│░░░░░╚╗█▌═╝░░░░░│░░░░░░░░║║║║║║║║║║╟╥──────╨─╢░\n" +
                "░░└┐░░░░░░░░░░░░░└┐░░░░░╚═╣░░░░░░░│░░░░│░░░║║║║║║║║║║║╟╥╥╥─────╨─\n" +
                "░░░│░░░░░░░░░░░░░░│┌─░░░░░║░░░░░░░│░░░░│░░░║║║║║║║║║║║║║║╟╥────▀▀\n" +
                "░╔════╗░░░░░░░░░┌─┴┘░░░░░░░░░░░░░░░░░░░│░░░║║║║║║║║║║║║║║║╟─────▀\n" +
                "░║████║░░░░░░░──┘░░░░░░░░░░░░░░░░░░░░░░░░░░║║║║║║║║║║║║║║╟╨▀▀▀▀──\n" +
                "░║████║░░░░░░░░░░░░░░░╔═════════════╗░░░░░░║║║║║║║║║║║║║╟╨▀▀▀▀───\n" +
                "░║████║░░░░░░░░░░╔════╝░░░░░░░░░░░░░╚══════╩╣║║║║║║║║║║╟╨▀▀▀─────\n" +
                "░║████║░░░░░╔════╝░░░░░░░░░░░░────░░░░░░░░░░╚╩╩╣║║║║║║╟╨▀▀───────\n" +
                "░║████╠═════╝░░░░░░░░░░░░░░░░░──░░░░░░░░░░░░░░░╚╩╣║╢║╟╨▀─────────\n" +
                "═╩════╝░░░░░░░░░░░░░░░░░░░░░░░░░─░░░░░░░░░░░░░░░░╚╣║╟╨───────────\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░┌╨╨╨────────────\n" +
                "░░░░░░░░░░░░░░░░░░░░─────░░░░░░░░░░░░░░░░░░░░░░░┌┴───────────────\n" +
                "░░░░░░░░░░░░░░░░░────░░░░░░░░░░░░░░───░░░░░░░░░┌┴───────────────▀\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░┌─┴───────────────▀▀\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░─┴──────────────▀▀▀▀▀\n" +
                "░░░░░░░────░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n");
        System.out.println("\n    1. Back to town  \n" +
                "\n   2. Get some! Keep climbing");
    }
    public void victory(){
        updateScreen();
        System.out.println("" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░╔════░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░║░░░░░░░░░░░░░░░░░░░░░░░░░░░░░║░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░════╩══════════════════╗░░░░░░░░░░║░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░║░░░░░░░░░░║░░░░░░░░░░░░░░░░░║░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░════╩══════════╩════════╦════════╝░░░░░░░░░░░\n" +
                "░░░░░░░░░░══════════════════════════════════╩═══╗░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░┌┐░░┌┬──┬───┬────┬───┬───┬┐░░┌┬┐░░░║░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░│└┐┌┘├┤├┤┌─┐│┌┐┌┐│┌─┐│┌─┐│└┐┌┘││░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░└┐││┌┘││││░└┴┘││└┤│░││└─┘├┐└┘┌┤│░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░│└┘│░││││░┌┐░││░││░││┌┐┌┘└┐┌┘└┘░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░└┐┌┘┌┤├┤└─┘│░││░│└─┘│││└┐░││░┌┐░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░└┘░└──┴───┘░└┘░└───┴┘└─┘░└┘░└┘░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░═══════════╦════════════════╦═════════░░░░░░║░░░░░░░░░\n" +
                "░░░░══════════╦═══════╝░░░░░░░░░░░░░░░░║░░░░░░░░░░░░░░░╚╗░░░░░░░░\n" +
                "░░░░░░░░░░░░░░║░░░░░░░░░░░░░░░░░░░░░░░░╚════════════════╩═══════░\n" +
                "░░░░░░░░░░░░░░║░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░▄▄▄▄▄▄▄░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░█▀░░░░░░░▀█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░▌░░░█░░░█░░░█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░█░░░░░░░░░░░░░▌░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░█░░█▄░░░░░░█░░█░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░█░░░▀▀▀▀▀▀░░█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n");
        nextScreen();
    }
    public void youAreDead(){
        updateScreen();
        System.out.println("" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░════════════════════════════════════════════════░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░┌┐░░┌┬───┬┐░┌┐░░░┌───┬───┬───┐░░░┌───┬───┬───┬───┐░░░░░░░░\n" +
                "░░░░░░░│└┐┌┘│┌─┐││░││░░░│┌─┐│┌─┐│┌──┘░░░└┐┌┐│┌──┤┌─┐├┐┌┐│░░░░░░░░\n" +
                "░░░░░░░└┐└┘┌┤│░│││░││░░░││░││└─┘│└──┐░░░░││││└──┤│░││││││░░░░░░░░\n" +
                "░░░░░░░░└┐┌┘││░│││░││░░░│└─┘│┌┐┌┤┌──┘░░░░││││┌──┤└─┘│││││░░░░░░░░\n" +
                "░░░░░░░░░││░│└─┘│└─┘│░░░│┌─┐│││└┤└──┐░░░┌┘└┘│└──┤┌─┐├┘└┘│░░░░░░░░\n" +
                "░░░░░░░░░└┘░└───┴───┘░░░└┘░└┴┘└─┴───┘░░░└───┴───┴┘░└┴───┘░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░════════════════════════════════════════════════░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░┌─────┐░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░┌─┴░░░░░┴─┐░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░┌─┘░░░░░░░░░└─┐░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░│░░═█═░░░═█═░░│░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░│░░░░░░█░░░░░░│░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░└─┬┬─░▐█▌░─┬┬─┘░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░││░░▀░▀░░││░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░││░░░░░░░││░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░│└╠╬╬╬╬╬╣┘│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░└┬░░░░░░░┬┘░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░└───────┘░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n");
        nextScreen();
    }
    public void gameOver(){
        updateScreen();
        System.out.println("" +
                "░░░░░░░░░░░░░░░░░░░░░░░░┌──┬────┐┌───┐░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░└┤├┤┌┐┌┐├┤┌─┐│░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░││└┘││└┤│└──┐░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░││░░││░└┴──┐│░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░┌┤├┐░││░░│└─┘│░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░└──┘░└┘░░└───┘░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░┌───┬───┬─┐┌─┬───┬───┬┐░░┌┬───┬───┐░░░░░░┌─┐┌─┬───┬─┐░┌┬┐░░░░\n" +
                "░░░░│┌─┐│┌─┐││└┘││┌──┤┌─┐│└┐┌┘│┌──┤┌─┐│░░░░░░││└┘││┌─┐││└┐│││░░░░\n" +
                "░░░░││░└┤│░││┌┐┌┐│└──┤│░│├┐││┌┤└──┤└─┘│░░░░░░│┌┐┌┐││░││┌┐└┘││░░░░\n" +
                "░░░░││┌─┤└─┘││││││┌──┤│░│││└┘││┌──┤┌┐┌┘░░░░░░││││││└─┘││└┐│├┘░░░░\n" +
                "░░░░│└┴─│┌─┐││││││└──┤└─┘│└┐┌┘│└──┤││└┐░░░░░░││││││┌─┐││░││├┐░░░░\n" +
                "░░░░└───┴┘░└┴┘└┘└┴───┴───┘░└┘░└───┴┘└─┘░░░░░░└┘└┘└┴┘░└┴┘░└─┴┘░░░░\n" +
                "░░░░░░░░░░░░░░┌───┬───┬─┐┌─┬───┬───┬┐░░┌┬───┬───┐░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░│┌─┐│┌─┐││└┘││┌──┤┌─┐│└┐┌┘│┌──┤┌─┐│░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░││░└┤│░││┌┐┌┐│└──┤│░│├┐││┌┤└──┤└─┘│░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░││┌─┤└─┘││││││┌──┤│░│││└┘││┌──┤┌┐┌┘░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░│└┴─│┌─┐││││││└──┤└─┘│└┐┌┘│└──┤││└┐░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░└───┴┘░└┴┘└┘▄▄▄▄▄▄▄──┘░└┘░└───┴┘└─┘░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░█▀░░░░░░░▀█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░▌░░░█░░░█░░░█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░█░░░░▄▄▄▄▄░░░░▌░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░█░░█▀░░░░░▀█░░█░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░█░░░░░░░░░░░█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n");
        nextScreen();
    }

}

