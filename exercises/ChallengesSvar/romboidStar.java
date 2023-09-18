package exercises.ChallengesSvar;
import java.util.Scanner;

public class romboidStar{
    public static void main(String[] args){
        int lines;
        String printSpace = " ";

        Scanner bacon = new Scanner(System.in);
        System.out.print("Input romboid size (odd number): ");
        lines = bacon.nextInt();

        for(int stars = 1; stars <= lines; stars++){
            if(stars%2 == 0){continue;}
            for(int spaces = 1; spaces <=  (lines - stars)/2; spaces++){
                System.out.print(printSpace);
            }
            System.out.print("*");
            int fillRow = 0;
            while(fillRow < stars -1){
                System.out.print("*");
                fillRow++;
            }
            System.out.print("\n");
        }
        for(int stars2 = lines - 1; stars2 > 0; stars2--){
            if(stars2%2 == 0){continue;}
            for(int spaces2 = 1; spaces2 <= (lines - stars2)/2; spaces2++){
                System.out.print(printSpace);
            }
            System.out.print("*");
            int fillrow2 = stars2 - 1;
            while(fillrow2 > 0) {
                System.out.print("*");
                fillrow2--;
            }
            
            System.out.print("\n");
        }

            bacon.close();
    }
}