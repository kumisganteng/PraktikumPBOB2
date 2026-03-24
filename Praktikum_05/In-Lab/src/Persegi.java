// File    : Persegi.java
// Deskripsi: Class Persegi extends BangunDatar implements IResize
// Pembuat : Ganendra Satya Sindhunata
// Tanggal : 24-03-2026

public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    // Constructor
    public Persegi() {}
    public Persegi(double sisi) { this.sisi = sisi; }

    // Getter & Setter
    public double getSisi() { return sisi; }
    public void setSisi(double sisi) { this.sisi = sisi; }

    // Implementasi abstract method dari BangunDatar
    @Override
    public double getLuas() { return sisi * sisi; }

    @Override
    public double getKeliling() { return 4 * sisi; }

    // Implementasi method dari interface IResize
    @Override
    public void zoomIn() { sisi = sisi * 1.1; }

    @Override
    public void zoomOut() { sisi = sisi * 0.9; }

    @Override
    public void zoom(int percent) { sisi = sisi * percent / 100; }
}