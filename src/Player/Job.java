package Player;

import java.util.ArrayList;

public class Job extends Player {
    protected int vitality = 1, strength = 1, wisdom = 1;
    protected String playerName, playerChoice;


    public Job(String playerName, String playerChoice) {
        super(2, 2, 2, 10);
        this.playerName = playerName;
        this.playerChoice = playerChoice;

    }


    public void heroChoice() {
        if (playerChoice == "Knight") {
            Knight knight = new Knight();
            baseStatMultiplier(knight.vitality, knight.strength, knight.wisdom);



        } else if (playerChoice == "Mage") {
            Mage mage = new Mage();
            baseStatMultiplier(mage.vitality, mage.strength, mage.wisdom);
        }
    }

    public void baseStatMultiplier(int vitality, int strength, int wisdom) {
        this.vitality = vitality;
        this.strength = strength;
        this.wisdom = wisdom;

        this.health = health * this.vitality;
        this.damage = damage * this.strength;
        this.mana = mana * this.wisdom;
    }

    public void updatePlayer(int playerHealth, int playerMana, int playerDamage, int playerGold, ArrayList<String> playerItems){
        this.health = playerHealth;
        this.mana = playerMana;
        this.damage = playerDamage;
        this.gold = playerGold;
        this.playersBag.items = playerItems;

    }

    public int getVitality() {
        return this.vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getPlayerChoice() {
        return playerChoice;
    }


}

