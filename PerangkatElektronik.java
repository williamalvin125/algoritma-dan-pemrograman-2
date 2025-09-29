package elektronik;

abstract class PerangkatElektronik {
    protected String merk;
    protected String model;
    protected int tahunProduksi;
    
    public PerangkatElektronik (String merk, String model, int tahunProduksi){
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }
    
    abstract void displayInfo();
    
}

