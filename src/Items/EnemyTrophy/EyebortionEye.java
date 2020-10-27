package Items.EnemyTrophy;

import Enemys.Enemy;
import Items.Item;
import Player.*;

public class EyebortionEye extends Item {



    public EyebortionEye(int id){
        this.setid(id);

    }

    @Override
    public String name() {
        return "Eyebortion Eye";
    }

    @Override
    public int cost() {
        return 30;
    }

    @Override
    public String type() {
        return "Trophy";
    }

    @Override
    public Item create() {
        return new EyebortionEye(103);
    }

    @Override
    public boolean consumable() {
        return false;
    }

    @Override
    public void combatUse(Player player, Enemy enemy) {

    }

    @Override
    public void combatCast(Player player, Enemy enemy) {

    }

    public void use(Player player) {

    }

    @Override
    public void cast(Player player) {

    }
}
