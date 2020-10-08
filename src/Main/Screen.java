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
        System.out.print("\n\n             press Enter ");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
    }

    public int optionScreen() {
        System.out.print("\n\n  Choice : ");
        return scan.nextInt();

    }
}
