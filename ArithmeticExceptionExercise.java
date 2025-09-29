package latihan;
public class ArithmeticExceptionExercise {
    public static void main(String[] args) {
        int num1, num2;
        try{
            num1 = 0;
            num2 = 62/num1;
            System.out.println(num2);
        }
        catch(ArithmeticException e){
            System.out.println("NO 0");
            
        }
    }
}
