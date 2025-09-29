package latihan;

public class BinarySearchExercise {
    public static void main(String[] args) {
        int [] data = {5,9,12,15,17,23,27,38,42,54,64,78,90};
        int key = 54;
        int indeks = pencarianBinary(data,key);

        if(indeks != 0){
            System.out.println("Nomor " +key +" berada pada urutan ke-" +(indeks));
        } else {
            System.out.println("Nomor " + key +" tidak dapat ditemukan");
        }

    }

    public static int pencarianBinary(int[]data, int key){
        int bawah = 0;
        int atas = data.length - 1;

        while(atas >= bawah){
            int tengah = (bawah + atas)/2;
            if(key == data[tengah]){
                return (tengah+1);
            } else if(key<data[tengah]){
                atas = tengah - 1;
            } else{
                bawah = tengah + 1;
            }
        
        }
        return 0;
    }
}
