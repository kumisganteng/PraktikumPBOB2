// File    : Manusia.java
// Deskripsi: Abstract class Manusia implements Pajak
// Pembuat : Ganendra Satya Sindhunata
// Tanggal : 24-03-2026

import java.util.Date;

public abstract class Manusia implements Pajak {
    protected String nama;
    protected Date tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia() { counterMns++; }

    public Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = parseDate(tgl_mulai_kerja);
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    protected Date parseDate(String tgl) {
        try {
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
            return sdf.parse(tgl);
        } catch (Exception e) {
            return new Date();
        }
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public Date getTgl_mulai_kerja() { return tgl_mulai_kerja; }
    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }
    public double getPendapatan() { return pendapatan; }
    public void setPendapatan(double pendapatan) { this.pendapatan = pendapatan; }
    public static int getCounterMns() { return counterMns; }

    public abstract int hitungMasaKerja();

    public void cetakInfo() {
        System.out.println("---------------------------");
        System.out.println("Nama           : " + nama);
        System.out.println("Tgl Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat         : " + alamat);
        System.out.println("Pendapatan     : " + pendapatan);
        System.out.println("Masa Kerja     : " + hitungMasaKerja());
        System.out.println("Pajak          : " + hitungPajak());
    }
}