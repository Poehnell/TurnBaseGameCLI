package Enemys;

import java.util.Random;

public class EnemyManager {
    Random rand = new Random();
    protected String enemyName = "";
    protected int health, damage, mana;


    public EnemyManager() {
    }

    public void enemyPicker() { // feel like this needs a method instead of having to write out eac this.health = enemy.health
        if (rand.nextInt(1) + 1 == 1) {
            enemyName = "Goblin";
            Goblin goblin = new Goblin();
            this.health = goblin.health;
            this.damage = goblin.damage;
            this.mana = goblin.mana;
        } else if (rand.nextInt(1) + 1 == 2) {
            enemyName = "Troll";

        }
    }

    public String getEnemyName() {
        return enemyName;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}