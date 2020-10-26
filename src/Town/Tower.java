package Town;

import Enemys.Enemy;
import Enemys.EnemyManager;
import Main.Combat;
import Main.Screen;
import Player.*;

public class Tower {
    private Player player;
    private Enemy enemy;
    private Menue menue;
    Screen screen = new Screen();
    private int decision;

    public Tower(Player player, Menue menue) {
        this.player = player;
        this.menue = menue;

    }

    public void mainFloor() {
        screen.updateScreen();
        screen.towerMainFloor();
        decision = screen.optionScreen();
        if (decision == 1) {
            this.player.setPlayerLocation(0);
        } else if (decision == 2) {
            this.enemy = new EnemyManager().getNewEnemy();
            new Combat(this.player, this.enemy).battle();
        } else if (decision == 3) {
            menue.menueScreen();
        } else if (decision == 0) {
            mainFloor();
        }
    }


    public void upperFloor() {
        screen.upperFloor();
        decision = screen.optionScreen();
        if (decision == 1) {
            this.player.setPlayerLocation(0);
        } else if (decision == 2) {
            this.enemy = new EnemyManager().getNewEnemy();
            new Combat(this.player, this.enemy).battle();
        } else if (decision == 3) {
            menue.menueScreen();
        } else if (decision == 0) {
            upperFloor();
        }
    }

    public void ropeFloor() {
        screen.ropeFloorNoRope();
        decision = screen.optionScreen();
        if (decision == 1) {
            this.player.setPlayerLocation(0);
            this.player.setTowerFloor(1);
        } else if (decision == 2) {
            this.player.addTowerFloor(1);
            this.enemy = new EnemyManager().getNewEnemy();
            new Combat(this.player, this.enemy);
        } else if (decision == 3) {
            menue.menueScreen();
        } else if (decision == 4) {
            if (this.player.getBag().findItemByType("Rope")) {
                if (this.player.getBag().getItemByName("Rope").getQuantity() >= (this.player.getTowerFloor() / 5)) {
                    this.player.getBag().removeItem(this.player.getBag().getItemByName("Rope"), this.player.getTowerFloor() / 5);
                    this.player.addRopeFloor(1);
                    this.player.setPlayerLocation(5);
                } else {
                    System.out.println("             Ha you think your Rope is infinitely long? " +
                            "\n          Your going to need more rope to reach the ground!");
                    screen.nextScreen();
                    ropeFloor();
                }
            }else{
                System.out.println("            You dont have anything that you can use as a rope. \n" +
                        "      Hell your shoe laces are not even long enough to hang yourself!");
                screen.nextScreen();
                ropeFloor();
            }
        }

    }


    public void ropeFloorWithRope() {
        screen.ropeFloorYesRope();
        decision = screen.optionScreen();
        if (decision == 1) {
            this.player.setPlayerLocation(0);
        } else if (decision == 2) {
            this.enemy = new EnemyManager().getNewEnemy();
            new Combat(this.player, this.enemy).battle();
        } else if (decision == 3) {
            menue.menueScreen();
        } else if (decision == 0) {
            ropeFloorWithRope();
        }
    }

}
