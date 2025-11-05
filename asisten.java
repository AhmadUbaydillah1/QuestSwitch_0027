import java.util.Scanner;

public class asisten {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        double nilaiAkhir, rataRata;
        Float nilai;

        System.out.println("masukkan nilai akhir Matkul");
        System.out.println("masukan nilai Struktur Data= ");
        double nSD = ns.nextDouble();
        double rnSD = nSD * 4 /100;

        System.out.println("masukan nilai Pemrograman Berorientasi Objek= ");
        double nPBO = ns.nextDouble();
        double rnPBO = nPBO * 4 /100;

        System.out.println("masukan nilai Basis Data= ");
        double nBD = ns.nextDouble();
        double rnBD = nBD* 4 /100;

        System.out.println("masukan nilai Algoritma dan Pemrograman");
        double nAP = ns.nextDouble();
        double rnAP = nAP * 4 /100;

        System.out.println("masukan nilai Rekayasa Perangkat Lunak");
        double nRPL = ns.nextDouble();
        double rnRPL = nRPL * 4 /100;

        rataRata = (rnSD + rnPBO+ rnBD + rnAP + rnRPL) / 5;
        System.out.print("Rata-rata anda= " +rataRata);

        String predikat;
         if (rataRata >= 3.75 && rataRata <=4.00) {
            predikat = "A(Sangat Baik)";
            System.out.println(predikat);
        } else if (rataRata >3.50 && rataRata <3.74){
            predikat = "AB(Baik Sekali)";
            System.out.println(predikat);
        } else if (rataRata >3.00 && rataRata <3.49){
            predikat = "B(Baik)";
            System.out.println(predikat);
        } else if (rataRata >2.50 && rataRata <2.99){
            predikat = "BC(Cukup)";
            System.out.println(predikat);
        } else if (rataRata <2.50){
            predikat = "C(Kurang)";
            System.out.println(predikat);
        } else {
            predikat = "eror";
            System.out.println(predikat);
        }
        
        if (predikat.equals("A(Sangat Baik)")|| predikat.equals("AB(Baik Sekali)")){
            System.out.println("==MATA KULIAH YANG DAPAT DIAJUKAN==");
            System.out.println("1. Struktur Data");
            System.out.println("2. Pemrograman Berorientasi Data");
            System.out.println("3. Basis Data");
            System.out.println("4. Algoritma dan Pemrograman");
            System.out.println("5. Rekayasa Perangkat Lunak");
            int menu = ns.nextInt();
            ns.nextLine();

            switch (menu) {
                case 1:
                    System.out.println(rataRata);
                    if (rataRata >3.0) {
                        System.out.println("Anda Eligible dan dianyatakan menjadi Asisten Dosen");
                    } else{
                        System.out.println("Anda tidak Eligible dan Tidak dinyatakan menjadi Asisten dosen");
                    }
                    break;
                case 2:    
            
                default:
                    break;
            }

        } else {
            System.out.println("Anda belum memenuhi syarat menjadi asisten dosen");   
        }

    }

}