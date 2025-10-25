package jobsheet7;
import java.util.Scanner;

public class TiketBioskop22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlahTiket, totalTiket = 0;
        double totalPenjualan = 0;
        final int hargaTiket = 50000;
        String lanjut;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid, Masukkan ulang");
                continue; 
            }

            
            if (jumlahTiket == 0) {
                break; 
            }

            double totalHarga = jumlahTiket * hargaTiket;

            
            if (jumlahTiket > 10) {
                totalHarga = totalHarga - (totalHarga * 0.15);
                System.out.println("selamat, Diskon 15% diterapkan");
            } else if (jumlahTiket > 4) {
                totalHarga = totalHarga - (totalHarga * 0.10);
                System.out.println("selamat, Diskon 10% diterapkan");
            }

            
            totalPenjualan += totalHarga;
            totalTiket += jumlahTiket;

            System.out.println("Total harga pembelian: Rp " + totalHarga);
            sc.nextLine(); 

            System.out.print("Apakah masih ada pelanggan lain? (y/n): ");
            lanjut = sc.nextLine();

            if (lanjut.equalsIgnoreCase("n")) {
                break;
            }

        } while (true);

        System.out.println("Penjualan Hari Ini =");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan: Rp " + totalPenjualan);
        

        sc.close();
    }
}

