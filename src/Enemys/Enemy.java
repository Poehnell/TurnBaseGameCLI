package Enemys;

import java.util.Random;

public class Enemy {
    protected int enemyHealth, enemyDamage, enemyMana;


    protected String enemyName = "";

    public Enemy() {
        Random rand = new Random();

        if (rand.nextInt(1)+1 == 1) {
            enemyName = "Goblin";
        } else if (rand.nextInt(1)+1 == 2) {
            enemyName = "Troll";
        } else
            enemyName = "BOB!";
    }


    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyStats(int enemyHealth,int enemyDamage, int enemyMana){
        this.enemyHealth = enemyHealth;
        this.enemyDamage = enemyDamage;
        this.enemyMana = enemyMana;
    }

    
}
