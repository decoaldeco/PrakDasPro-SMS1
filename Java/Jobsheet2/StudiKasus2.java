public class StudiKasus2 {
    public static void main(String[] args) {
        double lebar = 30;
        double panjang = 100;
        double diameterKolam = 5;
        double sisiTaman = 2;

        double luasTanahh = lebar * panjang;

        double jariJari = diameterKolam / 2;
        double luasKolam = Math.PI * jariJari * jariJari;

        double luasTaman = sisiTaman* sisiTaman;

        double luasTidakDigunakan = luasTanahh - luasKolam - luasTaman;

        System.out.println("Luas Tanah : " + luasTanahh + " m2");
        System.out.println("Luas Kolam Ikan : " + luasKolam + " m2");
        System.out.println("Luas Taman Bunga : " + luasTaman);
        System.out.println("Luas Tidak Digunakan : " + luasTidakDigunakan);

    }
}
