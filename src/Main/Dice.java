package Main;

import java.util.Random;

public class Dice {
    Random random = new Random();
    int diceRoll = 1;

    public Dice() {
    }

    public void rollDice(int diceSize) {
        this.diceRoll = random.nextInt(diceSize) + 1;
    }

}
