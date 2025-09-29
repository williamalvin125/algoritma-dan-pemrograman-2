package tugas;

import java.lang.Math;

public class Cylinder extends Circle {
    private double radius;
    private double height;
    
    public Cylinder(double Radius, double Height){
        super(Radius);
        this.height = Height;
    }
    
    public double getHeight(){
        return height;
    }
    
    public double getVolume(){
        return (Math.PI*radius*radius*height);
    }
    
    public double getArea(){
        return (Math.PI*2*radius*(radius+height));
    }
    
    public String toString(){
        return "Cylinder, radius = " +radius +", height = " +height +", Area = " +getArea() +", and Volume = " +getVolume();
    }

    }
