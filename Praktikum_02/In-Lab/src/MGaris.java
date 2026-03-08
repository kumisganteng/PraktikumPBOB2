/* Nama File   : MGaris.java
 * Deskripsi   : main class untuk class Garis
 * Pembuat     : (nama kamu)
 * Tanggal     : (tanggal hari ini)
 */

public class MGaris {

    public static void main(String[] args) {

        Titik A = new Titik(-2, 0);
        Titik B = new Titik(0, 4);
        Garis G1 = new Garis(A, B);

        G1.printGaris();
        System.out.println("Panjang G1 = " + G1.getPanjang());
        System.out.println("Gradien G1 = " + G1.getGradien());

        Titik tengah = G1.getTitikTengah();
        System.out.print("Titik Tengah G1: ");
        tengah.printTitik();

        System.out.println("Persamaan G1: " + G1.getPersamaan());

        Titik C = new Titik(0, 0);
        Titik D = new Titik(2, 4);
        Garis G2 = new Garis(C, D);

        System.out.println("G1 sejajar G2? " + G1.isSejajar(G2));
        System.out.println("G1 tegak lurus G2? " + G1.isTegakLurus(G2));
    }
}