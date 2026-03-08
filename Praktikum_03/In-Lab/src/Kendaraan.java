public class Kendaraan {
    
    // ===== ATRIBUT =====
    private String noPlat;
    private String jenis; // "motor" atau "mobil"
    
    // ===== KONSTRUKTOR =====
    
    // Konstruktor tanpa parameter
    public Kendaraan() {
    }
    
    // Konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }
    
    // ===== GETTER (Selektor) =====
    
    public String getNoPlat() {
        return noPlat;
    }
    
    public String getJenis() {
        return jenis;
    }
    
    // ===== SETTER (Mutator) =====
    
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }
    
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}