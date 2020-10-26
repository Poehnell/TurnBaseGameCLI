package Items.EnemyTrophy;

import Enemys.Enemy;
import Items.Item;
import Player.Player;

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
        return "Sellable";
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
    public void use(Player player) {

    }

    @Override
    public void use(Enemy enemy) {
    }

}
