package Items.scrolls;

import Enemys.Enemy;
import Items.Item;
import Player.Player;

public class Cure extends Item {
    private int heal = 30;
    private int manaCost = 10;

    public Cure(int id) {
        this.setid(id);

    }

    @Override
    public String name() {
        return "Cure";
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
        return new Cure(200);
    }

    @Override
    public boolean consumable() {
        return true;
    }

    @Override
    public void combatUse(Player player, Enemy enemy) {
        player.addHealth(heal);
        System.out.println("                        Your heal for " + heal);


    }

    @Override
    public void combatCast(Player player, Enemy enemy) {
        player.addHealth(heal);
        player.minusMana(manaCost);
        System.out.println("                        Your heal for " + heal);
    }

    public void use(Player player) {
        if (player.getSpellBag().getInventory().size() == 0) {
            player.getSpellBag().transferItem(this.create());
            System.out.println("\n                        You have learned " + this.name());

        } else if (player.getSpellBag().getItemByName(this.name()).name() == this.name()) {
            System.out.println("\n           What you forgot or you just reading this for a refresher?");

        } else {
            player.getSpellBag().transferItem(this.create());
            System.out.println("\n                        You have learned " + this.name());
        }
    }

    @Override
    public void cast(Player player) {
        player.addHealth(heal);
        player.minusMana(manaCost);
        if (player.getHealth() < (player.getVitality() * 2) - heal) {
            System.out.println("                        Your heal for " + heal);
        }
    }
}
