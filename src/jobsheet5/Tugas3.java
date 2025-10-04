package jobsheet5;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jenis pengguna: ");
        String pengguna = sc.nextLine().trim();

        if (pengguna.equalsIgnoreCase("dosen")) {
            System.out.println("Akses wifi diberikan (Dosen)");
        } else if (pengguna.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS: ");
            int sks = sc.nextInt();

            if (sks >= 12) {
                System.out.println("Akses wifi diberikan (Mahasiswa)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak");
        }

        sc.close();
    }
}
