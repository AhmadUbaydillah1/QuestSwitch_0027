import java.util.Scanner;

public class asisten {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        double nilaiAkhir, rataRata;
        Float nilai;

        System.out.println("masukkan nilai akhir Matkul");
        System.out.println("masukan nilai Struktur Data= ");
        Float nSD = ns.nextFloat();
        Float rnSD = nSD * 4 /100;

        System.out.println("masukan nilai Pemrograman Berorientasi Objek= ");
        Float nPBO = ns.nextFloat();
        Float rnPBO = nPBO * 4 /100;

        System.out.println("masukan nilai Basis Data= ");
        Float nBD = ns.nextFloat();
        Float rnBD = nBD* 4 /100;

        System.out.println("masukan nilai Algoritma dan Pemrograman");
        Float nAP = ns.nextFloat();
        Float rnAP = nAP * 4 /100;

        System.out.println("masukan nilai Rekayasa Perangkat Lunak");
        Float nRPL = ns.nextFloat();
        Float rnRPL = nRPL * 4 /100;

        rataRata = (rnSD + rnPBO+ rnBD + rnAP + nRPL) * 4 / 100;
        System.out.print("Rata-rata anda= " +rataRata);

    if (rataRata >= 3.75 && rataRata <=4.00) {
        System.out.println("A (Sangat baik)");
    } if (rataRata >3.50 && rataRata <3.74){
        System.out.println("B (Baik Sekali)");
    } if (rataRata >3.00 && rataRata <3.49){
        System.out.println("B (Baik)");
    } if (rataRata >2.50 && rataRata <2.99){
        System.out.println("BC (Cukup)");
    } if (rataRata <2.50){
        System.out.println("C (Kurang)");
    } else {
        System.out.println("Invalid");
    }


    }

}