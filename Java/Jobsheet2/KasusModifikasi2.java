import java.util.Scanner;
public class KasusModifikasi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan lebar tanah : ");
        double lebar = input.nextDouble();
        System.out.println("Masukkan panjang tanah : ");
        double panjang = input.nextDouble();
        System.out.println("Masukkan diameter kolam ikan : ");
        double diameterKolam = input.nextDouble();
        System.out.println("Masukkan sisi taman bunga : ");
        double sisiTaman = input.nextDouble();

        double luasTanahh = lebar * panjang;
        double jariJari = diameterKolam / 2;
        double luasKolam = Math.PI * jariJari * jariJari;
        double luasTaman = sisiTaman * sisiTaman;
        double luasTidakDigunakan = luasTanahh - luasKolam - luasTaman;

        System.out.println("Luas Tanah : " + luasTanahh + " m2");
        System.out.println("Luas Kolam Ikan : " + luasKolam + " m2");
        System.out.println("Luas Taman Bunga : " + luasTaman + "m2");
        System.out.println("Luas Tidak Digunakan : " +  luasTidakDigunakan + "m2");

        input.close();
    }
}
