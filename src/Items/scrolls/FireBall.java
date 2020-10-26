package Items.scrolls;

import Enemys.Enemy;
import Items.Item;
import Player.Player;

public class FireBall extends Item {
    private int manaCost = 20;
    private int damage = 50;

    public FireBall(int id) {
        this.setid(id);
    }

    @Override
    public String name() {
        return "FireBall";
    }

    @Override
    public int cost() {
        return 5;
    }

    @Override
    public String type() {
        return "Spell";
    }

    @Override
    public Item create() {
        return new FireBall(102);
    }

    @Override
    public boolean consumable() {
        return true;
    }

    @Override
    public void combatUse(Player player, Enemy enemy) {
        enemy.minusHealth(damage);
        player.minusMana(manaCost);
        System.out.println("               KABOOM! you hit the " + enemy.getName() + "for " + damage + " Fire damage");

    }


    @Override
    public void use(Player player) {
        if (player.getSpellBag().getInventory().size() == 0){
            player.getSpellBag().transferItem(this.create());
            System.out.println("\n                      You have learned " + this.name());
        }
        else if (player.getSpellBag().getItemByName(this.name()).name() == this.name()) {
            System.out.println("\n         What you forgot or you just reading this for a refresher?");
        } else {
            player.getSpellBag().transferItem(this.create());
            System.out.println("\n                      You have learned " + this.name());
        }
    }

    public void cast(Player player) {
        System.out.println("         What your hands getting cold. Dont waist your mana!");
    }
}

