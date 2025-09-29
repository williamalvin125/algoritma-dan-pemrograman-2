package elektronik;

class Laptop extends PerangkatElektronik {
    private double ukuranLayar;
    private String tipeProsesor;
    
    public Laptop(String merk, String model, int tahunProduksi, double ukuranLayar, String tipeProsesor) {
        super(merk, model, tahunProduksi);
        this.ukuranLayar = ukuranLayar;
        this.tipeProsesor = tipeProsesor;
    }
    
    void displayInfo() {
        System.out.println("Laptop - Merk: " + merk + ", Model: " +model +", Tahun Produksi: " +tahunProduksi +", Ukuran Layar: " +ukuranLayar +", Tipe Prosesor: "  +tipeProsesor);
    }
    
}
