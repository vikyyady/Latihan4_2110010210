package penilaian;

public class Main {
    public static void main(String[] args) {
        NilaiAkhir viky = new NilaiAkhir("Viky Adi Arya Efendi", "2110010210", 80, 85, 90);

        System.out.println("Data Mahasiswa:");
        System.out.println("Nama: " + viky.getNama());
        System.out.println("NPM: " + viky.getNpm());
        System.out.println("Nilai Akhir: " + viky.hitungNilaiAkhir());
    }
}
