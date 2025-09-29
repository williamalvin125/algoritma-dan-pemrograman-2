package praktikum;
import java.util.Scanner;
public class CheckFibonacciWithLinearSearchExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan yang ingin Anda periksa: ");
        int num = input.nextInt();

        int[] fibonacciArray = generateFibonacciArray(num);

        System.out.print("Deret Fibonacci: ");
        for (int i = 0; i < fibonacciArray.length; i++) {
                System.out.print(fibonacciArray[i] + " ");
        }

        System.out.println();

        if (isFibonacci(num, fibonacciArray)) {
            System.out.println(num + " adalah bagian dari deret Fibonacci.");
        } else {
            System.out.println(num + " bukan bagian dari deret Fibonacci.");
        }
        input.close();
    }

    public static int[] generateFibonacciArray(int num) {
        int[] fibonacciArray = new int[2]; // Ukuran awal array
        fibonacciArray[0] = 1;
        fibonacciArray[1] = 1;

        int i = 2;
        while (true) {
            int nextFibonacci = fibonacciArray[i - 1] + fibonacciArray[i - 2];
            if (nextFibonacci <= num) {
                if (i == fibonacciArray.length) {
                    // Jika array sudah penuh, kita akan membuat array yang lebih besar
                    int[] tempArray = new int[fibonacciArray.length + 1];
                    for (int j = 0; j < fibonacciArray.length; j++) {
                        tempArray[j] = fibonacciArray[j];
                    }
                    fibonacciArray = tempArray;
                }
                fibonacciArray[i] = nextFibonacci;
                i++;
            } else {
                break;
            }
        }

        return fibonacciArray;
    }

    public static boolean isFibonacci(int num, int[] fibonacciArray) {
        for (int i : fibonacciArray) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }
}
 
    

