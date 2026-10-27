package Java.Jobsheet7;

import java.util.Scanner;

public class TugasBioskop04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket;
        int totalTiket = 0;
        double hargaAwal, diskon, hargaAkhir;
        double totalPenjualan = 0;

        System.out.println("=== Penjualan Tiket Bioskop (Rp 50.000 / tiket) ===");
        System.out.println("Ketik 0 untuk mengakhiri penjualan hari ini.");

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan: ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi jumlah yang valid!");
                continue;
            }

            if (jumlahTiket == 0) {
                break;
            }

            hargaAwal = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                diskon = hargaAwal * 0.15;
                System.out.println("Diskon 15%: Rp " + diskon);
            } else if (jumlahTiket > 4) {
                diskon = hargaAwal * 0.10;
                System.out.println("Diskon 10%: Rp " + diskon);
            } else {
                diskon = 0;
                System.out.println("Tidak ada diskon.");
            }

            hargaAkhir = hargaAwal - diskon;
            System.out.println("Total yang harus dibayar: Rp " + hargaAkhir);

            totalTiket += jumlahTiket;
            totalPenjualan += hargaAkhir;
        } while (true);

        System.out.println("=== Rekap Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);

        sc.close();
    }
}