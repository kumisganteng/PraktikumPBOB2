// File: Main.java
// Deskripsi: Main class untuk menguji Persegi dan Lingkaran
// Pembuat: [Nama Kamu]
// Tanggal: [Tanggal]

public class Main {
    public static void main(String[] args) {

        // Membuat objek Persegi
        Persegi p = new Persegi(5.0, "Merah", "Hitam");
        System.out.println("=== Info Persegi ===");
        p.printInfo();
        System.out.println("Luas: " + p.getLuas());
        System.out.println("Keliling: " + p.getKeliling());
        System.out.println("Diagonal: " + p.getDiagonal());

        System.out.println();

        // Membuat objek Lingkaran
        Lingkaran l = new Lingkaran(10.0, "Biru", "Putih");
        System.out.println("=== Info Lingkaran ===");
        l.printInfo();
        System.out.println("Luas: " + l.getLuas());
        System.out.println("Keliling: " + l.getKeliling());

        System.out.println();

        // Counter objek
        BangunDatar.printCounterBangunDatar();
    }
}

