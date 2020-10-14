package Items;

import java.util.ArrayList;


public class ItemBag {


    private ArrayList<Item> inventory = new ArrayList<Item>();


    public ItemBag() {
    }

    public void addItem(Item objName, int quantity) {
        if (inventory.size() == 0) {
            inventory.add(objName);
            objName.setQuantity(quantity);
        } else {
            for (int i = 0; i <= inventory.size() -1 ; i++) {
                if (objName.id() == inventory.get(i).id()) {
                    inventory.get(i).setQuantity(inventory.get(i).getQuantity() + quantity);
                } else {
                    inventory.add(objName);
                    objName.setQuantity(quantity);
                }

            }
        }
    }

    public void removeItems(String itemName, int quantity) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).name() == itemName) {
                inventory.get(i).setQuantity(inventory.get(i).getQuantity() - quantity);
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