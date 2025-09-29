package latihan;

public class ImportantLinearSearchExercise {
    public static void main(String[] args) {
        int [] array = {0,1,2,3,4,5,6,3,2};
        int x = 5;
        searching(array, x);
    }
    
    public static void searching(int[]array, int x){
        for(int i = 0; i<array.length; i++){
            if(array[i] == x){
                System.out.println(i +" ");
            }
        }
    }
}
