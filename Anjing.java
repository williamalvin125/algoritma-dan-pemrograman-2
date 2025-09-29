package datahewan;

public class Anjing extends HewanPeliharaan {
    private String nama;
    private String warnamata;
    private String minumanfavorit;
    
    Anjing(String name, String gender, String species, String eyes, String drink){
        super(name, gender, species);
        this.warnamata = eyes;
        this.minumanfavorit = drink;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String name) {
        this.nama = name;
    }
    
    public String getWarnaMata() {
        return warnamata;
    }

    public void setWarnaMata(String eyes) {
        this.warnamata = eyes;
    }

    public String getMinumanFavorit() {
        return minumanfavorit;
    }

    public void setMinumanFavorit(String drink) {
        this.minumanfavorit = drink;
    }
    
     public void displayInfo() {
        super.displayInfo();
        System.out.println("Warna Mata: " + warnamata);
        System.out.println("Minuman Favorit: " + minumanfavorit);
    }
     
     public void menggonggong(){
        System.out.println(nama +" :  Gug, gug, gug!");
    }
    
    public static void main(String[] args) {
        Anjing anjingKu = new Anjing("Sainz", "Jantan", "Chihuahua", "Cokelat", "Susu");
        anjingKu.setWarnaMata("Hitam");
        anjingKu.displayInfo();
        System.out.println();
        anjingKu.makan();
        anjingKu.tidur();
        anjingKu.kawin();
        anjingKu.menggonggong();
    }
    
}
    

