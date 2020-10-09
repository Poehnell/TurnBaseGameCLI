package Enemys;


public class Enemy {
    protected int health, damage, mana, dieSize;
    protected String name = "";
    protected String enemyImage = "";


    public Enemy(String name, String enemyImage, int health, int damage, int mana, int dieSize) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.mana = mana;
        this.dieSize = dieSize;
        this.enemyImage = enemyImage;
    }

    public int getDieSize() {
        return dieSize;
    }

    public void setDieSize(int dieSize) {
        this.dieSize = dieSize;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
