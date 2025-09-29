package latihan;

public class ImportantBubbleSortExercise {
    public static void main(String[] args) {
        int array[] = {20,1,5,3,1,6,3,11,4,1};
        System.out.println("Array before insertion : ");
        for(int i=0; i<array.length;i++){
            System.out.print(array[i] +" ");
        }
        System.out.println();
        BubbleSort(array);
        System.out.println("Array after insertion : ");
        for(int i=0; i<array.length;i++){
            System.out.print(array[i] +" ");
        }
    }

    public static void BubbleSort(int[]array){
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-i-1; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            
        }

    }
    
}
