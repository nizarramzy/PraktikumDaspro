package jobsheet12;
import java.util.Scanner;

public class NilaiMahasiswa22 {
        
    static void isianArray(int[] nilai) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = sc.nextInt();
        }
    }

    
    static void tampilArray(int[] nilai) {
        System.out.println("\nDaftar nilai:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa " + (i+1) + ": " + nilai[i]);
        }
    }

   
    static int hitTot(int[] nilai) {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = sc.nextInt();

        int[] nilai = new int[N];

        isianArray(nilai);
        tampilArray(nilai);

        int total = hitTot(nilai);
        System.out.println("\nTotal nilai: " + total);
    }
}

    

