public class Dosen {
    
    // ===== ATRIBUT =====
    private String nip;
    private String nama;
    private String prodi;
    
    // ===== KONSTRUKTOR =====
    
    // Konstruktor tanpa parameter
    public Dosen() {
    }
    
    // Konstruktor dengan parameter
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }
    
    // ===== GETTER (Selektor) =====
    
    public String getNip() {
        return nip;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getProdi() {
        return prodi;
    }
    
    // ===== SETTER (Mutator) =====
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}