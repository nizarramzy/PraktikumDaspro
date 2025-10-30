package jobsheet8;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt();

        System.out.println();
        System.out.println("=== Input Penjualan Per Cabang ===");
        System.out.println();

        int totalPelanggan = 0;
        int totalItem = 0;

        for (int cab = 1; cab <= jumlahCabang; cab++) {
            System.out.println("--- Cabang " + cab + " ---");
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            int itemCabang = 0;

            for (int p = 1; p <= jumlahPelanggan; p++) {
                System.out.print("- Pelanggan " + p + " memesan berapa item? ");
                int item = sc.nextInt();
                itemCabang += item;
            }

            System.out.println("Cabang " + cab + ":");
            System.out.println("- Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("- Item terjual: " + itemCabang);
            System.out.println();

            
            totalPelanggan += jumlahPelanggan;
            totalItem += itemCabang;
        }

        
        System.out.println("Total seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelanggan + " orang");
        System.out.println("Item terjual: " + totalItem + " item");

        
    }
}
        
    
    

