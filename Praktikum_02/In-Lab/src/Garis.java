/* Nama File   : Garis.java
 * Deskripsi   : berisi atribut dan method dalam class Garis
 * Pembuat     : (nama kamu)
 * Tanggal     : (tanggal hari ini)
 */

public class Garis {

    // ===== ATRIBUT =====
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // ===== KONSTRUKTOR =====

    // Konstruktor tanpa parameter → titikAwal (0,0), titikAkhir (1,1)
    public Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // Konstruktor dengan parameter
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // ===== GETTER =====
    public Titik getTitikAwal() { return titikAwal; }
    public Titik getTitikAkhir() { return titikAkhir; }
    public static int getCounterGaris() { return counterGaris; }

    // ===== SETTER =====
    public void setTitikAwal(Titik titikAwal) { this.titikAwal = titikAwal; }
    public void setTitikAkhir(Titik titikAkhir) { this.titikAkhir = titikAkhir; }

    // Panjang garis
    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    // Gradien garis
    public double getGradien() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return dy / dx;
    }

    // Titik tengah garis
    public Titik getTitikTengah() {
        double x = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double y = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(x, y);
    }

    // Cek sejajar
    public boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }

    // Cek tegak lurus
    public boolean isTegakLurus(Garis g) {
        return this.getGradien() * g.getGradien() == -1;
    }

    // Tampilkan titik awal dan akhir
    public void printGaris() {
        System.out.print("Titik Awal: ");
        titikAwal.printTitik();
        System.out.print("Titik Akhir: ");
        titikAkhir.printTitik();
    }

    // Persamaan garis y = mx + c
    public String getPersamaan() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}