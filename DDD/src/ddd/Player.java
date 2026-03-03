
package ddd;

import java.util.ArrayList;

public class Player extends Character{
    ArrayList<Item> inventory = new ArrayList<>();
    private int money = 1000;
    private Weapon weapon = new Weapon(0, "Plattic sword", 5);
    public int getMoney() {
        return money;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    
    public void setMoney(int money) {
        this.money = money;
    }
    
    public void addItem(Player p){
        for(int i = 0; i < p.inventory.size(); i++){
            inventory.add(p.inventory.get(i));
        }
        
    }
    
    public void equipStrongestWeapon() {
    Weapon bestWeapon = null;
    int maxDamage = Integer.MIN_VALUE;

    for (Item item : inventory) {
        if (item instanceof Weapon) {
            Weapon w = (Weapon) item;
            if (w.getStat() > maxDamage) {
                maxDamage = w.getStat();
                bestWeapon = w;
            }
        }
    }




        
    if (bestWeapon != null) {
        this.weapon = bestWeapon;
    }
}
}
//dấdfasdfaasdfas
