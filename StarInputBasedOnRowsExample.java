package praktikum;
import java.util.Scanner;
public class StarInputBasedOnRowsExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan integer: ");
        int num = input.nextInt();

        for(int i=1; i<=num;i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
} 

