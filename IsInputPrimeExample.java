package praktikum;
import java.util.Scanner;
public class IsInputPrimeExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan integer positif : ");
        int num = input.nextInt();
        boolean prime = true;


        if(num<=1){
            prime = false;
        } else {
            for(int i = 2; i < num; i++){
                if(num%i==0){
                    prime = false;
                    break;
                }
            }
        }

        if(prime){
            System.out.println(num +" adalah sebuah bilangan prima.");
        } else {
            System.out.println(num +" bukan sebuah bilangan prima");
        }
        input.close();
    }

}
