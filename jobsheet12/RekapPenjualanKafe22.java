package jobsheet12;

import java.util.Scanner;

public class RekapPenjualanKafe22 {
    static Scanner sc = new Scanner(System.in);

    
    static void inputData(int[][] jual, String[] menu) {
        for (int i = 0; i < jual.length; i++) {
            System.out.println("\nInput penjualan untuk menu: " + menu[i]);
            for (int j = 0; j < jual[0].length; j++) {
                System.out.print("Hari ke-" + (j+1) + ": ");
                jual[i][j] = sc.nextInt();
            }
        }
    }

    
    static void tampilData(int[][] jual, String[] menu) {
        System.out.println("\n--- DATA PENJUALAN ---");
        for (int i = 0; i < jual.length; i++) {
            System.out.print(menu[i] + " : ");
            for (int j = 0; j < jual[0].length; j++) {
                System.out.print(jual[i][j] + " ");
            }
            System.out.println();
        }
    }

    
    static void menuTertinggi(int[][] jual, String[] menu) {
        int max = -1;
        String menuMax = "";

        for (int i = 0; i < jual.length; i++) {
            int total = 0;
            for (int j = 0; j < jual[0].length; j++) {
                total += jual[i][j];
            }
            if (total > max) {
                max = total;
                menuMax = menu[i];
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi: " + menuMax + " (" + max + ")");
    }

    
    static void rataRata(int[][] jual, String[] menu) {
        System.out.println("\n--- Rata-rata Penjualan ---");
        for (int i = 0; i < jual.length; i++) {
            int total = 0;
            for (int j = 0; j < jual[0].length; j++) {
                total += jual[i][j];
            }
            double rata = total / (double) jual[0].length;
            System.out.println(menu[i] + " : " + rata);
        }
    }

    public static void main(String[] args) {

        String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};

        int[][] jual = new int[5][7];

        inputData(jual, menu);
        tampilData(jual, menu);
        menuTertinggi(jual, menu);
        rataRata(jual, menu);
    }
}
    

