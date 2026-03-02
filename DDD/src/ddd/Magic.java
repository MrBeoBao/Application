package ddd;

public class Magic extends Item {
    private int power;

    public Magic(int price, String name, int power) {
        super(price, name);
        this.power = power;
    }

    @Override
    public int getStat() {
        return power;
    }

    @Override
    public void display() {
        System.out.println(name + " (" + power + "): " + price + " gold");
    }
}
\\ddd
