package ddd;

public class Armor extends Item {
    private int defense;
    public Armor(int price, String name, int defense) {
        super(price, name);
        this.defense = defense;
    }

    @Override
    public int getStat() {
        return defense;
    }
    @Override
    public void display() {
        System.out.println(name + " (" + defense + "): " + price + " gold");
    }
}
