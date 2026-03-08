public class MMahasiswa {
    
    public static void main(String[] args) {
        
        // Membuat objek MataKuliah
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        
        // Membuat objek Mahasiswa
        Mahasiswa M1 = new Mahasiswa("2345", "Citra", "Informatika");
        
        // Membuat objek Dosen
        Dosen D1 = new Dosen("123", "Andi", "Informatika");
        
        // Membuat objek Kendaraan
        Kendaraan K1 = new Kendaraan("H1234AB", "motor");
        
        // Menghubungkan objek-objek ke Mahasiswa
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatKul(PBO);
        M1.addMatKul(MBD);
        
        // Memanggil method
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
    }
}