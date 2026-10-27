
import java.util.Scanner;

public class jenisSegitiga04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.print("Masukkan sudut a: ");
        a = input.nextInt();

        System.out.print("Masukkan sudut b: ");
        b = input.nextInt();

        System.out.print("Masukkan sudut c: ");
        c = input.nextInt();

        if (a <= 0 || b <= 0 || c <= 0
                || a + b + c != 180) {
            System.out.println("Bukan segitiga");
        } else if (a == 90 || b == 90 || c == 90) {
            System.out.println("Segitiga siku siku");
        } else if (a == b && b == c) {
            System.out.println("Segitiga sama sisi");
        } else if (a == b || b == c || c == a) {
            System.out.println("Segitiga sama kaki");
        } else {
            System.out.println("Bukan segitiga");
        }
    }
}
