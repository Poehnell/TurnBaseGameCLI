package Items;

import java.util.ArrayList;
import java.util.Collections;

public class ItemBag {


    public ArrayList<String> items = new ArrayList<String>();
    public ArrayList<Integer> prices = new ArrayList<Integer>();


    public ItemBag() {
    }

    public void addItem(String itemName) {
        items.add(itemName);
    }

    public void removeItem(String itemName) {
        items.remove(itemName);
    }

    public int inventory(String itemName) {
        return Collections.frequency(items, itemName);
    }


    public void displayItem(String itemName, int itemCost) {
        prices.add(itemCost);
        int itemCount = inventory(itemName);
        System.out.println(itemName + "\n" +
                "      -Cost:  " + itemCost + "\n" +
                "      -Stock: " + itemCount + "x");
    }


    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }

    public ArrayList<Integer> getPrices() {
        return prices;
    }

    public void setPrices(ArrayList<Integer> prices) {
        this.prices = prices;
    }

}