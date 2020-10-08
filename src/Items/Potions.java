package Items;

public abstract class Potions {

    public abstract String potionName();

    public abstract int itemPrice();

    public abstract int drinkPotion();

    public void getName(String potionName) {
        System.out.println(potionName);
    }

    public int getPrice(int potionPrice) {
        return potionPrice;


    }


}
