package Items.Potions;

import Enemys.Enemy;
import Items.Item;
import Player.Player;

public class ManaPotion extends Item {
    private int addMana = 10;



    public ManaPotion(int id) {
        this.setid(id);
    }


    @Override
    public String name() {
        return "Mana Potion";
    }


    @Override
    public int cost() {
        return 10;
    }

    @Override
    public String type() {
        return "Potion";
    }

    @Override
    public Item create() {
        return new ManaPotion(2);
    }

    @Override
    public boolean consumable() {
        return true;
    }


    @Override
    public void use(Player player) {

    }

    @Override
    public void use(Enemy enemy) {

    }
}


