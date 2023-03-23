package java.Units;

public class Combat extends Unit{

    protected int cast;

    public Combat(float hp, int maxHp, int speed, int damage, int cast){
        super(0, 0, 0, 0);
        this.cast = cast;
    }
    
}
