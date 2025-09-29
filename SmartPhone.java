package elektronik;

class SmartPhone extends PerangkatElektronik {
    private int kapasitasBaterai;
    private int kameraUtama;
    
    public SmartPhone(String merk, String model, int tahunProduksi, int kapasitasBaterai, int kameraUtama) {
        super(merk, model, tahunProduksi);
        this.kapasitasBaterai = kapasitasBaterai;
        this.kameraUtama = kameraUtama;
    }
    
    void displayInfo() {
        System.out.println("Smartphone - Merk: " + merk + ", Model: " +model +", Tahun Produksi: " +tahunProduksi +", Kapasitas Baterai: " +kapasitasBaterai +", mAh, Kamera Utama: "  +kameraUtama +" MP");
    }
    
}
