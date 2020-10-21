package Main;

import Enemys.Enemy;
import Enemys.EnemyManager;
import Player.Player;
import Town.Town;


import java.util.Scanner;

public class Combat {
    private Player player;
    private Enemy newEnemy;
    private Dice newDice = new Dice();
    Scanner scan = new Scanner(System.in);
    GameBoard gameBoard = new GameBoard();
    Screen screen = new Screen();
    private int decision;
    private int towerFloor;
    private boolean playerTurn = true;


    public Combat(Player player, Enemy newEnemy, int towerFloor) {
        this.player = player;
        this.newEnemy = newEnemy;
        this.towerFloor = towerFloor;
        screen.updateScreen();
        initiateCombat();
        battle();
    }


    public void initiateCombat() {
        screen.updateScreen();
        System.out.println(newEnemy.getEnemyImage());
        System.out.println("\n A " + this.newEnemy.getName() + " is attacking! ");
        screen.nextScreen();
        this.newDice.rollDice(this.player.getDieSize());
        if (this.newDice.diceRoll > this.player.getDieSize() - 1) {
            screen.updateScreen();
            System.out.println(newEnemy.getEnemyImage());
            System.out.println("Dice roll " + this.newDice.diceRoll);
            System.out.println("\nYou don't hesitate and land the first strike!");
            screen.nextScreen();
        } else if (newDice.diceRoll <= 4) {
            screen.updateScreen();
            System.out.println(newEnemy.getEnemyImage());
            System.out.println("\n As the " + this.newEnemy.getName() + " draws near, you lock eyes with the beast.\n");
            screen.nextScreen();
        }

    }

    public void battle() {
        if (!loosing()) {
            if (this.newEnemy.getHealth() > 0) {
                battleArena();
                if (playerTurn) {
                    combatOptions();
                    decision = scan.nextInt();
                    if (decision == 1) {
                        playerMeleeAttack();
                        winning();
                        playerTurn = false;
                        battle();

                    } else if (decision == 2) {
                        System.out.println("\n     You Have no Items you poor bastard!");
                        screen.nextScreen();
                        loosing();
                        battle();

                    } else if (decision == 0)
                        System.out.println("\n     Pick a number corresponding to your choice! whatever you entered is not a choice");
                    screen.nextScreen();
                    battle();
                } else if (!playerTurn) {
                    enemyAttack();
                    playerTurn = true;
                    battle();
                }
            }
        }
    }

    public void battleArena() {
        screen.updateScreen();
        gameBoard.drawGameBoard(this.newEnemy, this.player);

    }


    public void winning() {
        if (this.newEnemy.checkEnemyDeath()) {
            screen.victory();
            System.out.println("\n\n       Fuck ya bud you just beat up the little " + this.newEnemy.getName());
            screen.nextScreen();
            screen.upperFloor();
            decision = screen.optionScreen();
            if (decision == 1) {
                this.player.setPlayerLocation(0);
                towerFloor = 1;
            } else if (decision == 2) {
                towerFloor++;
                this.newEnemy = new EnemyManager().getNewEnemy();
                new Combat(this.player, this.newEnemy, this.towerFloor);

            } else if (decision == 0) {
                winning();
            }
        }
    }

    public boolean loosing() {
        if (this.player.checkDeath() && player.getLives() > 0) {
            screen.youAreDead();
            player.minusLives(1);
            this.player.setHealth(1);
            towerFloor = 1;
            this.player.setPlayerLocation(0);
            return true;
        } else if (this.player.getLives() <= 0) {
            this.player.setGameOver(true);
            return true;

        }
        return false;
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
