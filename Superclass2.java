package pbo;

public class Superclass2 {
    void display(){
        System.out.println("Parent Class Method");
    }
}

class Subclass2 extends Superclass2 {
    void display() {
        System.out.println("Child Class Method");
    }
    
    void printMsg() {
        display();
        super.display();
    }
    
    public static void main(String args[]) {
        Subclass2 obj = new Subclass2();
        obj.printMsg();
    } 
            
}
