import java.util.Scanner;
public class KasusModifikasi1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan gaji pokok : ");
        double gajiPokok = input.nextDouble();
        System.out.println("Masukkan tunjangan per anak : ");
        double tunjanganPerAnak = input.nextDouble();
        System.out.println("Masukkan jumlah anak : ");
        int jumlahAnak = input.nextInt();

        double persenPensiun = 0.10;
        double tunjanganAnak = jumlahAnak * tunjanganPerAnak;
        double potonganPesiun = gajiPokok * persenPensiun;
        double gajiBersih = gajiPokok + tunjanganAnak - potonganPesiun;

        System.out.println("Tunjangan Anak : " + tunjanganAnak);
        System.out.println("Potongan Pensiun : " + potonganPesiun);
        System.out.println("Gaji Bersih : " + gajiBersih);

        input.close();
    }
}
