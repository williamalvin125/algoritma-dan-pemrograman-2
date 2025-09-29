package penugasan;

// Kelas Anggota yang mewarisi dari Mobil
public class anggota extends mobil {
    private String KdAnggota;
    private int jmlMobil;
    protected String KodeMobil;
    protected String MerekMobil;

    public String getKdAnggota() {
        return KdAnggota;
    }

    public void setKdAnggota(String newKdAnggota) {
        this.KdAnggota = newKdAnggota;
    }

    public String getKodeMobil() {
        return KodeMobil;
    }

    public void setKodeMobil(String newKodeMobil) {
        this.KodeMobil = newKodeMobil;
    }

    public String getMerekMobil() {
        return MerekMobil;
    }

    public void setMerekMobil(String newMerekMobil) {
        this.MerekMobil = newMerekMobil;
    }

    public int getJmlMobil() {
        return jmlMobil;
    }

    public void daftarMobil() {
        System.out.println("Kode Anggota: " +getKdAnggota());
        System.out.println("Daftar Mobil Yang Dipinjam:");
        System.out.println(getKodeMobil());
        System.out.println(getKdMobil());
    }
}
