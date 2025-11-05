import java.util.Scanner;

public class asisten {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        double nilaiAkhir, rataRata;
        Float nilai;

        System.out.println("masukkan nilai akhir Matkul");
        System.out.println("masukan nilai Struktur Data= ");
        Float nSD = ns.nextFloat();
        System.out.println("masukan nilai Pemrograman Berorientasi Objek= ");
        Float nPBO = ns.nextFloat();
        System.out.println("masukan nilai Basis Data= ");
        Float nBd = ns.nextFloat();
        System.out.println("masukan nilai Algoritma dan Pemrograman");
        Float nAP = ns.nextFloat();
        System.out.println("masukan nilai Rekayasa Perangkat Lunak");
        Float nRPL = ns.nextFloat();

        rataRata = (nSD + nPBO+ nBd + nAP + nRPL) / 5;
        System.out.println("Rata-rata anda= " +rataRata);
    }
}