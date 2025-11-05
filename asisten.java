import java.util.Scanner;

public class asisten {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        double rataRata, nSD, rnSD, nPBO, rnPBO, nBD, rnBD, nAP, rnAP, nRPL, rnRPL;
        String predikat;

        System.out.println("Masukkan nilai akhir Mata Kuliah anda!");
        System.out.println("masukan nilai Struktur Data= ");
            nSD = ns.nextDouble();
            rnSD = nSD * 4 /100;

        System.out.println("masukan nilai Pemrograman Berorientasi Objek= ");
            nPBO = ns.nextDouble();
            rnPBO = nPBO * 4 /100;

        System.out.println("masukan nilai Basis Data= ");
            nBD = ns.nextDouble();
            rnBD = nBD* 4 /100;

        System.out.println("masukan nilai Algoritma dan Pemrograman");
            nAP = ns.nextDouble();
            rnAP = nAP * 4 /100;

        System.out.println("masukan nilai Rekayasa Perangkat Lunak");
            nRPL = ns.nextDouble();
            rnRPL = nRPL * 4 /100;

        rataRata = (rnSD + rnPBO+ rnBD + rnAP + rnRPL) / 5;
        System.out.print("Rata-rata anda= " +rataRata);

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
                    System.out.println("rata-rata anda: " +rataRata);
                    if (rataRata >3.0) {
                        System.out.println("Anda Eligible dan dianyatakan menjadi Asisten Dosen");
                    } else{
                        System.out.println("Anda tidak Eligible dan Tidak dinyatakan menjadi Asisten dosen");
                    }
                    break;
                case 2:  
                    System.out.println("rata-rata anda" +rataRata);
                    if (rataRata >3.0) {
                        System.out.println("Anda Eligible dan dianyatakan menjadi Asisten Dosen");
                    } else{
                        System.out.println("Anda tidak Eligible dan Tidak dinyatakan menjadi Asisten dosen");
                    }
                    break;
                case 3:
                    System.out.println("rata-rata anda" +rataRata);
                    if (rataRata >3.0) {
                        System.out.println("Anda Eligible dan dianyatakan menjadi Asisten Dosen");
                    } else{
                        System.out.println("Anda tidak Eligible dan Tidak dinyatakan menjadi Asisten dosen");
                    }
                    break;
                case 4:
                    System.out.println("rata-rata anda" +rataRata);
                    if (rataRata >3.0) {
                        System.out.println("Anda Eligible dan dianyatakan menjadi Asisten Dosen");
                    } else{
                        System.out.println("Anda tidak Eligible dan Tidak dinyatakan menjadi Asisten dosen");
                    }
                    break;
                case 5:
                    System.out.println("rata-rata anda" +rataRata);
                    if (rataRata >3.0) {
                        System.out.println("Anda Eligible dan dianyatakan menjadi Asisten Dosen");
                    } else{
                        System.out.println("Anda tidak Eligible dan Tidak dinyatakan menjadi Asisten dosen");
                    }
                    break;
            
                default:
                    break;
            }

        } else {
            System.out.println("Anda belum memenuhi syarat menjadi asisten dosen");   
        }

    }

}