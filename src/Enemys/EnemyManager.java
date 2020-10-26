package Enemys;

import Player.*;

import java.util.Random;

public class EnemyManager {
    Random rand = new Random();
    private Enemy newEnemy;
    private int decission;
    private Player player;

    public EnemyManager(Player player) {
        this.player = player;
        decission = rand.nextInt(2);
        if (this.player.getTowerFloor() < 5) {
            enemyFloors1();
        } else if (this.player.getTowerFloor() < 10 && this.player.getTowerFloor() > 4) {
            enemyFloors2();
        }


    }

    public void enemyFloors1() {
        if (decission == 0) {
            this.newEnemy = new Goblin();

        } else if (decission == 1) {
            this.newEnemy = new Troll();
        }
    }

    public void enemyFloors2() {
        if (decission == 0) {
            this.newEnemy = new HairyBlob();

        } else if (decission == 1) {
            this.newEnemy = new EyeBortion();
        }

    }

    public Enemy getNewEnemy() {
        return newEnemy;
    }

    public void setNewEnemy(Enemy newEnemy) {
        this.newEnemy = newEnemy;
    }
}
