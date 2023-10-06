package TheDiceGame.Components;

import TheDiceGame.DiceGame;

public class Intro {
    DiceGame intro(DiceGame g){
        System.out.println("Welcome to The Dice Game!");
        System.out.println("What is your name?");
        g.player.setName(scanner.nextLine());

        System.out.println("Hello, "+player.getName()+"!");
        System.out.print("To start start the game, choose how many rounds you would like to play (1 to 10): ");
        rounds = scanner.nextInt();

        System.out.print("Please choose how many sides your dice will have: ");
        player.die.setSides(scanner.nextInt());

        System.out.println("Great! You will now play " + rounds + " rounds with a " + player.die.getSides() + " sided die!");
        System.out.println("Guess what the die rolls.");
        System.out.println("For every correct guess you get one(1) point.");
        System.out.println("Good luck, " + player.getName() + "!");
    }
}