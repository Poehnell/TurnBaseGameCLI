package Enemys;

import java.util.Random;

public class EnemyManager {
    Random rand = new Random();
    protected String enemyName = "";
    protected int health, damage, mana;


    protected String enemyImage;


    public EnemyManager() {
    }

    public void enemyPicker() {
        int pickedEnemy = rand.nextInt(2);
        if (pickedEnemy == 0) {
            enemyName = "Goblin";
            Goblin goblin = new Goblin();
            this.health = goblin.health;
            this.damage = goblin.damage;
            this.mana = goblin.mana;
            this.enemyImage = goblin.image;
        } else if (pickedEnemy == 1) {
            enemyName = "Troll";
            Troll troll = new Troll();
            this.health = troll.health;
            this.damage = troll.damage;
            this.mana = troll.mana;
            this.enemyImage = troll.image;

        }
    }


    public String getEnemyName() {
        return enemyName;
    }

    public String getEnemyImage() {
        return enemyImage;
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