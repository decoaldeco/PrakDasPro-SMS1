package Java.Jobsheet8;
import java.util.Scanner;
public class Tugas304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko <= 0){
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int totalSeluruh = 0;
            int barangTerbanyak = -1;
            int tokoTerbanyak = 0;

            String ringkasan = "";

            for (int t = 1; t <= jumlahToko; t++){
                int jumlahPelanggan = 0;
                do {
                    System.out.print("Jumlah pelanggan toko " + t + ": ");
                    jumlahPelanggan = sc.nextInt();
                    if (jumlahPelanggan < 0){
                        System.out.println("Tidak boleh negatif. ulangi input.");
                    }
                } while (jumlahPelanggan < 0);

                int totalBarangToko = 0;
                for (int p = 1; p <= jumlahPelanggan; p++){
                    int barang;
                    do {
                        System.out.print("Jumlah barang pelanggan " + p + ": ");
                        barang = sc.nextInt();
                        if (barang < 0){
                            System.out.println("Tidak bleh negatif. ulangi input.");
                        }
                    } while (barang < 0);
                    totalBarangToko += barang;
                }
                ringkasan += "Toko " + t + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko + "\n";
                totalSeluruh += totalBarangToko;

                if (totalBarangToko > barangTerbanyak){
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = t;
                }
            }
            System.out.println();
            System.out.print(ringkasan);
            System.out.println("Total seluruh barang: " + totalSeluruh);
            System.out.println("Toko denga barang terbanyak: " + tokoTerbanyak);
        }
        sc.close();
    }
}
