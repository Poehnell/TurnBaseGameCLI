package Player;

import Items.Item;
import Items.ItemBag;

public class Player {
    protected int health, mana, damage, gold, dieSize;
    protected int vitality, wisdom, strength;
    protected int playerLocation;
    protected int lives = 3;
    protected boolean gameOver = false;
    protected String playerName = "nope";
    protected String playerJob ="nope";
    protected ItemBag playersBag = new ItemBag();


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

    public ItemBag getPlayersBag() {
        return playersBag;
    }

    public void setPlayersBag(ItemBag playersBag) {
        this.playersBag = playersBag;
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

    public void addGold(int gold){
        this.gold += gold;
    }

    public void removeGold(int gold){
        this.gold -= gold;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
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

    public int addLives(int lives){
        return this.lives += lives;
    }

    public int minusLives(int lives){
        return this.lives -= lives;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public boolean checkDeath(){
        if (this.getHealth() <= 0){
            return true;
        }else
            return false;
    }
}



