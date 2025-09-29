package datahewan;

public class HewanPeliharaan {
    protected String nama;
    protected String jenisKelamin;
    protected String spesies;
    
    HewanPeliharaan(String name, String gender, String species){
        this.nama = name;
        this.jenisKelamin = gender;
        this.spesies = species;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String name) {
        this.nama = name;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String gender) {
        this.jenisKelamin = gender;
    }

    public String getSpesies() {
        return spesies;
    }

    public void setSpesies(String species) {
        this.spesies = species;
    }
    
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Spesies: " + spesies);
    }
    
    public void makan(){
        System.out.println(nama +" sedang makan.");
    }
    
    public void kawin(){
        System.out.println(nama +" sedang kawin dengan pasangannya.");
    }
    
    public void tidur(){
        System.out.println(nama +" sedang tidur.");
    }
    
}