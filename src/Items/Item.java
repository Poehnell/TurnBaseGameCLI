package Items;


public abstract class Item {

    private int quantity = 0;
    public Item() {
    }

    public abstract String name();

    public abstract int id();

    public abstract int cost();

    public abstract String type();

    public abstract Item create();

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void removeQuantity(int quantity) {
        this.quantity -= quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
