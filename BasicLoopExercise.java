package latihan;

public class BasicLoopExercise {
        public static void main(String[] args) {
            int I=0, ii=0;
    
            for(int i=0; i<5; i++){
                System.out.println("Selamat datang!");
            }
    
            System.out.println();
    
            while(I<5){
                System.out.println("Selamat datang.");
                I++;
            }
    
            System.out.println();
    
            do{
                System.out.println("Selamat datang");
                ii++;
            } while (ii<5);
    
            System.out.println();
    
            for(int i=5; i>0; i--){
                System.out.println(i);
            }
    
            System.out.println();
    
            for(int j=0; j<10; j=j+2){
                System.out.println(j);
            }
    
            System.out.println();
            
            int [] angka = {1,2,3,4,5,6,7,8,9,10};
            for(int item:angka){
                System.out.println(item);
            }
    
            System.out.println();
    
            boolean kondisi = false;
            int x = 0;
            int y = 0;
            while(kondisi){
                x++;
            }
            do{
                y++;
            } while(kondisi);
            System.out.println(x);
            System.out.println(y);
    
        }
    
}
