import java.util.Scanner;
public class BiayaCetakDokumen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahLembar;
        int biayaPerLember=500;
        int biayaJilid=5000;
        int biayaCetak;
        int totalBiaya;

        System.out.println("Masukkan jumlah lembar dokumen: ");
        jumlahLembar = sc.nextInt();
        biayaCetak = jumlahLembar * biayaPerLember;
        totalBiaya = biayaCetak + biayaJilid;

        System.out.println("Total biaya yang harus dibayar Rp. " + totalBiaya);

        sc.close();
    }
    
}
