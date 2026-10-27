import java.util.Scanner;

public class CicilanLaptop04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga;
        int uangMuka;
        int lamaCicilan;
        double sisaHarga;
        double bunga;
        double totalBayar;
        double cicilanPerBulan;

        System.out.println("Masukkan harga laptop: " );
        harga = sc.nextInt();
        System.out.println("Masukkan uang muka: ");
        uangMuka = sc.nextInt();
        System.out.println("Masukkan lama cicilan (bulan): ");
        lamaCicilan = sc.nextInt();

        sisaHarga = harga - uangMuka;
        bunga = 0.02 * sisaHarga;
        totalBayar = sisaHarga + (bunga * lamaCicilan);
        cicilanPerBulan = totalBayar / lamaCicilan;

        System.out.printf("Cicilan yang harus anda bayar setiap bulan adalah Rp. %,.2f%n", cicilanPerBulan);

        sc.close();
    }
}