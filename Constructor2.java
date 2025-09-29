package pbo;

public class Constructor2 {
    private int rollNum;
    
    Constructor2(){
        rollNum = 100;
    }
    
    Constructor2(int num){
        this();
        rollNum = rollNum + num;
    }
    
    public int getRollNum() {
        return rollNum;
    }
    
    public static void main (String args[]) {
        Constructor2 cons2 = new Constructor2(12);
        System.out.println(cons2.getRollNum());
    }
}
