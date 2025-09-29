package elektronik;

class Tablet extends PerangkatElektronik {
    private String resolusiLayar;
    private int kapasitasPenyimpanan;
    
    public Tablet(String merk, String model, int tahunProduksi, String resolusiLayar, int kapasitasPenyimpanan) {
        super(merk, model, tahunProduksi);
        this.resolusiLayar = resolusiLayar;
        this.kapasitasPenyimpanan = kapasitasPenyimpanan;
    }
    
    void displayInfo() {
        System.out.println("Tablet - Merk: " + merk + ", Model: " +model +", Tahun Produksi: " +tahunProduksi +", Resolusi Layar: " +resolusiLayar +", Kapasitas Penyimpanan: "  +kapasitasPenyimpanan +" GB");
    }
    
}
