package java.Units;

public class Shooter extends Unit {
    
    protected int arrows;

    public Shooter(float hp, int maxHp, int speed, int damage, int arrows){
        super(0, 0, 0, 0);
        this.arrows = arrows;
    }

    
}
