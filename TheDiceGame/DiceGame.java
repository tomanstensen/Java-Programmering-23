package TheDiceGame;
import java.util.Scanner;
import TheDiceGame.Components.*;

public class DiceGame {
    int rounds;

    Player player;
    Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            DiceGame game = new DiceGame();
            game.intro();
            game.playTime();
        }

    void intro(){
        System.out.println("Welcome to The Dice Game!");
        System.out.println("What is your name?");
        String playerName = scanner.nextLine();
       
        System.out.println("Hello, "+playerName+"!");
        System.out.print("To start start the game, choose how many rounds you would like to play (1 to 10): ");
        rounds = scanner.nextInt();

        System.out.print("Please choose how many sides your dice will have: ");
        int dieSides = scanner.nextInt();

        System.out.println("Great! You will now play " + rounds + " rounds with a " + dieSides + " sided die!");
        System.out.println("Guess what the die rolls.");
        System.out.println("For every correct guess you get one(1) point.");
        System.out.println("Good luck, " + playerName + "!");
        
        player = new Player(playerName, dieSides);
    }

    void playTime(){
        int thisRound = 1;
        while(thisRound <= rounds){
            System.out.print("Make your guess!(up to "+player.die.getSides()+"): ");
            player.setGuess(scanner.nextInt());
            int youRolled = player.roll();
            System.out.println("The die has been cast! You rolled a: " + youRolled);

            if(player.getGuess() == youRolled){
                System.out.println("Well done! You guessed it!");
                player.setScore(player.getScore()+1);
            }
            else if(player.getGuess() == youRolled + 1 || player.getGuess() ==  youRolled - 1){
                System.out.println("Oooh! So close!");
            }
            else{
                System.out.println("Incorrect!");
                if(thisRound < rounds){
                    System.out.println("Try again!");
                }
            }
            System.out.println("Your current score is: " + player.getScore());
            System.out.println("Current round: "+ thisRound);
            System.out.println();
            thisRound++;
        }

        System.out.println("The game is now over!");
        System.out.println("Playing a game of "+ rounds + " rounds, with a " + player.die.getSides() + " sided die you got a score of: " + player.getScore());
        if(player.getScore() == rounds){
            System.out.println("Wow! Perfect score! Such impressive!");
        }
        else if((double) player.getScore()/rounds >= 0.5 ){
            System.out.println("GGWP!");
        }
        else{
            System.out.println("Too bad! Better luck next time!");
        }
        System.out.println();

    }
}



