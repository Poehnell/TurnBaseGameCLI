package Main;

import Enemys.Enemy;
import Enemys.EnemyManager;
import Player.Job;
import Player.Player;


import java.util.Scanner;

public class Combat {
    private Player player;
    private Enemy newEnemy;
    private Dice newDice = new Dice();
    Scanner scan = new Scanner(System.in);
    GameBoard gameBoard = new GameBoard();
    Screen screen = new Screen();



    public Combat(Player player, Enemy newEnemy) {
        this.player = player;
        this.newEnemy = newEnemy;

        System.out.println("\n A " + this.newEnemy.getName() + " is attacking! ");
        System.out.print("\n          Press Enter!");
        scan.nextLine();
        screen.updateScreen();
        initiateCombat();
        battle();
    }


    public void initiateCombat() {
        this.newDice.rollDice(this.player.getDieSize());
        if (this.newDice.diceRoll > this.player.getDieSize() - 1) {
            System.out.println("Dice roll " + this.newDice.diceRoll);
            System.out.println("\nYou don't hesitate and land the first strike!");
        } else if (newDice.diceRoll <= 4) {
            System.out.println("\n As the " + this.newEnemy.getName() + " draws near, you lock eyes with the beast.\n");
        }

    }

    public void battle() {
        if (this.newEnemy.getHealth() > 0) {
            screen.updateScreen();
            gameBoard.drawGameBoard(this.newEnemy, this.player);
            combatOptions();
            int choice = scan.nextInt();
            if (choice == 1) {
                playerMeleeAttack();
                enemyAttack();
                battle();

            } else if (choice == 2) {
                System.out.println("\n     You Have no Items you poor bastard!");
                screen.nextScreen();
                battle();

            } else
                System.out.println("\n     Pick a number corresponding to your choice! whatever you entered is not a choice");
            screen.nextScreen();
            battle();
        } else if (this.newEnemy.getHealth() <= 0) {
            screen.updateScreen();
            gameBoard.drawGameBoard(this.newEnemy, this.player);
            System.out.println("\n\n       Fuck ya bud you just beat up the little " + this.newEnemy.getName());
            screen.nextScreen();
        }
    }


    public void combatOptions() {
        System.out.print(" \n What will you do?\n" +
                "   1. Melee attack!\n" +
                "   2. Item\n" +
                "\n Choose wisely : ");


    }


    public void playerMeleeAttack() {
        this.newDice.rollDice(this.player.getDieSize());
        System.out.println("\n    Dice Roll = " + this.newDice.diceRoll);

        if (this.newDice.diceRoll > this.player.getDieSize() - 1) {
            this.newEnemy.setHealth(this.newEnemy.getHealth() - (this.player.getDamage() + 5));
            System.out.println("    CRITICAL FUCKIN HIT!\n" +
                    "    The " + this.newEnemy.getName() + "took " + (this.player.getDamage() + 5) + " damage.");
            screen.nextScreen();

        } else if (this.newDice.diceRoll > 1 && this.newDice.diceRoll < this.player.getDieSize()) {
            this.newEnemy.setHealth(this.newEnemy.getHealth() - this.player.getDamage());
            System.out.println("    Success! \n" +
                    "    The " + this.newEnemy.getName() + "took " + this.player.getDamage() + " damage.");
            screen.nextScreen();

        } else if (this.newDice.diceRoll < 2) {
            System.out.println("    MISS... WTF!");
            screen.nextScreen();

        }

    }

    public void enemyAttack() {
        this.newDice.rollDice(this.newEnemy.getDieSize());
        System.out.println("\n    Dice Roll = " + this.newDice.diceRoll);

        if (this.newDice.diceRoll > this.newEnemy.getDieSize() + 1) {
            this.player.setHealth(this.player.getHealth() - this.newEnemy.getDamage() + 5);
            System.out.println("    POW right in the kisser \n" +
                    "    Watchout the " + this.newEnemy.getName() + " hit you for " + (this.newEnemy.getDamage() + 5) + " damage.");
            screen.nextScreen();

        } else if (this.newDice.diceRoll > 1 && this.newDice.diceRoll < this.newEnemy.getDieSize() + 1) {
            this.player.setHealth(this.player.getHealth() - this.newEnemy.getDamage());
            System.out.println("    WHACK! \n" +
                    "    The " + this.newEnemy.getName() + " hit you for " + (this.newEnemy.getDamage()) + " damage.");
            screen.nextScreen();

        } else if (this.newDice.diceRoll < 2) {
            System.out.println("    Swing and a MISS... what a silly bitch!");
            screen.nextScreen();
        }
    }



}
