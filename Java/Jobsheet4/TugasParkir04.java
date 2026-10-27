import java.util.Scanner;

public class TugasParkir04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lamaParkir;
        int biayaParkir;

        System.out.println("--- PARKIR MOTOR ---");
        System.out.println("Masukkan lama parkir (jam): ");
        lamaParkir = input.nextInt();

        if (lamaParkir <= 0) {
            biayaParkir = 0;
        } else if (lamaParkir == 1) {
            biayaParkir = 2000;
        } else {
            biayaParkir = 2000 + ((lamaParkir - 1) * 1000);
        }
        System.out.println("Lama parkir : " + lamaParkir + " jam");
        System.out.println("Biaya parkir: Rp" + biayaParkir);

        input.close();
    }
    
}
