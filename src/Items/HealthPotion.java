package Items;

public class HealthPotion extends Potions {

    private int addHealth = 10;

    public HealthPotion(int id) {
        this.setid(id);
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
    public int cost() {
        return 10;
    }

    @Override
    public String type() {
        return "Potion";
    }

    @Override
    public Item create() {
        return new HealthPotion(1);
    }


}

