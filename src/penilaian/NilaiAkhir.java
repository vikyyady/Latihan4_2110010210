package penilaian;

public class NilaiAkhir extends Mahasiswa {
    private int uts;
    private int uas;
    private int tugas;

    public NilaiAkhir(String nama, String npm, int uts, int uas, int tugas) {
        super(nama, npm);
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
    }

    public double hitungNilaiAkhir() {
        double nilaiAkhir = 0.3 * uts + 0.3 * uas + 0.4 * tugas;
        return nilaiAkhir;
    }
}