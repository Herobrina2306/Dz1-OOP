package java.Units;

public class Unit {
    protected float hp;
    protected int speed;
    protected int damage;
    protected int maxHp;

    public Unit(float hp, int speed, int damage, int maxHp){
        this.hp = hp;
        this.speed = speed;
        this.damage = damage;
        this.maxHp = maxHp;
    }
    
}
