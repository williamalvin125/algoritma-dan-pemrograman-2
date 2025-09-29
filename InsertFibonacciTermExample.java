package praktikum;

import java.util.Scanner;

public class InsertFibonacciTermExample{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan integer positif : ");
        int num = input.nextInt();

        int a = 1, b = 1, c = 0;

        if(num<=0){
            System.out.print("Error!");
        } else {
            System.out.print("Maka bilangan fibonacci nya adalah ");
            for(int i = 0; i < num; i++){
                System.out.print(a +" ");
                c = a+b;
                a = b;
                b = c;
            }
        }
        input.close();
    }



}