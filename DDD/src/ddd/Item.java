
package ddd;




public abstract class Item {
    protected int price;
    protected String name;

    public Item(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public abstract void display();
    public abstract int getStat();

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
