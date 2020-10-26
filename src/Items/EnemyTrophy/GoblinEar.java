package Items.EnemyTrophy;

import Enemys.Enemy;
import Items.Item;
import Player.*;

public class GoblinEar extends Item {


    public  GoblinEar(int id){
        this.setid(id);
    }
    @Override
    public String name() {
        return "Goblin Ear";
    }

    @Override
    public int cost() {
        return 20;
    }

    @Override
    public String type() {
        return "Trophy";
    }

    @Override
    public Item create() {
        return new GoblinEar(101);
    }

    @Override
    public boolean consumable() {
        return false;
    }

    @Override
    public void combatUse(Player player, Enemy enemy) {

    }

    public void use(Player player) {
    }

    @Override
    public void cast(Player player) {

    }

}
