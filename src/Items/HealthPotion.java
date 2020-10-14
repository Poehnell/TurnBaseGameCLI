package Items;

public class HealthPotion extends Potions {

    protected int addHealth = 10;
    protected int id = 0;

    public HealthPotion(int id){
        this.id = id;
    }

    @Override
    public int drinkPotion() {
        return addHealth;
    }


    @Override
    public String name() {
        return "Health Potion";
    }

    @Override
    public int id() {
        return this.id;
    }

    @Override
    public int cost() {
        return 5;
    }

    @Override
    public String type() {
        return "Potion";
    }


}

