package TheDiceGame.Components;
import java.util.Random;
public class Die{
    private int sides;
    private int face;

    private Random random = new Random();
    public void roll(){
        face = random.nextInt(sides) + 1;
    }

    public int getFace() {
        return face;
    }

    public int getSides(){
        return sides;
    }
    
    public Die(int sides){
        this.sides = sides;
    }
}
