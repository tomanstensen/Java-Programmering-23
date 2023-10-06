package TheDiceGame.Components;
import java.util.Random;
public class Die{
    private int sides;
    int face;

    Random random = new Random();
    public int roll(){
        face = random.nextInt(sides);
        return face+1;
    }
    
    public void setSides(int sides){
        this.sides = sides;
    }

    public int getSides(){
        return sides;
    }
    
    public void setFace(int face){
        this.face = face;
    }
    
    public int getFace(){
        return face;
    }

}
