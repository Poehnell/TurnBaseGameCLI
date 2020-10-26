package Items.EnemyTrophy;

import Enemys.Enemy;
import Items.Item;
import Player.*;

public class TrollEar extends Item {

    public TrollEar(int id){
        this.setid(id);


    }    @Override
    public String name() {
        return "Troll Ear";
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
        return new TrollEar(102);
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
