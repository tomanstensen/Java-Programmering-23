package exercises.ChallengesSvar;
import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        Scanner bacon = new Scanner(System.in);
        long a, b, c;
        System.out.print("Please input three(3) numbers: ");
        a = bacon.nextLong();
        b = bacon.nextLong();
        c = bacon.nextLong();

        System.out.print("The biggest number is ");
        if(a > b && a > c) {System.out.println(a);}
        else if(b > a && b > c) {System.out.println(b);}
        else {System.out.println(c);}


        bacon.close();
    }

}
