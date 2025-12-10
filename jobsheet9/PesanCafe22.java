package jobsheet9;
import java.util.Scanner;

public class PesanCafe22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        while (jumlahPesanan <= 0) {
            System.out.print("Masukkan jumlah pesanan lebih dari 0 ");
            jumlahPesanan = sc.nextInt();
        }
        sc.nextLine();

        String[] namaMenu = new String[jumlahPesanan];
        double[] hargaMenu = new double[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("Pesanan ke-" + (i + 1));
            System.out.print("  Nama makanan/minuman: ");
            namaMenu[i] = sc.nextLine();
            System.out.print("  Harga: ");
            hargaMenu[i] = sc.nextDouble();
            sc.nextLine();
        }

        double totalBayar = 0;
        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.printf("%d. %s - Rp%.2f%n", (i + 1), namaMenu[i], hargaMenu[i]);
            totalBayar += hargaMenu[i];
        }
        System.out.printf("\nTotal biaya: Rp%.2f%n", totalBayar);

        sc.close();
    }
}