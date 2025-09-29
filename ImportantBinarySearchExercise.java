package latihan;

public class ImportantBinarySearchExercise {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7,9,11,13,15,16};
        int target = 3;
        int k = binarySearch(arr,target);
        System.out.println(k);
    }


public static int binarySearch(int[] arr, int target) {
    int top = arr.length-1;
    int bottom = 0;

    while (top >= bottom) {
        int mid = (top+bottom)/2;

        if (arr[mid]==target) return mid;
        else if (arr[mid]>target) {
            top = mid-1;
        }
        else if (arr[mid]<target) {
            bottom = mid + 1;
        }
    }
    return -1;

    }

}
