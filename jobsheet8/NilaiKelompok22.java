package jobsheet8;
import java.util.Scanner;

public class NilaiKelompok22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int nilai;
        float totalNilai;
        float rataNilai;
        while (i<=6) {
            System.out.println("kelompok " + i);
            totalNilai=0;
        

            
            for (int j = 1; j <= 5; j++) {
                System.out.print(" Nilai dari kelompok penilai " +j+ ": ");
                nilai=sc.nextInt();
                totalNilai+=nilai;
        }
        rataNilai = totalNilai/5;
        System.out.println("kelompok "+i+ " nilai rata rata " + rataNilai);
        i++;

    }
}
    
}
