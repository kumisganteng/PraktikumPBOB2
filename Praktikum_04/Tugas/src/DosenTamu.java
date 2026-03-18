// File: DosenTamu.java
// Deskripsi: Subclass DosenTamu extends Pegawai
// Pembuat: Ganendra Satya Sindhunata
// Tanggal: 18 Maret 2026

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Pegawai {
    private String nidk;
    private LocalDate tanggalBerakhirKontrak;

    public DosenTamu(String nip, String nidk, String nama, LocalDate tanggalLahir,
                     LocalDate tmt, double gajiPokok, LocalDate tanggalBerakhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.nidk = nidk;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    // BUP Dosen Tamu = sisa masa kontrak (dalam bulan)
    public int getSisaKontrakBulan() {
        Period sisa = Period.between(LocalDate.now(), tanggalBerakhirKontrak);
        return sisa.getYears() * 12 + sisa.getMonths();
    }

    // Tunjangan 2,5% x gaji pokok
    public double getTunjangan() {
        return 0.025 * gajiPokok;
    }

    @Override
    public void printInfo() {
        Period mk = getMasaKerja();
        System.out.println("NIP                    : " + nip);
        System.out.println("NIDK                   : " + nidk);
        System.out.println("Nama                   : " + nama);
        System.out.println("Tanggal Lahir          : " + formatTanggal(tanggalLahir));
        System.out.println("TMT                    : " + formatTanggal(tmt));
        System.out.println("Jabatan                : Dosen Tamu");
        System.out.println("Masa Kerja             : " + mk.getYears() + " tahun " + mk.getMonths() + " bulan");
        System.out.println("Tanggal Akhir Kontrak  : " + formatTanggal(tanggalBerakhirKontrak));
        System.out.println("Sisa Kontrak           : " + getSisaKontrakBulan() + " bulan");
        System.out.println("Gaji Pokok             : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan              : Rp " + String.format("%,.2f", getTunjangan()));
    }
}