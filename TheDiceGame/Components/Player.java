package TheDiceGame.Components;

public class Player {
    private String name;
    private int score = 0;
    private int guess;
    public Die die = new Die();
    
    public int roll(){
        die.setFace(die.roll());
        return die.face;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setGuess(int guess){
        this.guess = guess;
    }
    public int getGuess(){
        return guess;
    }

    public void setScore(int score){
        this.score = score;
    }
    public int getScore(){
        return score;
    }
}
