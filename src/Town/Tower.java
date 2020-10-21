package Town;

import Enemys.Enemy;
import Enemys.EnemyManager;
import Main.Combat;
import Main.Screen;
import Player.Player;

public class Tower {
    private Player player;
    private Enemy enemy;
    Screen screen = new Screen();
    private int decision;
    private int floor = 1;

    public Tower(Player player){
        this.player = player;

    }
    public void mainFloor(){
        screen.updateScreen();
        screen.towerMainFloor();
        decision = screen.optionScreen();
        if (decision == 1){
            this.player.setPlayerLocation(0);

        }else if (decision == 2){
            this.enemy = new EnemyManager().getNewEnemy();
            new Combat(this.player, this.enemy,this.floor);
        }
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
