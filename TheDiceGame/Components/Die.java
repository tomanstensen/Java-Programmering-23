package TheDiceGame.Components;
import java.util.Random;
public class Die{
    private int sides;
    private int face;

    private Random random = new Random();
    public int roll(){
        face = random.nextInt(sides);
        return face+1;
    }

    public int getSides(){
        return sides;
    }
    
    public Die(int sides){
        this.sides = sides;
    }
}
