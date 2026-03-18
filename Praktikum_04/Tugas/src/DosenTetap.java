// File: DosenTetap.java
// Deskripsi: Subclass DosenTetap extends Pegawai
// Pembuat: [Nama Kamu]
// Tanggal: [Tanggal]

import java.time.LocalDate;
import java.time.Period; 

public class DosenTetap extends Pegawai {
    private String nidn;
    private String fakultas;

    public DosenTetap(String nip, String nidn, String nama, LocalDate tanggalLahir,
                      LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.nidn = nidn;
        this.fakultas = fakultas;
    }

    // BUP Dosen Tetap = 65 tahun
    public LocalDate getTanggalPensiun() {
        LocalDate bup = tanggalLahir.plusYears(65);
        // Jatuh pada tanggal 1 bulan berikutnya
        return bup.withDayOfMonth(1).plusMonths(1);
    }

    // Tunjangan 2% x masa kerja (tahun) x gaji pokok
    public double getTunjangan() {
        int tahunKerja = getMasaKerja().getYears();
        return 0.02 * tahunKerja * gajiPokok;
    }

    @Override
    public void printInfo() {
        Period mk = getMasaKerja();
        System.out.println("NIP             : " + nip);
        System.out.println("NIDN            : " + nidn);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT             : " + formatTanggal(tmt));
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Masa Kerja      : " + mk.getYears() + " tahun " + mk.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan       : 2% x " + mk.getYears() + " x Rp " +
                String.format("%,.2f", gajiPokok) + " = Rp " + String.format("%,.2f", getTunjangan()));
    }
}