package Items;

public class HealthPotion extends Potions {

    protected int addHealth = 10;


    @Override
    public String potionName() {
        return "Health Potion";
    }

    @Override
    public int itemPrice() {
        return 5;
    }

    @Override
    public int drinkPotion() {
        return addHealth;
    }


}

