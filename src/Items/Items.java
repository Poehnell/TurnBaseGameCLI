package Items;

import java.util.ArrayList;

public class Items {
    ArrayList<String> allItems = new ArrayList<String>();


    public Items() {

    }

    public void addItem(String itemName) {
        allItems.add(itemName);

    }

    public int findItem(String itemName) {
        return allItems.indexOf(itemName);

    }

    public void useItem(String itemName) {
    }

}
