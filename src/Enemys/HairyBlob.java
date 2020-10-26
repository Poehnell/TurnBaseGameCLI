package Enemys;

import Items.EnemyTrophy.BlobHair;
import Items.Potions.HealthPotion;
import Items.Rope;
import Main.Dice;

public class HairyBlob extends Enemy {
    private Dice newDice = new Dice();


    public HairyBlob() {
        super("Hairy Blob", "" +
                "░░░░░░░░░░░░░░░░░░▄▄▄█████████████████▄▄▄░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░▄███████████████████████████▄░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░████████████████████████████▀█▀▀█▄░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░██░░▄█▀█░░▐▀▀▀█▀▀▀▀███▀▀░█░░▐░░░░░░░█▄░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░█░░░░░░░▀░░░░░░█░░░░░█░░░░░░░░░░░░░░░░▐▄░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▀█░░░░░░░░░░░░░\n" +
                "░░░░░░░░█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█░░░░░░░░░░░░\n" +
                "░░░░░░░█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█░░░░░░░░░░░\n" +
                "░░▄▄▄░█░█▐░█░░░░▐░▌░░▌▌░░░▐▄░░▐░░░░░░░▄░░░░█░░█░░░█░░▐█░▄▄▄░░░░░░\n" +
                "░░░░░▐▀░░░░░█░▀░▐░░░░█░█▀░░░▐░░█░░█░░▐░▐░░█░░█▀░░░▀░▐░█░░░░░░░░░░\n" +
                "░░░▄██░░░▄█░░░░░░░░░░░█░░▄░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█░█▄░░░░░░\n" +
                "░░█░░█░░█░░░░░░░░░▌░░░░░░█░░░▌░░░░░░░░░░░█░░░░░░░░▄░░░░██░░░░░░░░\n" +
                "░░░▄▀▐░░▌░░░░▀▀▌░▐░░░░░░░▐░░░▌░▌░░░░▐░░░░░░░░░▄░░░░▐░░░░█▀█▄░░░░░\n" +
                "░░░░░█░░░░░░░░░░░▐░░░░░░░░░░▐░█░░░░░░█░░░░░░░▌░▀█░░▐░░░░█░░░▀░░░░\n" +
                "░░░░██░░░░█░░░░░░░░▄▄▀▀░░░░░░░░░░░░░░░░░▐░▌░▐░░░░░░░░░█░▌█░░░░░░░\n" +
                "░░░░░▐░░░░▐░░░█░░░░░░▐░░░░░░▐░░░░░░░░░░░▐░█░▀░░░░░░░░░▐██░░░░░░░░\n" +
                "░░▀░░░█░░░░░░█░░░░░░░░▌░░░░░░░░░░░░░▌░░░░░░█░░░▌░░▄░▌░░█░▀█░░░░░░\n" +
                "░░░░░░█░░░░░░▌░░░░▄▄▄░░░░░░▌░░░░█░░░▄▄▄▄░░░░░░░▌░░░░▐░░█░░░░░░░░░\n" +
                "░░░░░█▐█░░▌░░▌░▄██▀░▐▀█▄░░░▐░░░░░░█▀░░█░▀▀█░░░▐░░░░░░▀▀█▌░░░░░░░░\n" +
                "░░░░▐░░▀█▄█▄█▀▀░░▐░░▐░░░▀█▄██▄▄▄█▀░▌░░▐░░░▌▀█░░░░░░░░█▀░█▄░░░░░░░\n" +
                "░░░░░░░░░██▌░░░░░░▌░░░░░░░░░███░░░░░░░░░░░▀░░▀█▀███▀▀░░░░░░░░░░░░\n" +
                "░░░░░░░░░▐█░░░░░░░░░░░░░░░░░░█░░░░░░░░░░░░░░░░░░░█░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n", 250, 25, 100, 12);
        System.out.println(this.enemyImage);
        bag.addItem(new BlobHair(104), 3);
        newDice.rollDice(dieSize);
        if (newDice.getDiceRoll() > 4) {
            bag.addItem(new HealthPotion(1), 1);
        }
        if (newDice.getDiceRoll() > 10) {
            bag.addItem(new Rope(0), 1);
        }
    }
}