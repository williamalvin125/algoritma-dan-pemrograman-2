package praktikum;
import java.util.Scanner;
public class InsertMultipleGoneExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int x = input.nextInt();
        System.out.print("Masukkan batas bilangan : ");
        int num = input.nextInt();

        System.out.println("Hasil bilangan : ");
        for(int i=1;i<=num;i++){
            if(i%x != 0){
                System.out.print(i +" ");
            }
        }
        input.close();
    }

}
