package latihan;
import java.util.Scanner;
public class ArithmeticSequenceExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan suku pertama : ");
        int a = input.nextInt();
        System.out.print("Masukkan beda : ");
        int b = input.nextInt();
        System.out.print("Masukkan banyak suku : ");
        int suku = input.nextInt();

        System.out.print("Maka, barisan aritmatikanya adalah ");
        for (int i=0;i<=suku;i++){
            System.out.print(a);
            a = a + b;
            if(i<suku){
                System.out.print(" ");
            }
        }
        input.close();
    }
}
