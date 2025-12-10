package jobsheet8;
import java.util.Scanner;


public class NilaiKelompok22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int nilai;
        float totalNilai;
        float rataNilai;
        float rataTinggi = 0;
        int kelompokTinggi = 0;

        while (i<=6) {
            System.out.println("Kelompok " + i);
            totalNilai = 0;

            for (int j = 1; j <= 5; j++) {
                System.out.print(" Nilai dari kelompok penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + " nilai rata-rata " + rataNilai);

            if (rataNilai > rataTinggi) {
                rataTinggi = rataNilai;
                kelompokTinggi = i;
            }

            i++;
            System.out.println();
        }

        System.out.println("Kelompok dengan rata-rata nilai tertinggi adalah: Kelompok " + kelompokTinggi);
        System.out.println("Dengan rata-rata: " + rataTinggi);

        sc.close();
    }
}
