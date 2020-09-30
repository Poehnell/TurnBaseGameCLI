package Main;

import Player.Job;


public class Game {

    public static void main(String[] args) {
//        Dice dice = new Dice(6);
//        System.out.println(dice.diceSize);

        Combat combat = new Combat(1,2,3,4,6);
        combat.initiateCombat();
        combat.combatOptions();
        combat.meleeAttack();


//        DataInput scan = new DataInput();
//        scan.heroChoiceScanner();
//
//

//        Job newPlayer = new Job(DataInput.playerName,DataInput.playerChoice);
//        newPlayer.heroChoice();














    }


    }


