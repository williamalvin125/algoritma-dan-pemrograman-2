package latihan;

public class InsertionSortExercise {
    public static void main(String[] args) {
        int [] arr = {1,4,5,6,2,5,6,3};
        for(int i:arr){
        System.out.print(i +" ");
    }
    System.out.println();
    InsertSort(arr);
    for(int i:arr){
        System.out.print(i +" ");
    }
}

    public static void InsertSort(int[] arr){
        int n = arr.length;
        int v, j;
        for(int i=1; i<n; i++){
            v = arr[i];
            j = i-1;
            while(j>=0 && arr[j]>v){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=v;
        }
    }

}
