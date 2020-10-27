package Main;

import Enemys.Enemy;
import Player.Player;


import java.util.Scanner;

public class Combat {
    private Player player;
    private Enemy newEnemy;
    private Dice newDice = new Dice();
    Scanner scan = new Scanner(System.in);
    GameBoard gameBoard = new GameBoard();
    Screen screen = new Screen();
    private int decision;
    private boolean playerTurn = true;
    private boolean playerDead = false;


    public Combat(Player player, Enemy newEnemy) {
        this.player = player;
        this.newEnemy = newEnemy;
        screen.updateScreen();
        initiateCombat();
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
            battle();
        } else if (newDice.diceRoll <= 4) {
            screen.updateScreen();
            System.out.println(newEnemy.getEnemyImage());
            System.out.println("\n As the " + this.newEnemy.getName() + " draws near, you lock eyes with the beast.\n");
            screen.nextScreen();
            battle();
        }

    }

    public void combatOptions() {
        System.out.print(" \n What will you do?\n" +
                "   1. Melee attack!\n" +
                "   2. Magic\n" +
                "   3. Item" +
                "\n\n Choose wisely : ");


    }

    public void battle() {
        if (this.newEnemy.getHealth() > 0 && playerDead == false) {
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
                    magicMenue();
                } else if (decision == 3) {
                    itemsMenue();
                } else if (decision == 0) {
                    System.out.println("\n     Pick a number corresponding to your choice! whatever you entered is not a choice");
                    screen.nextScreen();
                    battle();
                }

            } else if (!playerTurn) {
                enemyAttack();
                died();
                playerTurn = true;
                battle();
            }
        }
    }

    public void magicMenue() {
        if (player.getSpellBag().getInventory().size() == 0) {
            System.out.println("\n Knock Knock.......Who's there?");
            screen.nextScreen();
            screen.updateScreen();
            battleArena();
            System.out.println("\n\n No spells in here! That's who!");
            screen.nextScreen();
            battle();
        } else {
            screen.updateScreen();
            battleArena();
            System.out.println("\n                MAGIC \n");
            int previousMenue = player.getSpellBag().getInventory().size() + 1;
            this.player.getSpellBag().showInventoryByType("Spell");
            System.out.println("\n " + previousMenue + ". - Return");
            decision = screen.optionScreen();
            if (decision == previousMenue) {
                battle();
            } else if (decision == 0) {
                battle();
            } else {
                castSpell();
                playerTurn = false;
                screen.nextScreen();
                winning();
                battle();
            }
        }
    }


    public void itemsMenue() {
        if (player.getItemBag().getConsumableAmount() == 0) {
            System.out.println(" WTF you think this is a magic bag? you got nothing that can be used right now.");
            screen.nextScreen();
            battle();
        }
        screen.updateScreen();
        battleArena();
        System.out.println("\n                ITEMS \n");
        int previousMenue = player.getItemBag().getConsumableAmount() + 1;
        this.player.getItemBag().showInventoryConsumable();
        System.out.println("\n " + previousMenue + ". - Return");
        decision = screen.optionScreen();
        if (decision == previousMenue) {
            battle();
        } else if (decision == 0) {
            battle();
        } else {
            useItem();
            winning();
            screen.nextScreen();
            playerTurn = false;
            battle();
        }

    }

    public void battleArena() {
        screen.updateScreen();
        gameBoard.drawGameBoard(this.newEnemy, this.player);

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

    public void useItem() {
        this.player.getItemBag().getItem(decision - 1).combatUse(this.player, this.newEnemy);
        this.player.getItemBag().removeItem(player.getItemBag().getItem(decision - 1), 1);
    }

    public void castSpell() {
        this.player.getSpellBag().getItem(decision - 1).combatCast(this.player, this.newEnemy);
    }

    public void winning() {
        if (this.newEnemy.checkEnemyDeath()) {
            screen.victory();
            System.out.println("\n\n       Fuck ya bud you just beat up the little " + this.newEnemy.getName());
            this.newEnemy.getBag().showInventoryAll();
            this.player.getItemBag().transferAllItem(this.newEnemy.getBag());
            screen.nextScreen();
            this.player.addTowerFloor(1);
            if (this.player.getTowerFloor() % 5 == 0) {
                this.player.setPlayerLocation(4);
            } else {
                this.player.setPlayerLocation(3);
            }
        }
    }

    public void died() {
        if (this.player.checkDeath() && player.getLives() > 0) {
            screen.youAreDead();
            player.minusLives(1);
            this.player.setHealth(1);
            this.player.setTowerFloor(1);
            this.player.setPlayerLocation(0);
            playerDead = true;
        } else if (this.player.getLives() <= 0) {
            this.player.setGameOver(true);
            playerDead = true;

        }
    }
}
