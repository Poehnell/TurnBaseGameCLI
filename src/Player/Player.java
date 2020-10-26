package Player;

import Items.ItemBag;
import Main.Screen;

public class Player {
    protected int health, mana, damage, gold, dieSize, towerFloor, ropeFloor;
    protected int vitality, wisdom, strength;
    protected int playerLocation;
    protected int decission;
    protected int lives = 3;
    protected boolean gameOver = false;
    protected boolean inCombat = false;
    protected String playerName = "nope";
    protected String playerJob = "nope";
    protected ItemBag itemBag = new ItemBag();
    protected ItemBag spellBag = new ItemBag();
    Screen screen = new Screen();


    public Player(int vitality, int wisdom, int strength, int gold, int dieSize) {
        this.health = vitality * 2;
        this.mana = wisdom * 2;
        this.damage = strength * 2;
        this.gold = gold;
        this.vitality = vitality;
        this.wisdom = wisdom;
        this.strength = strength;
        this.dieSize = dieSize;


    }

    public int getDieSize() {
        return dieSize;
    }

    public void setDieSize(int dieSize) {
        this.dieSize = dieSize;
    }

    public ItemBag getItemBag() {
        return itemBag;
    }


    public void setItemBag(ItemBag itemBag) {
        this.itemBag = itemBag;
    }

    public ItemBag getSpellBag() {
        return spellBag;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerJob() {
        return playerJob;
    }

    public void setPlayerJob(String playerJob) {
        this.playerJob = playerJob;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void addGold(int gold) {
        this.gold += gold;
    }

    public void removeGold(int gold) {
        this.gold -= gold;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int addHealth(int health) {
        if (this.health + health > vitality * 2) {
            return this.health = vitality * 2;
        } else {
            return this.health += health;
        }
    }

    public int minusHealth(int health) {
        return this.health -= health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int addMana(int mana) {
        if (this.mana + mana > wisdom * 2) {
            return this.mana = wisdom * 2;
        } else {
            return this.mana += mana;
        }
    }

    public int minusMana(int mana) {
        if (this.mana - mana < 0) {
            return this.mana = 0;
        } else {
            return this.mana -= mana;
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getPlayerLocation() {
        return playerLocation;
    }

    public void setPlayerLocation(int playerLocation) {
        this.playerLocation = playerLocation;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int addLives(int lives) {
        return this.lives += lives;
    }

    public int minusLives(int lives) {
        return this.lives -= lives;
    }

    public int getTowerFloor() {
        return towerFloor;
    }

    public void setTowerFloor(int towerFloor) {
        this.towerFloor = towerFloor;
    }

    public int addTowerFloor(int addFloor) {
        return this.towerFloor += addFloor;
    }

    public int getRopeFloor() {
        return ropeFloor;
    }

    public int addRopeFloor(int addFloor) {
        return this.ropeFloor += addFloor;
    }

    public void setRopeFloor(int ropeFloor) {
        this.ropeFloor = ropeFloor;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public boolean isInCombat() {
        return inCombat;
    }

    public void setInCombat(boolean inCombat) {
        this.inCombat = inCombat;
    }

    public boolean checkDeath() {
        if (this.getHealth() <= 0) {
            return true;
        } else
            return false;
    }
}



