package TheDiceGame.Components;

public class Player {
    private String name;
    private int score = 0;
    private int guess;
    public Die die;
    
    public int roll(){
        return die.roll();
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
    public Player(String name, int sides){
        die = new Die(sides);
        this.name = name;
    }
}
