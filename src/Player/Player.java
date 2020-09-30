package Player;

import static Main.DataInput.playerChoice;
import static Main.DataInput.playerName;

public class Player {
    protected int health, mana, damage;


    public Player(int health, int mana, int damage) {
        this.health = health;
        this.mana = mana;
        this.damage = damage;
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



