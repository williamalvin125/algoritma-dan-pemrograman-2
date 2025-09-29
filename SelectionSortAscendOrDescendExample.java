package praktikum;

public class SelectionSortAscendOrDescendExample {
    public static void main(String[] args) {
        int [] array = {5,4,2,1,5,7,2,-3,-2,0,18,2,-10};
        System.out.print("Unsorted array : ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] +" ");
        }
        System.out.println();
        ascending(array);
        System.out.print("Ascending array : ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] +" ");
        }
        System.out.println();
        descending(array);
        System.out.print("Descending array : ");
        for(int i
        =0; i<array.length; i++){
            System.out.print(array[i] +" ");
        }
    }

        public static void ascending(int[]array){
            int n = array.length;
            for(int i = 0; i<n-1; i++){
                int min = i;
                for(int j = i+1; j<n; j++){
                    if(array[j]<array[min]){
                        int temp = array[j];
                        array[j] = array[min];
                        array[min] = temp;
                    }
                }
            }
        }

        public static void descending(int[]array){
            int n = array.length;
            for(int i = 0; i<n-1; i++){
                int min = i;
                for(int j = i+1; j<n; j++){
                    if(array[j]>array[min]){
                        int temp = array[j];
                        array[j] = array[min];
                        array[min] = temp;
                    }
                }
            }
        }
    
}
