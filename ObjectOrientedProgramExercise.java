package latihan;
public class ObjectOrientedProgramExercise {

    public static void main(String[] args) {
        Gagak BG = new Gagak();
        cetak(BG);
        cetak(new Burung());
        cetak(new Hewan());
    }
    public static void cetak(Hewan x){
        System.out.println(x.getket() +"---" +x.warna);
    }
}

class Gagak extends Burung {
    public Gagak(){
        System.out.println("Objek Gagak diciptakan");
        warna = "COKELAT";
    }
    public String getket(){
        return "Gagak";
    }
}

class Burung extends Hewan {
    public String getket() {
        return "Burung";
    }
}

class Hewan {
    protected String warna;

    public Hewan (){
        System.out.println("Objek Hewan diciptakan");
        warna = "HITAM";
    }
    public String getket() {
        return "Hewan";
    }
}