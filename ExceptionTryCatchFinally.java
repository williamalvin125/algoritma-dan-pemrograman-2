package latihan;

public class ExceptionTryCatchFinally{
    public static void main(String[] args) {
        String [] nama = new String[1];
        try{
            nama[2] = "Linda";
        }
        catch (ArithmeticException ex1){
            System.out.println(ex1);
        }
        catch (Exception ex2){
            System.out.println(ex2);
        }
        finally {
        System.out.println("bakso");
        }
        System.out.println("rawon");   
    }
}