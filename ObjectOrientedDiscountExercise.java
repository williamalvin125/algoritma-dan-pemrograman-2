package latihan;
class ObjectOrientedDiscountExercise{

    public static void main(String[] args) {
        HargaDiskon produk = new HargaDiskon("pensil", 15, 0.2);
        System.out.println(produk.nettoHarga(12));
    }
}

class HargaDiskon extends Barang{
    private double diskon;

    HargaDiskon(String nama, double harga, double diskon){
        super(nama, harga);
        this.diskon = diskon;
    }
    public double nettoHarga(int jumlBarang){
        double hargaTotal = jumlBarang * getHarga();
         if (jumlBarang >= 10) {
            double diskonAmount = hargaTotal * diskon;
            System.out.println("Nama barang: " + getNama());
            System.out.print("Harga bersih: ");
            return hargaTotal - diskonAmount;
        } else {
            System.out.println("Nama barang: " + getNama());
            System.out.print("Harga bersih: ");
            return hargaTotal;
         }
    }
}

class Barang{
    private String nama;
    private double harga;
    Barang(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama(){
        return nama;
    }

    public double getHarga(){
        return harga;
    }
}