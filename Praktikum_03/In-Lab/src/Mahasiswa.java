import java.util.ArrayList;

public class Mahasiswa {
    
    // ===== ATRIBUT =====
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    
    // ===== KONSTRUKTOR =====
    
    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.listMatKul = new ArrayList<>();
    }
    
    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }
    
    // ===== GETTER (Selektor) =====
    
    public String getNim() {
        return nim;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getProdi() {
        return prodi;
    }
    
    public ArrayList<MataKuliah> getListMatKul() {
        return listMatKul;
    }
    
    public Dosen getDosenWali() {
        return dosenWali;
    }
    
    public Kendaraan getKendaraan() {
        return kendaraan;
    }
    
    // ===== SETTER (Mutator) =====
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }
    
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }
    
    // ===== METHOD TAMBAHAN =====
    
    // Menambahkan matakuliah ke list (max 50)
    public void addMatKul(MataKuliah newMatKul) {
        listMatKul.add(newMatKul);
    }
    
    // Menghitung total SKS
    public int getJumlahSKS() {
        int total = 0;
        for (int i = 0; i < listMatKul.size(); i++) {
            total += listMatKul.get(i).getSks();
        }
        return total;
    }
    
    // Menghitung jumlah matakuliah
    public int getJumlahMatKul() {
        return listMatKul.size();
    }
    
    // Menampilkan nim, nama, prodi
    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }
    
    // Menampilkan detail lengkap mahasiswa
    public void printDetailMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Dosen Wali: " + dosenWali.getNama());
        System.out.println("Kendaraan: " + kendaraan.getNoPlat() + " (" + kendaraan.getJenis() + ")");
        System.out.println("Mata Kuliah yang diambil:");
        for (int i = 0; i < listMatKul.size(); i++) {
            System.out.println("  - " + listMatKul.get(i).getNama() + 
                               " (" + listMatKul.get(i).getSks() + " SKS)");
        }
    }
}