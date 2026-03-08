public class MataKuliah {
    
    // ===== ATRIBUT =====
    private String idMatKul;
    private String nama;
    private int sks;
    
    // ===== KONSTRUKTOR =====
    
    // Konstruktor tanpa parameter
    public MataKuliah() {
    }
    
    // Konstruktor dengan parameter
    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }
    
    // ===== GETTER (Selektor) =====
    
    public String getIdMatKul() {
        return idMatKul;
    }
    
    public String getNama() {
        return nama;
    }
    
    public int getSks() {
        return sks;
    }
    
    // ===== SETTER (Mutator) =====
    
    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setSks(int sks) {
        this.sks = sks;
    }
}