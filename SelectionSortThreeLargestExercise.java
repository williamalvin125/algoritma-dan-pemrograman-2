package latihan;

public class SelectionSortThreeLargestExercise {

    public static void findThreeLargest(int[] arr) {
        int n = arr.length;
        int largest1 = Integer.MIN_VALUE;
        int largest2 = Integer.MIN_VALUE;
        int largest3 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int largestIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[largestIndex]) {
                    largestIndex = j;
                }
            }

            if (arr[largestIndex] > largest1) {
                largest3 = largest2;
                largest2 = largest1;
                largest1 = arr[largestIndex];
            } else if (arr[largestIndex] > largest2 && arr[largestIndex] < largest1) {
                largest3 = largest2;
                largest2 = arr[largestIndex];
            } else if (arr[largestIndex] > largest3 && arr[largestIndex] < largest2) {
                largest3 = arr[largestIndex];
            }

            int temp = arr[i];
            arr[i] = arr[largestIndex];
            arr[largestIndex] = temp;
        }

        System.out.println("Three Largest elements:");
        System.out.println(largest1);
        System.out.println(largest2);
        System.out.println(largest3);
    }

    public static void main(String[] args) {
        int[] arr = {6, 4, 3, 1, 8, 2, 5};
        findThreeLargest(arr);
    }
}