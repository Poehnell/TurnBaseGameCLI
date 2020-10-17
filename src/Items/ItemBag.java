package Items;

import java.util.ArrayList;


public class ItemBag {


    private ArrayList<Item> inventory = new ArrayList<Item>();


    public ItemBag() {
    }


    public Item createItem(Item item) {
        inventory.add(item.create());
        for (int i = 0; i <= inventory.size() - 1; i++) {
            if (item.id() == inventory.get(i).id()) {
                inventory.get(i).addQuantity(1);
            }
        }
        return item;

    }


    public void addItem(Item item, int quantity) {
        if (inventory.size() == 0) {
            inventory.add(item);
            item.addQuantity(quantity);
        } else {
            boolean found = false;
            for (int i = 0; i <= inventory.size() - 1; i++) {
                if (item.id() == inventory.get(i).id()) {
                    inventory.get(i).addQuantity(quantity);
                    found = true;
                }
            }
<<<<<<< HEAD
            if (!found) {
                inventory.add(item);
                item.setQuantity(quantity);
            }

=======
            inventory.add(item);
            item.setQuantity(quantity);
>>>>>>> bcd98cb7d8cd300b6ad15cb44b8061ede544977b
        }
    }


    public void removeItem(Item item, int quantity) {
        boolean found = false;
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).id() == item.id()) {
                inventory.get(i).removeQuantity(quantity);
//                if (inventory.get(i).getQuantity() <= 0) {
//                    inventory.remove(inventory.get(i));
//                }
            }
        }
    }


    public void showInventory() {
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(i + 1 + ". - " + inventory.get(i).name() + " : " + inventory.get(i).getQuantity());
            System.out.println("        " + inventory.get(i).cost() + "g");
        }

    }

//    public int inventoryItemPosition() {
//        for (int i = 0; i < inventory.size(); i++) {
//
//        }
//
//
//    }


    public Item getItem(int index) {
        return inventory.get(index);
    }


}