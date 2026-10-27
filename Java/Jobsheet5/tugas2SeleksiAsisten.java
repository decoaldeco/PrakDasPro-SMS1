import java.util.Scanner;

public class tugas2SeleksiAsisten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah mahasiswa berstatus aktif? (true/false): ");
        boolean aktif = sc.nextBoolean();
        System.out.print("Apakah sedang mendapat sanksi akademik? (true/false): ");
        boolean disanksi = sc.nextBoolean();
        System.out.print("Nilai dasar pemrograman: ");
        double nilaiDasPro = sc.nextDouble();
        System.out.print("Punya sertifikat kompetensi pemrograman? (true/false): ");
        boolean punyaSertifikat = sc.nextBoolean();

        if (aktif && !disanksi) {
            if (nilaiDasPro >= 80 || punyaSertifikat) {
                System.out.print("Lolos seleksi berkas. Masukkan nilai wawancara: ");
                double nilaiWawancara = sc.nextDouble();

                if (nilaiWawancara >= 75) {
                    System.out.println("Selamat! Diterima sebagai asisten praktikum");
                } else {
                    System.out.println("Gagal: nilai wawancara kurang dari 75");
                }
            } else {
                System.out.println("Gagal: nilai dasar pemrograman kurang dari 80 dan tidak punya sertifikat kompetensi");
            }
        } else {
            if (!aktif && disanksi) {
                System.out.println("Gagal: mahasiswa tidak aktif dan sedang disanksi akademik");
            } else if (!aktif) {
                System.out.println("Gagal: mahasiswa tidak berstatus aktif");
            } else {
                System.out.println("Gagal: mahasiswa sedang mendapat sanksi akademik");
            }
        }
        sc.close();
    }
}
