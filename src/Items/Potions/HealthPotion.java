package Items.Potions;

import Enemys.Enemy;
import Items.Item;
import Player.Player;

public class HealthPotion extends Item {

    private int addHealth = 25;

    public HealthPotion(int id) {
        this.setid(id);
    }


    @Override
    public String name() {
        return "Health Potion";
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
        return new HealthPotion(1);
    }

    @Override
    public boolean consumable() {
        return true;
    }

    @Override
    public void use(Player player) {
        player.addHealth(addHealth);

    }

    @Override
    public void use(Enemy enemy) {

    }
}

