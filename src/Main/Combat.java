package Main;

import Enemys.EnemyManager;


import java.util.Scanner;

public class Combat {
    int dieSize, playerHP, playerMP, playerInCombatDamage, enemyHealth, enemyMana;
    String playerName, enemyName;

    Scanner scan = new Scanner(System.in);
    EnemyManager newEnemy = new EnemyManager();
    GameBoard gameBoard = new GameBoard();
    Screen screen = new Screen();


    public Combat(int dieSize, String playerName, int playerHP, int playerMP, int playerDamage) {
        newEnemy.enemyPicker();
        this.dieSize = dieSize;
        this.playerName = playerName;
        this.playerHP = playerHP;
        this.playerMP = playerMP;
        this.playerInCombatDamage = playerDamage;
        this.enemyName = newEnemy.getEnemyName();
        this.enemyHealth = newEnemy.getHealth();
        this.enemyMana = newEnemy.getMana();
        System.out.println("\n A " + newEnemy.getEnemyName() + " is attacking!");
        System.out.print("\n    Press Enter!");
        scan.nextLine();
        screen.updateScreen();
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
            screen.updateScreen();
            gameBoard.drawGameBoard(enemyName, enemyHealth, enemyMana, this.playerName, this.playerHP, this.playerHP);
            int choice = combatOptions();
            if (choice == 1) {
                meleeAttack();
                battle();

            } else if (choice == 2) {
                System.out.println("\n     You Have no Items you poor bastard!");
                screen.nextScreen();
                battle();

            } else
                System.out.println("\n     Pick a number corresponding to your choice! whatever you entered is not a choice");
            screen.nextScreen();
            battle();
        } else if (getEnemyHealth() <= 0) {
            screen.updateScreen();
            gameBoard.drawGameBoard(enemyName, enemyHealth, enemyMana, this.playerName, this.playerHP, this.playerHP);
            System.out.println("\n\n       Fuck ya bud you just beat up the little " + enemyName);
            screen.nextScreen();
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
        Dice dice = new Dice(dieSize);
        int diceRoll = dice.diceRoll;
        System.out.println("\n    Dice Roll = " + diceRoll);

        if (diceRoll > dice.diceSize - 1) {
            this.enemyHealth = this.enemyHealth - this.playerInCombatDamage + 5;
            System.out.println("    CRITICAL FUCKIN HIT!\n" +
                    "    The " + enemyName + "took " + (this.playerInCombatDamage + 5) + " damage.");
            screen.nextScreen();

        } else if (diceRoll > 1 && diceRoll < dice.diceSize - 1) {
            this.enemyHealth = this.enemyHealth - this.playerInCombatDamage;
            System.out.println("    Success! \n" +
                    "    The " + enemyName + "took " + this.playerInCombatDamage + " damage.");
            screen.nextScreen();

        } else if (diceRoll < 2) {
            System.out.println("    MISS... WTF!");
            screen.nextScreen();

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
