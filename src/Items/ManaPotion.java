package Items;

public class ManaPotion extends Potions {
    protected int addMana = 10;
    protected int id = 0;


public ManaPotion(int id){
    this.id = id;
}

    @Override
    public int drinkPotion() {
        return addMana;
    }

    @Override
    public String name() {
        return "Mana Potion";
    }

    @Override
    public int id() {
        return this.id;
    }

    @Override
    public int cost() {
        return 10;
    }

    @Override
    public String type() {
        return "Potion";
    }



}