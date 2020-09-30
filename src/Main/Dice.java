package Main;

import java.util.Random;

public class Dice {
    Random random = new Random();
    int diceRoll = 1;
    int diceSize = 1;

    public Dice(int dieSize) {
        this.diceSize = dieSize;
        this.diceRoll = random.nextInt(diceSize) + 1;

    }

}
