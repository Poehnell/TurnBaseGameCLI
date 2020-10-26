package Items;

import Enemys.Enemy;
import Player.Player;

public class Rope extends Item{

    public Rope(int id){
        this.setid(id);
    }
    @Override
    public String name() {
        return "Rope";
    }

    @Override
    public int cost() {
        return 50;
    }

    @Override
    public String type() {
        return "Rope";
    }

    @Override
    public Item create() {
        return new Rope(0);
    }

    @Override
    public boolean consumable() {
        return false;
    }

    @Override
    public void combatUse(Player player, Enemy enemy) {
        player.addRopeFloor(1);

    }

    @Override
    public void use(Player player) {
        player.addRopeFloor(1);
    }

    @Override
    public void cast(Player player) {

    }
}
