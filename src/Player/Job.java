package Player;

public class Job extends Player {
    int vitality = 1, strength =1 , wisdom =1;
    String playerName, playerChoice;


    public Job(String playerName, String playerChoice) {
        super(2, 2, 2);
        this.playerName = playerName;
        this.playerChoice = playerChoice;


    }

    public void knight() {
        this.vitality = 10;
        this.strength = 5;
        this.wisdom = 2;
        baseStatMultiplier();
    }

    public void mage() {
        this.vitality = 5;
        this.strength = 2;
        this.wisdom = 10;
        baseStatMultiplier();
    }


    public void baseStatMultiplier() {
        this.life = life * vitality;
        this.damage = damage * strength;
        this.mana = mana * wisdom;
    }

    public void heroChoice() {
        if (playerChoice == "Knight") {
            knight();

        } else if (playerChoice == "Mage") {
            mage();
        }
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

