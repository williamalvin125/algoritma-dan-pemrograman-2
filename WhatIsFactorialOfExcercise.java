package latihan;

import java.util.Scanner;

public class WhatIsFactorialOfExcercise {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan bilangan integer positif : ");
    int positif = input.nextInt();
    int i = 1;

    while(positif>0){
        i = positif*i;
        positif--;
    }

    if(positif<0){
        System.out.println("ERROR!");
    } else {
        System.out.println("Maka bilangan faktorialnya adalah " +i);
    }
    input.close();  
    }
}
