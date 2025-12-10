package jobsheet11;
import java.util.Scanner;

public class BioskopWithScanner22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int menu;

        do {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        String nama = sc.nextLine();

                        int baris, kolom;

                        while (true) {
                            System.out.print("Masukkan Baris (1-4): ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan Kolom (1-2): ");
                            kolom = sc.nextInt();
                            sc.nextLine();

                            
                            if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                                System.out.println("Nomor baris atau kolom tidak tersedia! Silakan masukkan ulang.\n");
                                continue;
                            }

                            
                            if (penonton[baris - 1][kolom - 1] != null) {
                                System.out.println("Kursi ini sudah ditempati");
                                System.out.println("Silakan pilih kursi lain.\n");
                            } else {
                                penonton[baris - 1][kolom - 1] = nama;
                                System.out.println("Data penonton berhasil disimpan!");
                                break;
                            }
                        }

                        System.out.print("Input penonton lainnya? (y/n): ");
                        String next = sc.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2:
                   System.out.println("\n=== DAFTAR PENONTON ===");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String tampil = (penonton[i][j] == null) ? "***" : penonton[i][j];
                            System.out.print(tampil + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid!");
            }
        } while (menu != 3);

        sc.close();
    }
}
