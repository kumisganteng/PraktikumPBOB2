// File    : Pengusaha.java
// Deskripsi: Class Pengusaha extends Manusia
// Pembuat : (nama kamu)
// Tanggal : 24-03-2026

import java.util.Date;

public class Pengusaha extends Manusia {
    private String npwp;
    private static int counterPengusaha = 0;
    private static final int B = 1; // Ganti dengan digit ke-13 NIM kamu

    public Pengusaha() { super(); counterPengusaha++; }

    public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp() { return npwp; }
    public void setNpwp(String npwp) { this.npwp = npwp; }
    public static int getCounterPengusaha() { return counterPengusaha; }

    @Override
    public int hitungMasaKerja() {
        Date now = new Date();
        long diffMillis = now.getTime() - tgl_mulai_kerja.getTime();
        int tahun = (int) (diffMillis / (1000L * 60 * 60 * 24 * 365));
        return tahun + B;
    }

    @Override
    public double hitungPajak() { return 0.15 * pendapatan; }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP           : " + npwp);
        System.out.println("Jenis          : Pengusaha");
    }
}