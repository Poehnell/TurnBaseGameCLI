package Player;


import Items.ItemBag;

public class Player {
    protected int health, mana, damage, gold;
    ItemBag playersBag = new ItemBag();


    public Player(int health, int mana, int damage, int gold) {
        this.health = health;
        this.mana = mana;
        this.damage = damage;
        this.gold = gold;



    }

    public ItemBag getPlayersBag() {
        return playersBag;
    }

    public void setPlayersBag(ItemBag playersBag) {
        this.playersBag = playersBag;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getHealth() {

        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}



