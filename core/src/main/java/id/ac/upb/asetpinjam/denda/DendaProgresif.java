package id.ac.upb.asetpinjam.denda;

import id.ac.upb.asetpinjam.kontrak.AturanDenda;
import id.ac.upb.asetpinjam.model.Aset;

/**
 * Minggu 5: denda yang makin berat bila makin lama terlambat.
 *
 * <p>Rumus progresifnya KEPUTUSAN ANDA (catat di docs/asumsi.md). Syarat minimal yang diuji:
 * 0 hari = 0; tidak pernah lebih murah dari DendaFlat; tidak pernah turun saat hari bertambah.
 */
public class DendaProgresif implements AturanDenda {

    @Override
    public long hitung(Aset aset, int hariTerlambat) {
        if (aset == null) {
            throw new IllegalArgumentException("Aset tidak boleh null");
        }

        if (hariTerlambat < 0) {
            throw new IllegalArgumentException("Hari terlambat tidak boleh negatif");
        }

        if (hariTerlambat == 0) {
            return 0;
        }
        
        long dendaFlat = aset.hitungDenda(hariTerlambat);
        int pengali;

        if (hariTerlambat <= 7) {
            pengali = 1;
        } else if (hariTerlambat <= 14) {
            pengali = 2;
        } else if (hariTerlambat <= 30) {
            pengali = 3;
        } else {
            pengali = 4;
        }

        return Math.multiplyExact(dendaFlat, pengali);
    }
}
