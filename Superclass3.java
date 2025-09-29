package pbo;

public class Superclass3 {
    int num = 20;
    
    public void display(){
        System.out.println("This is the display of superclass.");
    }
}

class Subclass3 extends Superclass3 {
    int num = 10;
    
    public void display(){
        System.out.println("This is the display of subclass.");
    }
    
    public void mymethod(){
        Subclass3 sub = new Subclass3();
        sub.display();
        super.display();
        System.out.println("Ini sub.num = " +sub.num);
        System.out.println("Ini super.num = " +super.num);
    }
    
    public static void main(String args[]){
        Subclass3 obj = new Subclass3();
        obj.mymethod();
    }
    
}
