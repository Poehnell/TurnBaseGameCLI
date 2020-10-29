package Items;


import Enemys.Enemy;
import Player.*;

import java.io.Serializable;

public abstract class Item implements Serializable {

    private int quantity = 0;
    private int id = 0;

    public Item() {
    }


    public abstract String name();

    public abstract int cost();

    public abstract String type();

    public abstract Item create();

    public abstract boolean consumable();

    public abstract void combatUse(Player player, Enemy enemy);
    public abstract void combatCast(Player player, Enemy enemy);

    public abstract void use(Player player);

    public abstract void cast(Player player);

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void removeQuantity(int quantity) {
        this.quantity -= quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
