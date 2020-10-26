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
            inventory.get(findItemIndex(item)).setQuantity(1);
        }
    }

    public void transferAllItem(ItemBag givingBag) {
        boolean found = false;
        for (int i = 0; i <= givingBag.inventory.size() - 1; i++) {
            if (inventory.size() == 0) {
                inventory.add(givingBag.getItem(i).create());
                inventory.get(findItemIndex(givingBag.getItem(i))).setQuantity(givingBag.getItem(i).getQuantity());
                i += 1;
            }
            for (int k = 0; k <= inventory.size() - 1; k++) {
                if (givingBag.getItem(i).getid() == inventory.get(k).getid() && found == false) {
                    addItem(givingBag.getItem(i), givingBag.getItem(i).getQuantity());
                    found = true;
                }
            }
            if (!found) {
                inventory.add(givingBag.getItem(i).create());
                inventory.get(findItemIndex(givingBag.getItem(i))).addQuantity(givingBag.getItem(i).getQuantity());
            }
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
        for (int i = 0; i <= inventory.size() - 1; i++) {
            if (inventory.get(i).getid() == item.getid()) {
                inventory.get(i).removeQuantity(quantity);
                if (inventory.get(i).getQuantity() <= 0) {
                    inventory.remove(inventory.get(i));
                }
            }
        }
    }


    public void showInventoryAll() {
        for (int i = 0; i <= this.inventory.size() - 1; i++) {
            System.out.println("\n " + (i + 1) + ". - " + this.inventory.get(i).name() + " : " + this.inventory.get(i).getQuantity());
        }
    }

    public void showInventoryCost() {
        for (int i = 0; i <= this.inventory.size() - 1; i++) {
            System.out.println(" " + (i + 1) + ". - " + this.inventory.get(i).name() + " : " + this.inventory.get(i).getQuantity());
            System.out.println("      " + this.inventory.get(i).cost() + "g\n");
        }

    }
    public void showInventoryByType(String type){
        for (int i = 0; i <= this.inventory.size() - 1; i++){
            if (this.inventory.get(i).type() == type){
                System.out.println(" " + (i + 1) + ". - " + this.inventory.get(i).name());
            }
        }
    }

    public void showInventoryConsumable() {
        int count = 0;
        for (int i = 0; i <= this.inventory.size() - 1; i++) {
            if (this.inventory.get(i).consumable()) {
                count++;
                System.out.println(" " + count + ". - " + this.inventory.get(i).name() + " : " + this.inventory.get(i).getQuantity());
            }
        }
    }

    public int getConsumableAmount() {
        int count = 0;
        for (int i = 0; i <= this.inventory.size() - 1; i++) {
            if (this.inventory.get(i).consumable()) {
                count += 1;
            }
        }
        return count;
    }

    public int findItemIndex(Item item) {
        for (int i = 0; i <= this.inventory.size() - 1; i++) {
            if (this.inventory.get(i).getid() == item.getid()) {
                return i;
            }
        }
        return 0;
    }

    public boolean findItemByType(String itemType) {
        for (int i = 0; i <= this.inventory.size() - 1; i++) {
            if (this.inventory.get(i).type() == itemType) {
                return true;
            }
        }
        return false;
    }

    public Item getItem(int index) {
        return this.inventory.get(index);
    }

    public Item getItemByName(String itemName) {
        int itemIndex = 0;
        for (int i = 0; i <= this.inventory.size() - 1; i++) {
            if (this.inventory.get(i).name() == itemName) {
                itemIndex = i;
            }
        }
        return this.inventory.get(itemIndex);
    }

    public ArrayList<Item> getInventory() {
        return this.inventory;
    }
}