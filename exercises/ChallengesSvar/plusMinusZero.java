package exercises.ChallengesSvar;
import java.util.Scanner;

public class plusMinusZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.print("Please input a number: ");
        a = scan.nextInt();
        System.out.print("Your number is ");
        if(a == 0) {System.out.println("zero.");}
        else if(a < 0) {System.out.println("negative.");}
        else if(a > 0) {System.out.println("positive.");}

    }
}