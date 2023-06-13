package penilaian;

public class Main {
    public static void main(String[] args) {
        NilaiAkhir nilaiAkhir = new NilaiAkhir("Viky Adi Arya Efendi", "2110010210", 80, 85, 90);

        System.out.println("Data Mahasiswa:");
        System.out.println("Nama: " + nilaiAkhir.getNama());
        System.out.println("NPM: " + nilaiAkhir.getNpm());
        System.out.println("Nilai Akhir: " + nilaiAkhir.hitungNilaiAkhir());
    }
}
