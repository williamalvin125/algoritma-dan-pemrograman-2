package latihan;

public class LinearSearchExercise {
    public static void main(String[] args) {
        int [] data = {5,29,12,15,37,23,27,38,22,54,14};
        int key = 22;
        int indeks = pencarianLinier(data,key);
        
        if(indeks != 0){
            System.out.println("Nomor " +key +" berada pada urutan ke-" +(indeks));
        } else {
            System.out.println("Nomor " + key +" tidak dapat ditemukan");
        }

    }

    public static int pencarianLinier(int[]data, int key){
        int k = 0;
        int n = data.length;
        boolean ketemu = false;
        while (k<n && ketemu==false){
            if(key==(data[k])){
                ketemu = true;
            } else {
                k++;
            }
        }

        if(ketemu){
            return k+1;
        } else{
            return 0;
        }
    }
}
