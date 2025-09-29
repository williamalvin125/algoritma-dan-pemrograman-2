package latihan;

public class ImportantInsertionSortExample {
    public static void main(String[] args) {
        int array[] = {20,4,5,3,9,6,7,11,4,1};
        System.out.println("Array before insertion : ");
        for(int i=0; i<array.length;i++){
            System.out.print(array[i] +" ");
        }
        System.out.println();
        insertionSort(array);
        System.out.println("Array after insertion : ");
        for(int i=0; i<array.length;i++){
            System.out.print(array[i] +" ");
        }
    }

    public static void insertionSort (int[] array){
        for(int i=1; i<array.length; i++){
            int temp = array[i];
            int j= i-1;
            while(j>=0 && array[j]>temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }

    }
}
