package Items;

import java.util.ArrayList;


public class ItemBag {


    private ArrayList<Item> inventory = new ArrayList<Item>();


    public ItemBag() {
    }

    public void addItem(Item item, int quantity) {
        if (inventory.size() == 0) {
            inventory.add(item);
            item.setQuantity(quantity);
        }
        else {
            for (int i = 0; i <= inventory.size() -1; i++) {
                if (item.id() == inventory.get(i).id()) {
                    inventory.get(i).addQuantity(quantity);
                }
            }
            inventory.add(item);
            item.setQuantity(quantity);
        }
    }

    public void removeItem(Item item, int quantity) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).id() == item.id()) {
                inventory.get(i).removeQuantity(quantity);
                if (inventory.get(i).getQuantity() <= 0) {
                    inventory.remove(inventory.get(i));
                }
            }
        }
    }

//    public int findItem(Item objName) {
//        for (int i = 0; i < inventory.size(); i++) {
//            if (objName.id() == inventory.get(i).id()) {
//                return i;
//            }
//        }
//    }


    public void showInventory() {
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(inventory.get(i).name() + " : " + inventory.get(i).getQuantity());
        }

    }

//    public void displayItem(String itemName, int itemCost) {
//        prices.add(itemCost);
//        int itemCount = inventory(itemName);
//        System.out.println(itemName + "\n" +
//                "      -Cost:  " + itemCost + "\n" +
//                "      -Stock: " + itemCount + "x");
//    }


    public ArrayList<Item> getItems() {
        return inventory;
    }


}