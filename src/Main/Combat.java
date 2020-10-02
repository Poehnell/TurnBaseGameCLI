package Main;

import Enemys.EnemyManager;
import Player.Job;

import java.util.Scanner;

public class Combat {
    int dieSize;
    int playerInCombatDamage;
    int enemyHealth;
    String enemyName;

    Scanner scan = new Scanner(System.in);
    EnemyManager newEnemy = new EnemyManager();

    public Combat(int dieSize, int playerDamage) {
        newEnemy.enemyPicker();
        this.dieSize = dieSize;
        this.enemyHealth = newEnemy.getHealth();
        this.enemyName = newEnemy.getEnemyName();
        this.playerInCombatDamage = playerDamage;
        System.out.println("\n A " + newEnemy.getEnemyName() + " is attacking!");
        System.out.print("\n    Press Enter!");
        scan.nextLine();
    }


    public void initiateCombat() {
        Dice diceInitCombat = new Dice(dieSize);
        if (diceInitCombat.diceRoll > diceInitCombat.diceSize) {
            System.out.println("Dice roll " + diceInitCombat.diceRoll);
            System.out.println("\nYou don't hesitate and land the first strike!");
        } else if (diceInitCombat.diceRoll <= 4) {
            System.out.println("\n As the " + newEnemy.getEnemyName() + " draws near, you lock eyes with the beast.\n");
        }

    }

    public void battle() {
        if (enemyHealth > 0) {
            if (combatOptions() == 1) {
                meleeAttack();
                battle();
            } else if (combatOptions() == 2) {
                System.out.println("\n You Have no Items you poor bastard!");
                battle();
            } else
                System.out.println("Pick a number corresponding to your choice! whatever you entered is not a choice");
            battle();
        } else if (getEnemyHealth() < 0) {
            System.out.println("Fuck ya bud you just beat up a little " + enemyName);
        }
    }


    public int combatOptions() {
        System.out.print(" \n What will you do?\n" +
                "   1. Melee attack!\n" +
                "   2. Item\n" +
                "\n Choose wisely : ");
        int choice = scan.nextInt();
        return choice;


    }


    public void meleeAttack() {
        Dice diceMeleeAttack = new Dice(dieSize);
        if (diceMeleeAttack.diceRoll > diceMeleeAttack.diceSize - 5) {
            System.out.println("dice= " + diceMeleeAttack.diceSize);
            System.out.println("Roll= " + diceMeleeAttack.diceRoll);
            System.out.println("health was : " + newEnemy.getHealth());
            this.enemyHealth = this.enemyHealth - this.playerInCombatDamage;
            System.out.println("health is : " + this.enemyHealth);
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

    public int getDieSize() {
        return dieSize;
    }

    public void setDieSize(int dieSize) {
        this.dieSize = dieSize;
    }

    public int getEnemyHealth() {
        return enemyHealth;
    }

    public void setEnemyHealth(int enemyHealth) {
        this.enemyHealth = enemyHealth;
    }

    public int getPlayerInCombatDamage() {
        return playerInCombatDamage;
    }

    public void setPlayerInCombatDamage(int playerInCombatDamage) {
        this.playerInCombatDamage = playerInCombatDamage;
    }
}
