package tugas;

public class bilPecahan {
    private int pembilang;
    private int penyebut;

    public bilPecahan() {
        this.pembilang = 0;
        this.penyebut = 1;
    }

    public bilPecahan(int pembilang, int penyebut) {
        this.pembilang = pembilang;
        this.penyebut = penyebut;
    }

    public bilPecahan jumlah(bilPecahan a) {
        int pembilangBaru = this.pembilang * a.penyebut + a.pembilang * this.penyebut;
        int penyebutBaru = this.penyebut * a.penyebut;
        return new bilPecahan(pembilangBaru, penyebutBaru);
    }

    public bilPecahan kali(bilPecahan a) {
        int pembilangBaru = this.pembilang * a.pembilang;
        int penyebutBaru = this.penyebut * a.penyebut;
        return new bilPecahan(pembilangBaru, penyebutBaru);
    }

        public String bentukCampuran() {
        if (Math.abs(pembilang) < penyebut) {
            return pembilang + "/" + penyebut;
        } else {
            int bagianBulat = pembilang / penyebut;
            int sisaPembilang = Math.abs(pembilang) % penyebut;
            if (sisaPembilang == 0) {
                return String.valueOf(bagianBulat);
            } else {
                return bagianBulat + " " + sisaPembilang + "/" + penyebut;
            }
        }
    }

    public void infoPecahan() {
        System.out.println("Pembilang: " + pembilang);
        System.out.println("Penyebut: " + penyebut);
        System.out.println("Bentuk campuran: " + bentukCampuran());
    }

    public static void main(String[] args) {
        bilPecahan pecahan1 = new bilPecahan(5, 3);
        bilPecahan pecahan2 = new bilPecahan(2, 3);

        bilPecahan jumlah = pecahan1.jumlah(pecahan2);
        bilPecahan kali = pecahan1.kali(pecahan2);

        System.out.println("Pecahan 1: " + pecahan1.bentukCampuran());
        System.out.println("Pecahan 2: " + pecahan2.bentukCampuran());

        System.out.println("Hasil Penjumlahan: " + jumlah.bentukCampuran());
        System.out.println("Hasil Perkalian: " + kali.bentukCampuran());

        pecahan1.infoPecahan();
        pecahan2.infoPecahan();
        jumlah.infoPecahan();
        kali.infoPecahan();
    }
}
