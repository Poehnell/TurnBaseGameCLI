package Main;

import java.io.IOException;

public class GameBoard {
    String enemyName, playerName;
    int enemyHP, enemyMP, playerHP, playerMP;

    public GameBoard(String enemyName, int enemyHP, int enemyMP, String playerName, int playerHP, int playerMP) {
        this.enemyName = enemyName;
        this.enemyHP = enemyHP;
        this.enemyMP = enemyMP;
        this.playerName = playerName;
        this.playerHP = playerHP;
        this.playerMP = playerMP;

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
                    System.out.print(enemyName);
                } else if (i == 2 && k == gameBoard[i].length / 2 + 2) {
                    System.out.print("HP : " + enemyHP);
                } else if (i == 3 && k == gameBoard[i].length / 2 + 2) {
                    System.out.print("MP : " + enemyMP);
                } else if (i == gameBoard.length / 2 && k >= 0 && k < gameBoard[i].length) {
                    System.out.print('`');
//hero section of game board---------------------------------------------
                } else if (i == gameBoard.length / 2 + 1 && k == gameBoard[i].length / 2 + 6) {
                    System.out.print(playerName);
                } else if (i == gameBoard.length / 2 + 2 && k == gameBoard[i].length / 2 + 2) {
                    System.out.print("HP : " + playerHP);
                } else if (i == gameBoard.length / 2 + 3 && k == gameBoard[i].length / 2 + 2) {
                    System.out.print("MP : " + playerMP);

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

    public void updateBoard() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
