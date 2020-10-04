package Main;

import java.io.IOException;
import java.util.Scanner;


public class Screen {



    public Screen() {
    }

    public void updateScreen() {

        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    public void nextScreen(){
        System.out.println("\n\n        press Enter! ");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
    }
}
