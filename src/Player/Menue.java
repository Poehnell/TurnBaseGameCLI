package Player;

import Main.Screen;

public class Menue {
    Player player;
    Screen screen = new Screen();
    private int decission;

    public Menue(Player player) {
        this.player = player;
    }

    public void menueScreen() {
        screen.playerMenue();
        System.out.println("                                               Tower Floor: " + this.player.towerFloor +
                "\n                                               Gold: " + this.player.gold +
                "\n                                               Lives: " + this.player.lives +
                "\n   Health: " + this.player.health + " / " + this.player.vitality * 2 +
                "\n   Mana: " + this.player.mana + " / " + this.player.wisdom * 2 +
                "\n   Vitality: " + this.player.vitality +
                "\n   Wisdom: " + this.player.wisdom +
                "\n   Strength: " + this.player.strength +
                "\n   Dice Size: " + this.player.dieSize +
                "\n\n\n 1. Return " +
                "\n 2. Inventory " +
                "\n 3. Magic ");
        this.decission = screen.optionScreen();
        if (this.decission == 1) {
            this.player.setPlayerLocation(this.player.getPlayerLocation());
        } else if (this.decission == 2) {
            inventoryMenue();
        } else if (this.decission == 3) {
            magicMenue();
        }

    }

    public void inventoryMenue() {
        int previousMenue = this.player.itemBag.getInventory().size() + 1;
        screen.updateScreen();
        screen.playerInventory();
        System.out.println("                                               Health: " + this.player.health + " / " + this.player.vitality * 2 +
                "\n                                               Mana: " + this.player.mana + " / " + this.player.wisdom * 2 +
                "\n                                               Lives: " + this.player.lives);
        this.player.itemBag.showInventoryAll();
        System.out.println("\n " + previousMenue + ". - Return");
        this.decission = screen.optionScreen();
        if (this.decission == previousMenue) {
            menueScreen();
        } else if (this.decission == 0) {
            menueScreen();
        } else {
            useItem();
            screen.nextScreen();
            inventoryMenue();
        }
    }

    public void magicMenue() {
        int previousMenue = this.player.spellBag.getInventory().size() + 1;
        screen.updateScreen();
        screen.playerMagic();
        System.out.println("                                               Health: " + this.player.health + " / " + this.player.vitality * 2 +
                "\n                                               Mana: " + this.player.mana + " / " + this.player.wisdom * 2 +
                "\n                                               Lives: " + this.player.lives);
        this.player.spellBag.showInventoryByType("Spell");
        System.out.println("\n " + previousMenue + ". - Return");
        this.decission = screen.optionScreen();
        if (this.decission == previousMenue) {
            menueScreen();
        } else if (this.decission == 0) {
            magicMenue();
        } else {
            castSpell();
            screen.nextScreen();
            magicMenue();
        }
    }

    public void useItem() {
        if (this.player.getItemBag().getItem(decission - 1).consumable()) {
            this.player.getItemBag().getItem(decission - 1).use(this.player);
            this.player.getItemBag().removeItem(player.getItemBag().getItem(decission - 1), 1);
        }

    }

    public void castSpell() {
        this.player.getSpellBag().getItem(decission - 1).cast(this.player);
    }
}
