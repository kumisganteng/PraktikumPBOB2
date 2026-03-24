// File    : Lingkaran.java
// Deskripsi: Class Lingkaran extends BangunDatar implements IResize
// Pembuat : Ganendra Satya Sindhunata
// Tanggal : 24-03-2026

public class Lingkaran extends BangunDatar implements IResize {
    private double radius;

    // Constructor
    public Lingkaran() {}
    public Lingkaran(double radius) { this.radius = radius; }

    // Getter & Setter
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    // Implementasi abstract method dari BangunDatar
    @Override
    public double getLuas() { return Math.PI * radius * radius; }

    @Override
    public double getKeliling() { return 2 * Math.PI * radius; }

    // Implementasi method dari interface IResize
    @Override
    public void zoomIn() { radius = radius * 1.1; }

    @Override
    public void zoomOut() { radius = radius * 0.9; }

    @Override
    public void zoom(int percent) { radius = radius * percent / 100; }
}