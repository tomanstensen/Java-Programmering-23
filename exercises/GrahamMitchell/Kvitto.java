public class Kvitto {
    public static void main(String[] args) {
        double gallons = 10.870;
        double price = 2.089;
        double total = gallons*price;


        System.out.println( "+--------------------------+");
        System.out.println( "|                          |");
        System.out.println( "|     Corner Store         |");
        System.out.println( "|                          |");
        System.out.println( "| 2015-03-29      04:38PM  |");
        System.out.println( "|                          |");
        System.out.printf( "|  Gallons:   $ %.3f     | %n", gallons);
        System.out.printf( "| Price/Gallon:  $ %.3f   |%n", price);
        System.out.println( "|                          |");
        System.out.printf( "| Fuel total:    $ %.2f   |%n", total);
        System.out.println( "|                          |");
        System.out.println( "+--------------------------+");
    }
}