package latihan;

public class BubbleSortExercise {
    public static void main(String[] args) {
        int [] arr = {1,4,5,6,2,5,6,3,1};
        for(int i:arr){
        System.out.print(i +" ");
    }
    System.out.println();
    bubbleSort(arr);
    for(int i:arr){
        System.out.print(i +" ");
    }        
    }
    
    public static void bubbleSort(int[]arr){
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i<n-1; i++){
            for(int j = 1; j<n-i;j++){
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


}
