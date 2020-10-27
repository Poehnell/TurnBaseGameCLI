package Main;

import Enemys.Enemy;
import Enemys.EnemyManager;
import Player.Player;

import java.io.IOException;

public class GameBoard {

    private Player player;
    private Enemy enemy;
    public GameBoard(){

    }

    public void drawGameBoard(Enemy enemy, Player player) {
        this.player = player;
        this.enemy = enemy;

        int[][] gameBoard = new int[16][61];
        for (int i = 0; i < gameBoard.length; i++) {
            System.out.print('|');
            for (int k = 0; k < gameBoard[i].length; k++) {
                if (i == 0 && k < gameBoard[i].length / 2 || i == gameBoard.length - 1 && k < gameBoard[i].length / 2) {
                    System.out.print('-');
//enemy section of game board------------------------------------------
                } else if (i == 1 && k == gameBoard[i].length / 4) {
                    System.out.print('E');
                } else if (i == 1 && k == gameBoard[i].length / 2 + 6) {
                    System.out.print(this.enemy.getName());
                } else if (i == 2 && k == gameBoard[i].length / 2 + 2) {
                    System.out.print("HP : " + this.enemy.getHealth());
                } else if (i == 3 && k == gameBoard[i].length / 2 + 2) {
                    System.out.print("MP : " + this.enemy.getMana());
                } else if (i == gameBoard.length / 2 && k >= 0 && k < gameBoard[i].length) {
                    System.out.print('`');
//hero section of game board---------------------------------------------
                } else if (i == gameBoard.length / 2 + 1 && k == gameBoard[i].length / 2 + 6) {
                    System.out.print(this.player.getPlayerName());
                } else if (i == gameBoard.length / 2 + 2 && k == gameBoard[i].length / 2 + 2) {
                    System.out.print("HP : " + this.player.getHealth() + " / " + (this.player.getVitality() * 2));
                } else if (i == gameBoard.length / 2 + 3 && k == gameBoard[i].length / 2 + 2) {
                    System.out.print("MP : " + this.player.getMana() + " / " + (this.player.getWisdom() * 2));

                } else if (i == gameBoard.length - 2 && k == gameBoard[i].length / 4) {
                    System.out.print('H');
                } else if (k >= 0 && k < gameBoard[i].length) {
                    System.out.print(' ');
                }
                if (k == gameBoard[i].length / 2) {
                    System.out.print('|');
                }

            }
            System.out.println();
        }
    }
}