package Main;

public class GameBoard {
    public GameBoard() {
        int[][] gameBoard = new int[16][31];
        for (int i = 0; i < gameBoard.length; i++) {
            System.out.print('|');
            for (int k = 0; k < gameBoard[i].length; k++) {
                if (i == 0 || i == gameBoard.length - 1) {
                    System.out.print('-');
                } else if (i == 1 && k == gameBoard[i].length / 2) {
                    System.out.print('E');
                } else if (i == gameBoard.length / 2 && k >= 0 && k < gameBoard[i].length) {
                    System.out.print('`');

                } else if (i == gameBoard.length - 2 && k == gameBoard[i].length / 2) {
                    System.out.print('H');
                } else if (k >= 0 && k < gameBoard[i].length) {
                    System.out.print(' ');
                }
                if (k == gameBoard[i].length - 1) {
                    System.out.print('|');
                }

            }
            System.out.println();
        }
    }
}
