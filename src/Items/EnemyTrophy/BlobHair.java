package Items.EnemyTrophy;

import Enemys.Enemy;
import Items.Item;
import Player.Player;

public class BlobHair extends Item {


    public BlobHair(int id){
        this.setid(id);
    }

    @Override
    public String name() {
        return "Blob Hair";
    }

    @Override
    public int cost() {
        return 30;
    }

    @Override
    public String type() {
        return "Enemy";
    }

    @Override
    public Item create() {
        return new BlobHair(104);
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
