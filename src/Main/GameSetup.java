package Main;

import Player.Job;

public class GameSetup {


    public GameSetup() {
        DataInput scan = new DataInput();
        scan.heroChoiceScanner();
        Job newPlayer = new Job(DataInput.playerName, DataInput.playerChoice);
        newPlayer.heroChoice();

        Combat combat = new Combat(6,newPlayer.getDamage());
        combat.setPlayerInCombatDamage(newPlayer.getDamage());
        combat.initiateCombat();
        combat.battle();

    }

}
