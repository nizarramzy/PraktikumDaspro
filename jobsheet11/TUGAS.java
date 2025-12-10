package jobsheet11;
import java.util.Scanner;

public class TUGAS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] survei = new int[10][6];
        
        System.out.println("=== INPUT DATA SURVEI ===");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                System.out.print("  Pertanyaan (1-5) " + (j + 1) + ": ");
                survei[i][j] = input.nextInt();
            }
        }
        
        
        int i = 0;
        
        
        while (i < survei.length) {
            int j = 0;
            
            System.out.print("Responden " + (i + 1) + ": ");
            
            
            while (j < survei[i].length) {
                System.out.print(survei[i][j]);
                if (j < survei[i].length - 1) {
                    System.out.print(" - ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
        
        
        input.close();
    }
}

