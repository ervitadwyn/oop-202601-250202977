package id.ac.upb.asetpinjam.mahasiswa;

import static id.ac.upb.asetpinjam.TestSupport.pinjam;
import static id.ac.upb.asetpinjam.TestSupport.peminjam;
import static id.ac.upb.asetpinjam.TestSupport.ruang;
import static org.assertj.core.api.Assertions.assertThat;

import id.ac.upb.asetpinjam.jadwal.JadwalPeminjaman;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
/**
 * FOLDER INI MILIK ANDA. Tulis tes Anda sendiri di sini (minggu 7 dan seterusnya).
 *
 * <p>Tes dosen sengaja tidak menentukan: apakah peminjaman 09:00-11:00 dan 11:00-13:00 pada aset yang sama
 * bentrok? Putuskan, catat alasannya di docs/asumsi.md, lalu tuliskan tesnya di sini.
 * Hapus @Disabled setelah Anda mengisinya.
 *
 * <p>Syarat minggu 10: folder ini memuat minimal 8 tes (tidak termasuk contoh bawaan ini).
 */
@Tag("week7")
class BatasBentrokTest {

    private JadwalPeminjaman jadwal;

    @BeforeEach
    void siapkan() {
        jadwal = new JadwalPeminjaman(10);
    }

    @Test
    void selesaiSamaDenganMulaiTidakBentrok() {
        jadwal.tambah(pinjam("1", peminjam("P1"), ruang("R-1"), 9, 11));

        var baru = pinjam("2", peminjam("P2"), ruang("R-1"), 11, 13);

        assertThat(jadwal.bentrok(baru)).isFalse();
    }

    @Test
    void mulaiSamaDenganSelesaiTidakBentrok() {
        jadwal.tambah(pinjam("1", peminjam("P1"), ruang("R-1"), 11, 13));

        var baru = pinjam("2", peminjam("P2"), ruang("R-1"), 9, 11);

        assertThat(jadwal.bentrok(baru)).isFalse();
    }

    @Test
    void mulaiBersamaanDianggapBentrok() {
        jadwal.tambah(pinjam("1", peminjam("P1"), ruang("R-1"), 9, 11));

        var baru = pinjam("2", peminjam("P2"), ruang("R-1"), 9, 12);

        assertThat(jadwal.bentrok(baru)).isTrue();
    }

    @Test
    void peminjamanBaruDimulaiSebelumPeminjamanLamaTetapBentrok() {
        jadwal.tambah(pinjam("1", peminjam("P1"), ruang("R-1"), 10, 12));

        var baru = pinjam("2", peminjam("P2"), ruang("R-1"), 8, 11);

        assertThat(jadwal.bentrok(baru)).isTrue();
    }

    @Test
    void peminjamanBaruMencakupSeluruhPeminjamanLamaTetapBentrok() {
        jadwal.tambah(pinjam("1", peminjam("P1"), ruang("R-1"), 9, 11));

        var baru = pinjam("2", peminjam("P2"), ruang("R-1"), 8, 12);

        assertThat(jadwal.bentrok(baru)).isTrue();
    }
}