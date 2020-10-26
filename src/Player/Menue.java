package Player;

import Main.Screen;

public class Menue {
        Player player;
        Screen screen = new Screen();
        private int decission;

    public Menue(Player player){
        this.player = player;
    }
    public void menueScreen(){
        screen.playerMenue();
        System.out.println("                                               Tower Floor: " + this.player.towerFloor +
                "\n                                               Gold: " + this.player.gold +
                "\n   Health: " + this.player.health + " / " + this.player.vitality * 2 +
                "\n   Mana: " + this.player.mana + " / " + this.player.wisdom * 2 +
                "\n   Vitality: " + this.player.vitality +
                "\n   Wisdom: " + this.player.wisdom +
                "\n   Strength: " + this.player.strength +
                "\n   Dice Size: " + this.player.dieSize +
                "\n\n\n 1. Return " +
                "\n 2. Inventory \n\n");
        this.decission = screen.optionScreen();
        if (this.decission == 1){
            this.player.setPlayerLocation(this.player.getPlayerLocation());
        }else if (this.decission == 2){
            inventoryMenue();


        }

    }

    public void inventoryMenue(){
        int previousMenue = this.player.bag.getInventory().size() + 1;
        screen.updateScreen();
        screen.playerInventory();
        this.player.bag.showInventoryAll();
        System.out.println("\n " + previousMenue + ". - Return");
        this.decission = screen.optionScreen();
        if (this.decission == previousMenue){
            menueScreen();
        }else if (this.decission == 0){
            menueScreen();
        }else{
            useItem();
            menueScreen();
        }
    }
    public void useItem(){
        if (this.player.getBag().getItem(decission - 1).consumable()){
            this.player.getBag().getItem(decission - 1).use(this.player);
            this.player.getBag().removeItem(player.getBag().getItem(decission - 1), 1);
        }

    }
}
