// File: Tendik.java
// Deskripsi: Subclass Tendik extends Pegawai
// Pembuat: Ganendra Satya Sindhunata
// Tanggal: 18 Maret 2026

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {
    private String bidangKerja;

    public Tendik(String nip, String nama, LocalDate tanggalLahir,
                  LocalDate tmt, double gajiPokok, String bidangKerja) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidangKerja = bidangKerja;
    }

    // BUP Tendik = 55 tahun
    public LocalDate getTanggalPensiun() {
        LocalDate bup = tanggalLahir.plusYears(55);
        return bup.withDayOfMonth(1).plusMonths(1);
    }

    // Tunjangan 1% x masa kerja (tahun) x gaji pokok
    public double getTunjangan() {
        int tahunKerja = getMasaKerja().getYears();
        return 0.01 * tahunKerja * gajiPokok;
    }

    @Override
    public void printInfo() {
        Period mk = getMasaKerja();
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT             : " + formatTanggal(tmt));
        System.out.println("Bidang Kerja    : " + bidangKerja);
        System.out.println("Masa Kerja      : " + mk.getYears() + " tahun " + mk.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan       : Rp " + String.format("%,.2f", getTunjangan()));
    }
}