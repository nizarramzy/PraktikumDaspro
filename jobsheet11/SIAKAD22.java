package jobsheet11;
import java.util.Scanner;

public class SIAKAD22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numSiswa;
        int numMatkul;

        do {
            System.out.print("Masukkan jumlah siswa lebih dari 1: ");
            numSiswa = sc.nextInt();
        } while (numSiswa < 1);

        do {
            System.out.print("Masukkan jumlah mata kuliah lebih dari 1: ");
            numMatkul = sc.nextInt();
        } while (numMatkul < 1);

        
        int[][] nilai = new int[numSiswa][numMatkul];

        
        for (int i = 0; i < numSiswa; i++) {
            System.out.println("\nInput nilai untuk mahasiswa ke-" + (i + 1) + ":");
            double totalPerSiswa = 0;

            for (int j = 0; j < numMatkul; j++) {
                System.out.print("  Nilai mata kuliah " + (j + 1) + " : ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            
            double rataSiswa = totalPerSiswa / numMatkul;
            System.out.printf("  Nilai rata-rata mahasiswa ke-%d : %.2f%n", (i + 1), rataSiswa);
        }

        
        System.out.println("\n============================================");
        System.out.println("Rata-rata nilai setiap mata kuliah:");

        for (int j = 0; j < numMatkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < numSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }

            double rataMatkul = totalPerMatkul / numSiswa;
            System.out.printf("  Mata kuliah %d: %.2f%n", (j + 1), rataMatkul);
        }

        sc.close();
    }
}

