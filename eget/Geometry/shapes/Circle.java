package Geometry.shapes;

public class Circle {
    private double radius;

    public double computeArea(){
        double area = Math.PI*radius*radius;
        return area;
    }

    public double computeCircum(){
        double circum = 2*Math.PI*radius;
        return circum;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
}
