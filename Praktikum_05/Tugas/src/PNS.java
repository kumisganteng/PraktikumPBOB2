// File    : PNS.java
// Deskripsi: Class PNS extends Manusia
// Pembuat : Ganendra Satya Sindhunata
// Tanggal : 24-03-2026

import java.util.Date;

public class PNS extends Manusia {
    private String nip;
    private static int counterPNS = 0;
    private static final int A = 2; // Ganti dengan digit ke-14 NIM kamu

    public PNS() { super(); counterPNS++; }

    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip() { return nip; }
    public void setNip(String nip) { this.nip = nip; }
    public static int getCounterPNS() { return counterPNS; }

    @Override
    public int hitungMasaKerja() {
        Date now = new Date();
        long diffMillis = now.getTime() - tgl_mulai_kerja.getTime();
        int tahun = (int) (diffMillis / (1000L * 60 * 60 * 24 * 365));
        return tahun + A;
    }

    @Override
    public double hitungPajak() { return 0.10 * pendapatan; }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP            : " + nip);
        System.out.println("Jenis          : PNS");
    }
}