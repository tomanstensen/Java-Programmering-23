import java.util.Scanner;
public class continueLoop {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        String keepGoing = "Y";
        
        while(keepGoing == "Y" || keepGoing == "y"){
            System.out.print( "Would you like to continue? Y/N: ");
            keepGoing = answer.next();
        }
        
    }
}