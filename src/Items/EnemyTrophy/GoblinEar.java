package Items.EnemyTrophy;

import Enemys.Enemy;
import Items.Item;
import Player.Player;

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
        return "Sellable";
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
    public void use(Player player) {

    }

    @Override
    public void use(Enemy enemy) {
    }

}
