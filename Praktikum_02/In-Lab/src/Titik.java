/* Nama File   : Titik.java
 * Deskripsi   : berisi atribut dan method dalam class Titik
 * Pembuat     : (nama kamu)
 * Tanggal     : (tanggal hari ini)
 */

public class Titik {

    // ===== ATRIBUT =====
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    // ===== METHOD =====

    // Konstruktor untuk membuat titik (0,0)
    public Titik() {
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    // Konstruktor dengan nilai absis dan ordinat tertentu
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Getter
    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    // Setter
    public void setAbsis(double x) {
        absis = x;
    }

    public void setOrdinat(double y) {
        ordinat = y;
    }

    // Static getter counterTitik
    public static int getCounterTitik() {
        return counterTitik;
    }

    // Menggeser titik sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Mendapatkan kuadran titik
    public int getKuadran() {
        if (absis > 0 && ordinat > 0) return 1;
        else if (absis < 0 && ordinat > 0) return 2;
        else if (absis < 0 && ordinat < 0) return 3;
        else if (absis > 0 && ordinat < 0) return 4;
        else return 0;
    }

    // Mendapatkan jarak ke pusat (0,0)
    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // Mendapatkan jarak ke titik lain
    public double getJarak(Titik T) {
        double dx = absis - T.getAbsis();
        double dy = ordinat - T.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Refleksi terhadap sumbu X
    public void refleksiX() {
        ordinat = -ordinat;
    }

    // Refleksi terhadap sumbu Y
    public void refleksiY() {
        absis = -absis;
    }

    // Menghasilkan titik baru hasil refleksi sumbu X
    public Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    // Menghasilkan titik baru hasil refleksi sumbu Y
    public Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }

    // Mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}