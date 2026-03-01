
package ddd;


public class Character {
    private int HP;
    private int attack;
    
     public int getHP() {
        return HP;
    }

    
    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void takeDamage(int damage) {
        this.HP -= damage;
        if (this.HP < 0) {
            this.HP = 0;
        }
    }
    
    public void attack(Character target) {
        target.takeDamage(this.attack);
    }
}
