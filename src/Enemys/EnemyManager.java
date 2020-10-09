package Enemys;

import java.util.Random;

public class EnemyManager {
    Random rand = new Random();
    private Enemy newEnemy;

    public EnemyManager() {
        int pickedEnemy = rand.nextInt(2);
        System.out.println(pickedEnemy);
        if (pickedEnemy == 0) {
            this.newEnemy = new Goblin();


        } else if (pickedEnemy == 1) {
            this.newEnemy = new Troll();



        }
    }

    public Enemy getNewEnemy() {
        return newEnemy;
    }

    public void setNewEnemy(Enemy newEnemy) {
        this.newEnemy = newEnemy;
    }
}