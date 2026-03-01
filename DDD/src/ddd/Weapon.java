package ddd;

public class Weapon extends Item {
    private int attack;

    public Weapon(int price, String name, int attack) {
        super(price, name);
        this.attack = attack;
    }

    @Override
    public int getStat() {
        return attack;
    }

    @Override
    public void display() {
        System.out.println(name + " (" + attack + "): " + price + " gold");
    }
}

//skibidi toilet
