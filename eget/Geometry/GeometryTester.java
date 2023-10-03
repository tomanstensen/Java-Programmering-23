package Geometry;
import java.util.Scanner;

import Geometry.shapes.*;

public class GeometryTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle circle = new Circle();
        System.out.print("Enter circle radius: ");
        circle.setRadius(scanner.nextDouble());
        System.out.println("The area of a circle with the radius of "+circle.getRadius()+" is: "+circle.computeArea());
        System.out.println("The circumference of the same circle is: "+circle.computeCircum());


        Rectangle rectangle = new Rectangle();
        System.out.print("Please enter first side of rectangle: ");
        rectangle.setA(scanner.nextDouble());
        System.out.print("Enter second side of rectangle: ");
        rectangle.setB(scanner.nextDouble());

        System.out.println("The area of a rectangle with sides "+rectangle.getA()+ " and "+rectangle.getB() +" is: "+rectangle.computeArea());
        System.out.println("The perimiter of the same rectangle is: "+rectangle.computePerimeter());



        scanner.close();
    }

}
