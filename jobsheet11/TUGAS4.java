package jobsheet11;

import java.util.Scanner;

public class TUGAS4 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] survei = new int[10][6];

        System.out.println("=== INPUT DATA SURVEI ===");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                System.out.print("  Pertanyaan " + (j + 1) + ": ");
                survei[i][j] = input.nextInt();
            }
        }
        
        System.out.println("\n=== RATA-RATA KESELURUHAN ===");
        int i = 0;

        while (i < survei.length) {
            System.out.print("Responden " + (i + 1) + ": ");
            int j = 0;
            while (j < survei[i].length) {
                System.out.print("Soal " + (j + 1) + " : " + survei[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
        input.close();
    }
}

