import java.util.Scanner;

public class tugas1DiskonTokoBuku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Total belanja (Rp): ");
        double total = sc.nextDouble();
        System.out.print("Apakah pembeli member? (true/false): ");
        boolean member = sc.nextBoolean();

        double persenDiskon;
        if (member) {
            if (total >= 200000) {
                persenDiskon = 15;
            } else {
                persenDiskon = 10;
            }
        } else {
            if (total >= 200000) {
                persenDiskon = 10;
            } else if (total >= 100000) {
                persenDiskon = 5;
            } else {
                persenDiskon = 0;
            }
        }

        double diskon = total * persenDiskon / 100;
        double totalBayar = total - diskon;
        System.out.println("Diskon          : " + persenDiskon + "%");
        System.out.println("Potongan        : Rp" + diskon);
        System.out.println("Total dibayar   : Rp" + totalBayar);
    }
}
