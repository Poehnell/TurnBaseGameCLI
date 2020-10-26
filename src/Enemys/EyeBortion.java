package Enemys;

import Items.EnemyTrophy.EyebortionEye;
import Items.Potions.HealthPotion;
import Items.Rope;
import Main.Dice;

public class EyeBortion extends Enemy {
    private Dice newDice = new Dice();

    public EyeBortion(){
        super("Eyebortion", "" +
                "░░░▄█▀▀▀▀▀▀▀██░░░░░░░░░░░░░░▄▄███▄░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░███▀▀▀▀▀▀▀▀▀█░░░░░░░░░░░██▀▀░░░▀█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░█░░░░░░░░░░░░░█░░░░░░░░░░█░░░▀▀░░█░░░░░░░░░░░░░░░░░▄▄▄▄▄░░░░░░░\n" +
                "░░▌░░░░░███░░░░░▐▌░░░░░░░░░░███▄▄▄█░░░░░░░░░░░░░░░▄▄██▄▄▄░▀█░░░░░\n" +
                "░░█░░░░▐███░░░░░▐░░░░░░░░░░░██░░░░░░░░░░░░░░░░░░░█░░░░░░░▀▀▀█░░░░\n" +
                "░░██▄▄▄▄▄▄▄▄▄▄▄██▄▄░░░░░░░░▄███████████▄▄░░░░░░░▐░░░░░█░░░░░█░░░░\n" +
                "░░░█▄░░░░░░░░▄██▀███▄▄░░░███▀▀▀░░░░░░░▀▀███▄░░░░▐▄▄▄░░░░▄▄▄▄▌░░░░\n" +
                "░░░░░▀▀▀▀▀▀▀▀▀██░░░░█████▀░░░░░░░▀▀▀░░░░░░███░░░░█░░▀▀▀▀░░▄▀░░░░░\n" +
                "░░░░░░░░░░░░░░░▀▀█▄░▐██████▄▄▄▄▄▄▄▄▄▄▄▄▄▄█████░░░░▀█▄▄▄▄█▀░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░▀███░░░▐██▀▀█████████▀░░░░██░░░█▌░░██░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░█░░░░█░░░░▄▄▄▄▀░░░▀█░░░░░█████░░█░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░▐▌░░░▐░░░░▐██░░█░░░░▐░░░░░▐███▄█▀░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░█░░░░▐░░░░▐████░▌░░░▐░░░░░░███░░░░░░░░░░░░░░░\n" +
                "░░░░░░▄█▀▀███▄▄▄█████▄▄░░░█░░░░▀███▀░░░░█░░░░░▐██░░░░░░░░░░░░░░░░\n" +
                "░░░░▄█░░░▌░░░████░▄▄█░░▀▀███▄░░░░░░░░░▄██▄▄▄▀▀███░░░░░░░░░░░░░░░░\n" +
                "░░░▄█▄▄▄▄▄▄▄▄▄████░░░█▄░░░░░░▀▀▀▀▀▀▀▀▀░░░░░░░░██▀░░░░░░░░░░░░░░░░\n" +
                "░░▄█░░░░░░░░░░░░█░░░░░██▄░░▀▀▀█▄▄░░░▄▄▄▄█▀░░░██░░░░░░░░░░░░░░░░░░\n" +
                "░░▐░░░░░██░░░░░░█░░░░░░░▀█▄▄░░░░░░░░░░░░░░░██▀░░░░░░░░░░░░░░░░░░░\n" +
                "░░░▌░░░░▀▀░░░░░░█░░░░░░░░░░▀████▄▄▄▄▄▄▄███▀░░░░░░░░░░░░░▀▀▀▀▀▀▀▀░\n" +
                "░░░▀██▀█▄▄▄▄▄▄████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░▀▀▄▄▄▄▄██▀▀░░▄▄▄▄▄▄▄▄▄▄▄▄▄▄░░░░░▄▄▄▄▄▄▄▄▄░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▀▀█████▄▄░░░░░░░░▄▄▄░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀░░░░░░░░░░░░░░░░░░░░░░░░░░\n", 200,20,50,12);
        System.out.println(this.enemyImage);
        bag.addItem(new EyebortionEye(103), 3);
        newDice.rollDice(dieSize);
        if (newDice.getDiceRoll() > 4) {
            bag.addItem(new HealthPotion(1), 1);
        }
        if (newDice.getDiceRoll() > 10) {
            bag.addItem(new Rope(0), 1);


        }
    }
}