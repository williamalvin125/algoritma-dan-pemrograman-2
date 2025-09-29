package pbo;

public class Constructor3 {
    Constructor3(){
        System.out.println("Constructor3 Parent class");
    }
}

class ChildConstructor3 extends Constructor3 {
    ChildConstructor3(){
        System.out.println("ChildConstructor3 Child Class");
    }
    
    public static void main (String args[]){
        ChildConstructor3 childcon = new ChildConstructor3();
    }
    
    
}
