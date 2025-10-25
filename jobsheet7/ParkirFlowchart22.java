package jobsheet7;

import java.util.Scanner;

public class ParkirFlowchart22 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int kodeKendaraan;    
    int lamaJam;
    int totalBayar = 0;
    int tarifMobil = 3000;
    int tarifMotor = 2000;
    int tarifMaksimal = 12500;

    while (true) {
        System.out.print("Masukkan kode kendaraan (1=Mobil, 2=Motor, 0=Keluar): ");
        kodeKendaraan = input.nextInt();

        if (kodeKendaraan == 0) {
            break; 
        }

        if (kodeKendaraan == 1 || kodeKendaraan == 2) {
            System.out.print("Masukkan lama parkir (jam): ");
            lamaJam = input.nextInt();

            if (lamaJam > 5) {
                totalBayar += tarifMaksimal;
            } else {
                if (kodeKendaraan == 1) {
                    totalBayar += lamaJam * tarifMobil;
                } else {
                    totalBayar += lamaJam * tarifMotor;
                }
            }
        } else {
            System.out.println("Kode kendaraan tidak valid. Silakan coba lagi.");
            
        }
    }

    System.out.println("=== TOTAL PENDAPATAN PARKIR HARI INI ===");
    System.out.println("Jumlah total uang parkir: Rp " + totalBayar);
    
    
    }
}
    

