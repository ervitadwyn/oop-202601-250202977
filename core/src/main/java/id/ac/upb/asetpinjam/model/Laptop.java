package id.ac.upb.asetpinjam.model;
import id.ac.upb.asetpinjam.config.Varian;


public class Laptop extends Aset {

    private String spesifikasi;
    private String nomorInventaris;

    public Laptop(String kode, String nama, String spesifikasi, String nomorInventaris) {
        super(kode, nama);

        if (spesifikasi == null || spesifikasi.trim().isEmpty()) {
            throw new IllegalArgumentException("Spesifikasi laptop tidak boleh null atau kosong");
        }

        if (nomorInventaris == null || nomorInventaris.trim().isEmpty()) {
            throw new IllegalArgumentException("Nomor inventaris laptop tidak boleh null atau kosong");
        }
        this.spesifikasi = spesifikasi.trim();
        this.nomorInventaris = nomorInventaris.trim();
    }

    public String getSpesifikasi() {
        return spesifikasi;
    }

    public String getNomorInventaris() {
        return nomorInventaris;
    }

    @Override
    public JenisAset getJenis() {
        return JenisAset.LAPTOP;
    }

    @Override
    public long hitungDenda(int hariTerlambat) {
        if (hariTerlambat < 0) {
            throw new IllegalArgumentException("Hari terlambat tidak boleh negatif");
        }
        return (long) hariTerlambat * 2 * Varian.aktif().dendaPerHari; // Denda per hari untuk laptop adalah 10000
    }
}
