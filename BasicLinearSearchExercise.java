package latihan;

public class BasicLinearSearchExercise {
    public static void main(String[] args) {
        int [] angka = {1,2,3,4,5,6};
        int k = 5;
        boolean ketemu = false;

        for(int i:angka){
            System.out.print(i +" ");
        }
        System.out.println();
        for(int i=0; i<angka.length; i++){
            if(angka[i]==k){
                ketemu = true;
                break;
            }
        }

        if(ketemu){
            System.out.println("Angka 5 dapat ditemukan");
        } else {
            System.out.println("Angka 5 tidak dapat ditemukan");
        }
      
    }
}
