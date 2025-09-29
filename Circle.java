package tugas;

import java.lang.Math;

public class Circle {
    private double radius;
    
    public Circle(double Radius){
        this.radius = Radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double getArea(){
        return (Math.PI*radius*radius);
    }
    
    public String toString(){
        return "Circle, radius = " +radius +" and Area = " +getArea();
    }
}
