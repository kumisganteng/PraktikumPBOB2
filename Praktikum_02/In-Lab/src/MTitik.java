/* Nama File   : MTitik.java
 * Deskripsi   : main class untuk class Titik
 * Pembuat     : (nama kamu)
 * Tanggal     : (tanggal hari ini)
 */

public class MTitik {

    public static void main(String[] args) {

        // Bagian 1 - Membuat objek Titik
        Titik T1 = new Titik();         // Titik (0,0)
        T1.setAbsis(3);                 // ubah absis T1 = 3
        T1.setOrdinat(10);              // ubah ordinat T1 = 10
        T1.setOrdinat(4);               // ubah ordinat T1 = 4
        T1.printTitik();                // cetak koordinat T1
        T1.geser(3, 4);                 // geser T1 sejauh (3,4)
        T1.printTitik();                // tampilkan setelah digeser

        // Bagian 2 - Object Reference
        Titik T2 = T1;
        T2.printTitik();
        T1.setOrdinat(10);
        T2.printTitik();

        // Bagian 3 - Overloading Constructor
        Titik T3 = new Titik(3, 5);
        T3.printTitik();

        // Bagian 4 - Static
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());

        // Bagian 6 - Method lainnya
        System.out.println("Kuadran T3 = " + T3.getKuadran());
        System.out.println("Jarak ke pusat = " + T3.getJarakPusat());

        Titik T4 = new Titik(1, 2);
        System.out.println("Jarak T3 ke T4 = " + T3.getJarak(T4));

        T3.refleksiX();
        T3.printTitik();

        Titik T5 = T4.getRefleksiY();
        T5.printTitik();
    }
}