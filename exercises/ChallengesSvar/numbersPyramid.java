package exercises.ChallengesSvar;
import java.util.Scanner;

public class numbersPyramid {
    public static void main(String[] args) {
        int maxNumber;
        String space = " ";
        

        Scanner bacon = new Scanner(System.in);
        System.out.print("Please input a number (2 to 9) to make a pyramid of: ");
        maxNumber = bacon.nextInt();

        for(int currentNr = 1; currentNr <= maxNumber; currentNr++) {
            for(int spaceNr = 1; spaceNr <= maxNumber - currentNr; spaceNr++ ){ 
                System.out.print(space); 
            }
            System.out.print(currentNr);
            int fillRow = 0;
            while(fillRow < currentNr - 1){
                System.out.print(space+currentNr);
                fillRow++;
            }
            System.out.print("\n");
        }
        bacon.close();
    }
    
}
