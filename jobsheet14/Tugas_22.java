package jobsheet14;

import java.util.Scanner;

public class Tugas_22 {
        
    static int totalIteratif(int[] data) {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        return total;
    }

    
    static int totalRekursif(int[] data, int index) {
        if (index == data.length) {
            return 0;
        }
        return data[index] + totalRekursif(data, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();

        int[] angka = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }
        
        int total = totalIteratif(angka);

        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + total);
    }
}
    

