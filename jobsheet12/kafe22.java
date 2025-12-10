package jobsheet12;
import java.util.Scanner;

public class kafe22 {
    static Scanner sc = new Scanner(System.in);

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam – Rp 15,000");
        System.out.println("2. Cappuccino – Rp 20,000");
        System.out.println("3. Latte – Rp 22,000");
        System.out.println("4. Teh Tarik – Rp 12,000");
        System.out.println("5. Roti Bakar – Rp 10,000");
        System.out.println("6. Mie Goreng – Rp 18,000");
        System.out.println("=====================================");

        if (kodePromo == null) {
            System.out.println("Kode promo: (tidak ada)");
        } else if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo: DISKON50 -> Anda mendapat diskon 50%!");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo: DISKON30 -> Anda mendapat diskon 30%!");
        } else {
            System.out.println("Kode promo: INVALID");
        }

        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    
    public static int hitungSubtotal(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        if (pilihanMenu < 1 || pilihanMenu > hargaItems.length) {
            return 0; 
        }
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }

    
    public static int terapkanPromo(int totalSebelumPromo, String kodePromo) {
        if (kodePromo == null || kodePromo.trim().isEmpty()) {
            System.out.println("Kode promo: (tidak ada)");
            return totalSebelumPromo;
        }
        switch (kodePromo) {
            case "DISKON50":
                int pot50 = totalSebelumPromo / 2; 
                System.out.println("Kode promo: DISKON50 -> Diskon 50% (potongan Rp" + pot50 + ")");
                return totalSebelumPromo - pot50;
            case "DISKON30":
                int pot30 = (int) Math.round(totalSebelumPromo * 0.30);
                System.out.println("Kode promo: DISKON30 -> Diskon 30% (potongan Rp" + pot30 + ")");
                return totalSebelumPromo - pot30;
            default:
                System.out.println("Kode promo: INVALID");
                return totalSebelumPromo; 
        }
    }

    public static void main(String[] args) {

        System.out.println("Berapa jenis menu yang ingin Anda pesan?");
        System.out.print("Masukkan jumlah jenis menu: ");
        int jenis = 1;
        try {
            jenis = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Input tidak valid. Default 1 jenis.");
            sc.nextLine();
        }

        int totalKeseluruhan = 0;
        for (int i = 1; i <= jenis; i++) {
            System.out.print("\nMasukkan nomor menu ke-" + i + " (1-6): ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item untuk menu ke-" + i + ": ");
            int banyakItem = sc.nextInt();

            int subtotal = hitungSubtotal(pilihanMenu, banyakItem);
            System.out.println("Subtotal menu ke-" + i + " = Rp" + subtotal);
            totalKeseluruhan += subtotal;
        }

        sc.nextLine(); 
        System.out.print("\nMasukkan kode promo (ketik ENTER jika tidak ada): ");
        String kodePromoInput = sc.nextLine().trim();
        if (kodePromoInput.isEmpty()) kodePromoInput = null;

        System.out.println("\nTotal sebelum promo: Rp" + totalKeseluruhan);
        int totalSetelahPromo = terapkanPromo(totalKeseluruhan, kodePromoInput);
        System.out.println("Total yang harus dibayar: Rp" + totalSetelahPromo);
    }
}
