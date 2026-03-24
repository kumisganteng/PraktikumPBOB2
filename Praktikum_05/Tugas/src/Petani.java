// File    : Petani.java
// Deskripsi: Class Petani extends Manusia
// Pembuat : (nama kamu)
// Tanggal : 24-03-2026

import java.util.Date;

public class Petani extends Manusia {
    private String asal_kota;
    private static int counterPetani = 0;
    private static final int C = 0; // Ganti dengan digit ke-12 NIM kamu

    public Petani() { super(); counterPetani++; }

    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsal_kota() { return asal_kota; }
    public void setAsal_kota(String asal_kota) { this.asal_kota = asal_kota; }
    public static int getCounterPetani() { return counterPetani; }

    @Override
    public int hitungMasaKerja() {
        Date now = new Date();
        long diffMillis = now.getTime() - tgl_mulai_kerja.getTime();
        int tahun = (int) (diffMillis / (1000L * 60 * 60 * 24 * 365));
        return tahun + C;
    }

    @Override
    public double hitungPajak() { return 0; }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota      : " + asal_kota);
        System.out.println("Jenis          : Petani");
    }
}