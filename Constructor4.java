package pbo;

public class Constructor4 {
    String web;
    
    Constructor4(String w){
        web = w;
    }
    
    Constructor4(Constructor4 je){
        web = je.web;
    }
    
    void display(){
        System.out.println("Website : " +web);
    }
    
    public static void main (String args[]){
        Constructor4 con4 = new Constructor4("javaitugampang.com");
        Constructor4 cons4 = new Constructor4(con4);
        con4.display();
        cons4.display();
    }
}
