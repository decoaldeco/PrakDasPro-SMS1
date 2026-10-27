public class StudiKasus1 {
    public static void main(String[] args) {
        double gajiPokok = 5000000;
        int jumlahAnak = 4;
        double tunjanganPerAnak = 100000;
        double persenPensiun = 0.10;

        double tunjanganAnak = jumlahAnak * tunjanganPerAnak;
        double potonganPesiun = gajiPokok * persenPensiun;
        double gajiBersih = gajiPokok + tunjanganAnak - potonganPesiun;

        System.out.println("Gaji Pokok : Rp" + gajiPokok);
        System.out.println("Jumlah Anak : " + jumlahAnak);
        System.out.println("Tunjangan Anak : Rp" + tunjanganAnak);
        System.out.println("Potongan Pesiun : Rp" + potonganPesiun);
        System.out.println("Gaji Bersih Rp" + gajiBersih);
    }
}
