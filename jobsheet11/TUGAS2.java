package jobsheet11;
import java.util.Scanner;

public class TUGAS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rataPert, total;
        int[][] survei = new int[10][6];
             
        System.out.println("=== INPUT DATA SURVEI ===");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                System.out.print("  Pertanyaan " + (j + 1) + ": ");
                survei[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\n=== RATA-RATA SETIAP PERTANYAAN ===");
             
        int i = 0; 
        
        while (i < survei[0].length) { 
            total = 0;
            int j = 0;  
            while (j < survei.length) {
                total += survei[j][i];
                j++;
            }
            rataPert = total / 10.0;
            System.out.println("Rata rata pertanyaan " + (i + 1) + " = " + rataPert);
            i++;
        }
        sc.close();
    }
    
}
