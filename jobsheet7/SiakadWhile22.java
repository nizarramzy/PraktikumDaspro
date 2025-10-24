package jobsheet7;
import java.util.Scanner;

public class SiakadWhile22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai;
        int jml;      
        int i = 0;

        System.out.println("Masukkan Jumlah Mahasiswa: ");
        jml = sc.nextInt();

        while (i < jml) {
           
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();

        
            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid Masukkan lagi nilai yang valid!");
               
                continue;
            }

       
            if (nilai > 80 && nilai <= 100) {
                System.out.println("Kategori: A");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Kategori: B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Kategori: B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Kategori: C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Kategori: C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Kategori: D");
            } else { // nilai <= 39
                System.out.println("Kategori: E");
            }

        
            i++;
        }

        sc.close();
    }
}

