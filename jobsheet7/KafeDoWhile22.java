package jobsheet7;
import java.util.Scanner;

public class KafeDoWhile22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;

        
        do {
            
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk berhenti): ");
            namaPelanggan = sc.nextLine();

            
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }

            
            System.out.print("Masukkan jumlah kopi: ");
            kopi = sc.nextInt();

            System.out.print("Masukkan jumlah teh: ");
            teh = sc.nextInt();

            System.out.print("Masukkan jumlah roti: ");
            roti = sc.nextInt();

            
            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);

           
            System.out.println("Total harga pembelian atas nama " + namaPelanggan + " adalah Rp " + totalHarga);

            
            sc.nextLine();

        } while (true);

        System.out.println("Semua transaksi selesai");

        sc.close();

    }
}
    

