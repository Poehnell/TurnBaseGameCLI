package Player;

import Items.ItemBag;

import java.io.Serializable;


public class SavedPlayer implements Serializable {
    protected int health, mana, gold, dieSize, ropeFloor;
    protected int vitality, wisdom, strength;
    protected String playerName,playerJob;
    protected ItemBag itemBag;
    protected ItemBag spellBag;


    public SavedPlayer(int vitality,int wisdom,int strength, int health,int mana,int gold,int dieSize,int ropeFloor,String playerName,String playerJob,ItemBag itemBag,ItemBag spellBag){
        this.health = health;
        this.mana = mana;
        this.gold = gold;
        this.dieSize = dieSize;
        this.ropeFloor = ropeFloor;
        this.vitality = vitality;
        this.wisdom = wisdom;
        this.strength = strength;
        this.playerName = playerName;
        this.playerJob = playerJob;
        this.itemBag = itemBag;
        this.spellBag = spellBag;
    }



    public String getPlayerName() {
        return playerName;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public int getGold() {
        return gold;
    }

    public int getDieSize() {
        return dieSize;
    }

    public int getRopeFloor() {
        return ropeFloor;
    }

    public int getVitality() {
        return vitality;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getStrength() {
        return strength;
    }

    public String getPlayerJob() {
        return playerJob;
    }

    public ItemBag getItemBag() {
        return itemBag;
    }

    public ItemBag getSpellBag() {
        return spellBag;
    }
}
