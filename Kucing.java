package datahewan;

public class Kucing extends HewanPeliharaan {
    private String nama;
    private String warnabulu;
    private String makananfavorit;
    
    Kucing(String name, String gender, String species, String fur, String food){
        super(name, gender, species);
        this.warnabulu = fur;
        this.makananfavorit = food;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String name) {
        this.nama = name;
    }
    
    public String getWarnaBulu() {
        return warnabulu;
    }

    public void setWarnaBulu(String fur) {
        this.warnabulu = fur;
    }

    public String getMakananFavorit() {
        return makananfavorit;
    }

    public void setMakananFavorit(String food) {
        this.makananfavorit = food;
    }
    
     public void displayInfo() {
        super.displayInfo();
        System.out.println("Warna Bulu: " + warnabulu);
        System.out.println("Makanan Favorit: " + makananfavorit);
    }
     
     public void mengeong(){
        System.out.println(nama +" :  Miaw, miaw, miaw!");
    }
    
    public static void main(String[] args) {
        Kucing kucingKu = new Kucing("Luna", "Betina", "Anggora", "Putih", "Ikan");
        kucingKu.setNama("Ruby");
        kucingKu.displayInfo();
        System.out.println();
        kucingKu.makan();
        kucingKu.tidur();
        kucingKu.kawin();
        kucingKu.mengeong();
    }
    
}
    

