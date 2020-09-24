package Main;

import Player.Job;


public class Game {

    public static void main(String[] args) {

        DataInput scan = new DataInput();
        scan.heroChoiceScanner();


        Job player = new Job(DataInput.playerName,DataInput.playerChoice);
        player.heroChoice();
        System.out.println("Player life = " + player.getLife());













    }


    }


