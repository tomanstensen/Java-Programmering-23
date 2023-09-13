import java.util.Scanner;

public class practiceInput {
    public static void main(String[] args) {
        String firstName,lastName, iHandle;
        int height;
        int shoez;
;

        Scanner keyboard = new Scanner(System.in);

        System.out.print( "\nPlease enter the following information so I can sell it for a profit!\n\n");
        System.out.print( "First name: ");
        firstName = keyboard.next();

        System.out.print( "Last name: ");
        lastName = keyboard.next();

        System.out.print("Your height (cm): ");
        height = keyboard.nextInt();

        System.out.print("Shoe size: ");
        shoez = keyboard.nextInt();

        System.out.print("Your internet handle: ");
        iHandle = keyboard.next();

        System.out.println("Your information:");
        System.out.println("\tName: " + lastName + ", " + firstName);
        System.out.println("\tInternet handle: " + iHandle);
        System.out.println("\tHeight: " + height);
        System.out.println("\tShoe size: " + shoez);

        keyboard.close();

    }
    
}
