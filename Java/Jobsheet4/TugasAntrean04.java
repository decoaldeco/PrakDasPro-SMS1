import java.util.Scanner;

public class TugasAntrean04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kodeLayanan;

        System.out.println("--- MESIN ANTREAN ---");
        System.out.println("1. Administasi Akademik");
        System.out.println("2. Pembayaran UKT");
        System.out.println("3. KRS");
        System.out.println("4. Surat Akademik");

        System.out.println("Masukkan kode layanan: ");
        kodeLayanan = input.nextInt();

        switch (kodeLayanan) {
            case 1:
                System.out.println("Layanan Adminitasi Akademik");
                break;
            case 2:
                System.out.println("Layanan Pembayaran UKT");
                break;
            case 3:
                System.out.println("Layanan KRS");
                break;
            case 4:
                System.out.println("Layanan Surat Akademik");
                break;
        
            default:
                System.out.println("Kode layanan tidak tersedia");
        }
        input.close();
    }
    
}
