package jobsheet9;
import java.util.Scanner;

public class ProgramNilaiMahasiswa22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya mahasiswa: ");
        int jumlahMhs = sc.nextInt();
        while (jumlahMhs <= 0) {
            System.out.print("Masukkan Jumlah Mahasiswa lebihh dari 0 ");
            jumlahMhs = sc.nextInt();
        }

        int[] nilaiMhs = new int[jumlahMhs];

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        System.out.println("\nDaftar nilai mahasiswa:");
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("Mahasiswa " + (i + 1) + ": " + nilaiMhs[i]);
        }

        int totalNilai = 0;
        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];

        for (int nilai : nilaiMhs) {
            totalNilai += nilai;
            if (nilai > nilaiTertinggi) nilaiTertinggi = nilai;
            if (nilai < nilaiTerendah) nilaiTerendah = nilai;
        }

        double rataRata = (double) totalNilai / jumlahMhs;

        System.out.printf("\nTotal nilai: %d%n", totalNilai);
        System.out.printf("Nilai rata-rata: %.2f%n", rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);

        sc.close();
    }
}

