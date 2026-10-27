import java.util.Scanner;

public class ParkirMotor04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("********** PARKIR MOTOR KAMPUS **********");

        int jamParkir;
        int biayaParkir;

        System.out.print("Masukkan berapa lama anda parkir: ");
        jamParkir = input.nextInt();

        biayaParkir = 2000 + ((jamParkir - 1) * 1000);

        System.out.println("Lama parkir                : " + jamParkir + " jam");
        System.out.println("Total biaya parkir         : Rp " + biayaParkir);

        input.close();
    }
}