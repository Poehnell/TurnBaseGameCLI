package Enemys;


import Items.ItemBag;

public class Enemy {
    protected int health, damage, mana, dieSize;
    protected String name = "";
    protected String enemyImage = "";
    protected ItemBag bag = new ItemBag();


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

    public String getEnemyImage() {
        return enemyImage;
    }
    public ItemBag getBag() {
        return bag;
    }

    public void setBag(ItemBag bag) {
        this.bag = bag;
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

    public boolean checkEnemyDeath() {
        if (this.getHealth() <= 0) {
            return true;
        }else
            return false;
    }
}
