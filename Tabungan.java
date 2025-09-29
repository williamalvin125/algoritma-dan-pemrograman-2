package uml;

public class Tabungan {
  
private int saldo;
 
   public Tabungan(int saldo) {
      this.saldo = saldo;
   }
   
   public int getSaldo() {
      return saldo;
   }
   
   public int simpanUang(int jumlah) {
      return saldo = saldo + jumlah;
   }
   
   public boolean ambilUang(int jumlah) {
      if (saldo < jumlah) {
         return false;
      } 
      else {
         saldo -= jumlah;
         return true;
              }
   }
}


