package pbo;

public class Constructor {
    private int var;
    
    Constructor(){
        this.var = 10;
    }
    
    Constructor(int num){
        this.var = num;
    }
    
    public int getVar(){
        return var;
    }
    
    public static void main (String args[]){
        Constructor con = new Constructor();
        Constructor con2 = new Constructor(100);
        System.out.println("Var con = " +con.getVar());
        System.out.println("Var con2 = " +con2.getVar());
    }
}
