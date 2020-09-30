package Main;

import Enemys.Enemy;

import java.util.Scanner;

public class Combat {
    boolean inCombat = false;
    int playerHealth, playerDamage, enemyHealth, enemyDamage;
    int dieSize;
    String newEnemyName = "";

    Scanner scan = new Scanner(System.in);


    public Combat(int playerHealth, int playerDamage, int enemyHealth, int enemyDamage, int dieSize) {
        this.playerHealth = playerHealth;
        this.playerDamage = playerDamage;
        this.enemyHealth = enemyHealth;
        this.enemyDamage = enemyDamage;
        this.dieSize = dieSize;

        Enemy newEnemy =  new Enemy();
        this.newEnemyName = newEnemy.getEnemyName();


        System.out.println("\n A " + newEnemyName + " is attacking!");
        System.out.print("\n    Press Enter!");
        scan.nextLine();
    }


    public void initiateCombat() {
        Dice diceInitCombat = new Dice(dieSize);
        if (diceInitCombat.diceRoll > diceInitCombat.diceSize) {
            System.out.println("Dice roll " + diceInitCombat.diceRoll);
            System.out.println("\nYou don't hesitate and land the first strike!");
        } else if (diceInitCombat.diceRoll <= 4) {
            System.out.println("\n As the " + newEnemyName + " draws near, you lock eyes with the beast.\n");
        }

    }


    public void combatOptions() {
        System.out.println(" What will you do?\n" +
                "   1. Melee attack!\n" +
                "   2. Item");
    }

    public void meleeAttack() {
        Dice diceMeleeAttack = new Dice(dieSize);
        if (diceMeleeAttack.diceRoll > diceMeleeAttack.diceSize - 1) {
            System.out.println("dice= " + diceMeleeAttack.diceSize);
            System.out.println("Roll= " + diceMeleeAttack.diceRoll);
            System.out.println("    YEA BABY! \n    CRITICAL HIT!");
        } else if (diceMeleeAttack.diceRoll > 1 && diceMeleeAttack.diceRoll < diceMeleeAttack.diceSize - 1) {
            System.out.println("dice = " + diceMeleeAttack.diceSize);
            System.out.println("Roll= " + diceMeleeAttack.diceRoll);
            System.out.println("    Success! ");

        } else if (diceMeleeAttack.diceRoll < 2) {
            System.out.println("Roll= " + diceMeleeAttack.diceRoll);
            System.out.println("    miss... WTF!");
        }
    }
}
