package jobsheet9;
import java.util.Scanner;

public class ArrayRataNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double totalLulus = 0, totalTidakLulus = 0;
        int hitungLulus = 0, hitungTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                hitungLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                hitungTidakLulus++;
            }
        }

        if (hitungLulus > 0) {
            System.out.println("Rata-rata nilai lulus = " + (totalLulus / hitungLulus));
        } else {
            System.out.println("Tidak ada mahasiswa yang lulus.");
        }

        if (hitungTidakLulus > 0) {
            System.out.println("Rata-rata nilai tidak lulus = " + (totalTidakLulus / hitungTidakLulus));
        } else {
            System.out.println("Semua mahasiswa lulus.");
        }
    }
}
