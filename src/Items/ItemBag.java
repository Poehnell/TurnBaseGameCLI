package Items;

import java.util.ArrayList;


public class ItemBag {


    private ArrayList<Item> inventory = new ArrayList<Item>();


    public ItemBag() {
    }


    public void transferItem(Item item) {
        boolean found = false;
        if (inventory.size() == 0) {
            inventory.add(item.create());
            inventory.get(0).setQuantity(1);
            found = true;
        } else {
            for (int i = 0; i <= inventory.size() - 1; i++) {
                if (item.getid() == inventory.get(i).getid() && !found) {
                    inventory.get(i).addQuantity(1);
                    found = true;
                }
            }
        }
        if (!found) {
            inventory.add(item.create());
            inventory.get(findItem(item)).setQuantity(1);
        }
    }


    public void addItem(Item item, int quantity) {
        if (inventory.size() == 0) {
            inventory.add(item);
            item.addQuantity(quantity);
        } else {
            boolean found = false;
            for (int i = 0; i <= inventory.size() - 1; i++) {
                if (item.getid() == inventory.get(i).getid()) {
                    inventory.get(i).addQuantity(quantity);
                    found = true;
                }
            }

            if (!found) {
                inventory.add(item);
                item.setQuantity(quantity);
            }

        }
    }


    public void removeItem(Item item, int quantity) {
        boolean found = false;
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getid() == item.getid()) {
                inventory.get(i).removeQuantity(quantity);
                if (inventory.get(i).getQuantity() <= 0) {
                    inventory.remove(inventory.get(i));
                }
            }
        }
    }


    public void showInventoryCost() {
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(" " + (i + 1) + ". - " + inventory.get(i).name() + " : " + inventory.get(i).getQuantity());
            System.out.println("      " + inventory.get(i).cost() + "g\n");
        }

    }

    public void showInventory() {
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println("\n " + (i + 1) + ". - " + inventory.get(i).name() + " : " + inventory.get(i).getQuantity());
        }
    }

    public int findItem(Item item) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getid() == item.getid()) {
                return i;
            }
        }
        return 0;
    }


    public Item getItem(int index) {
        return inventory.get(index);
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }
}