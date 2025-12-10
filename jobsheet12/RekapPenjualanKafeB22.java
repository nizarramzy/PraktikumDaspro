package jobsheet12;

import java.util.Scanner;

public class RekapPenjualanKafeB22 {
    static Scanner sc = new Scanner(System.in);

    static void input(int[][] jual, String[] menu) {
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Input penjualan untuk: " + menu[i]);
            for (int j = 0; j < jual[0].length; j++) {
                System.out.print("Hari ke-" + (j+1) + " : ");
                jual[i][j] = sc.nextInt();
            }
        }
    }

    static void tampil(int[][] jual, String[] menu) {
        System.out.println("\nDATA PENJUALAN:");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < jual[0].length; j++) {
                System.out.print(jual[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void menuMax(int[][] jual, String[] menu) {
        int max = -1;
        String pilih = "";
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < jual[0].length; j++) total += jual[i][j];
            if (total > max) {
                max = total;
                pilih = menu[i];
            }
        }
        System.out.println("\nMenu tertinggi: " + pilih + " (" + max + ")");
    }

    static void rata2(int[][] jual, String[] menu) {
        System.out.println("\nRATA-RATA PENJUALAN:");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < jual[0].length; j++) total += jual[i][j];
            double r = total / (double) jual[0].length;
            System.out.println(menu[i] + " : " + r);
        }
    }

    public static void main(String[] args) {

        System.out.print("Jumlah menu: ");
        int m = sc.nextInt();
        System.out.print("Jumlah hari: ");
        int h = sc.nextInt();

        sc.nextLine(); 

        String[] menu = new String[m];
        for(int i = 0; i < m; i++) {
            System.out.print("Nama menu ke-" + (i+1) + ": ");
            menu[i] = sc.nextLine();
        }

        int[][] jual = new int[m][h];

        input(jual, menu);
        tampil(jual, menu);
        menuMax(jual, menu);
        rata2(jual, menu);
    }
}
    

