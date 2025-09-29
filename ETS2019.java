package tugas;

public class ETS2019 {
    public static void main(String[] args){
        Gagak BG = new Gagak();
        cetak(BG);
        cetak(new Burung());
        cetak(new Hewan());
    }
    
    public static void cetak(Hewan x){
        System.out.println(x.getket() + "---" +x.warna);
    }
}

class Gagak extends Burung{
    public Gagak(){
        System.out.println("Objek Gagak Diciptakan.");
        warna = "COKELAT";
    }
}

class Burung extends Hewan{
    public String getket(){
        return "Burung";
    }
}

class Hewan {
    protected String warna;
    
    public Hewan(){
        System.out.println("Objek Hewan Diciptakan.");
        warna = "HITAM";
    }
    
    public String getket() {
        return "HEWAN";
    }
}

