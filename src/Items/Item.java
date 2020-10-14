package Items;


public abstract class Item {

    private int quantity = 0;
    public Item() {
    }

    public abstract String name();

    public abstract int id();

    public abstract int cost();

    public abstract String type();

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
