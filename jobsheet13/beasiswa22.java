import java.util.Scanner;

public class beasiswa22 {
    static final int MAX = 100, B_PENGHASILAN = 2000000;
    static final int NAMA = 0, NIM = 1, IPK = 2, JENIS = 3, PENG = 4;
    static String[][] data = new String[MAX][5];
    static int jml = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            tampilMenu();
            while (true) {
                System.out.print("Pilih menu (1-5): ");
                if (sc.hasNextInt()) {
                    menu = sc.nextInt(); sc.nextLine();
                    if (menu >= 1 && menu <= 5) break;
                    System.out.println("Pilihan harus antara 1 sampai 5.");
                } else {
                    System.out.println("Input harus berupa angka.");
                    sc.next();
                }
            }
            switch (menu) {
                case 1: tambah(sc); break;
                case 2: tampil(); break;
                case 3: cari(sc); break;
                case 4: rata(); break;
                case 5: break;
            }
        } while (menu != 5);
        sc.close();
    }

    static void tampilMenu() {
        System.out.println("=== Sistem Pendaftaran Beasiswa ===");
        System.out.println("1. Tambah Data Pendaftar Beasiswa");
        System.out.println("2. Tampilkan Semua Pendaftar");
        System.out.println("3. Cari Pendaftar berdasarkan Jenis Beasiswa");
        System.out.println("4. Hitung Rata-rata IPK per Jenis Beasiswa");
        System.out.println("5. Keluar");
    }

    static void tambah(Scanner sc) {
        if (jml >= MAX) { System.out.println("Kapasitas pendaftar penuh."); return; }

        String nama;
        while (true) {
            System.out.print("Nama Mahasiswa: ");
            nama = sc.nextLine().trim();
            if (!nama.isEmpty()) break;
            System.out.println("Nama tidak boleh kosong.");
        }

        String nim;
        while (true) {
            System.out.print("NIM: ");
            nim = sc.nextLine().trim();
            if (!nim.isEmpty()) break;
            System.out.println("NIM tidak boleh kosong.");
        }

        double ipk;
        while (true) {
            System.out.print("IPK terakhir: ");
            if (sc.hasNextDouble()) {
                ipk = sc.nextDouble(); sc.nextLine();
                if (ipk >= 0.0 && ipk <= 4.0) break;
                System.out.println("IPK harus antara 0.0 sampai 4.0.");
            } else {
                System.out.println("Input harus berupa angka desimal.");
                sc.next();
            }
        }

        String jenis;
        while (true) {
            System.out.print("Jenis Beasiswa (Reguler/Unggulan/Riset): ");
            jenis = sc.nextLine().trim();
            if (jenis.equalsIgnoreCase("Reguler")) { jenis = "Reguler"; break; }
            if (jenis.equalsIgnoreCase("Unggulan")) { jenis = "Unggulan"; break; }
            if (jenis.equalsIgnoreCase("Riset")) { jenis = "Riset"; break; }
            System.out.println("Jenis beasiswa harus Reguler, Unggulan, atau Riset.");
        }

        long peng;
        while (true) {
            System.out.print("Penghasilan orang tua (maksimal 2000000): ");
            if (sc.hasNextLong()) {
                peng = sc.nextLong(); sc.nextLine();
                if (peng >= 0) break;
                System.out.println("Penghasilan tidak boleh negatif.");
            } else {
                System.out.println("Input harus berupa angka.");
                sc.next();
            }
        }

        if (peng > B_PENGHASILAN) {
            System.out.println("Pendaftaran dibatalkan karena penghasilan melebihi batas maksimal.");
            return;
        }

        data[jml][NAMA] = nama;
        data[jml][NIM] = nim;
        data[jml][IPK] = String.valueOf(ipk);
        data[jml][JENIS] = jenis;
        data[jml][PENG] = String.valueOf(peng);
        jml++;
        System.out.println("Pendaftar berhasil disimpan. Total pendaftar: " + jml);
    }

    static void tampil() {
        if (jml == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }
        for (int i = 0; i < jml; i++) {
            System.out.println("Pendaftar ke-" + (i + 1));
            System.out.println("Nama Mahasiswa: " + data[i][NAMA]);
            System.out.println("NIM: " + data[i][NIM]);
            System.out.println("IPK terakhir: " + data[i][IPK]);
            System.out.println("Jenis Beasiswa: " + data[i][JENIS]);
            System.out.println("Penghasilan orang tua: " + data[i][PENG]);
            System.out.println("----------------------------------");
        }
    }

    static void cari(Scanner sc) {
        String jenisDicari;
        while (true) {
            System.out.print("Jenis Beasiswa (Reguler/Unggulan/Riset): ");
            jenisDicari = sc.nextLine().trim();
            if (jenisDicari.equalsIgnoreCase("Reguler") ||
                jenisDicari.equalsIgnoreCase("Unggulan") ||
                jenisDicari.equalsIgnoreCase("Riset")) break;
            System.out.println("Jenis beasiswa harus Reguler, Unggulan, atau Riset.");
        }
        int ketemu = 0;
        for (int i = 0; i < jml; i++) {
            if (data[i][JENIS].equalsIgnoreCase(jenisDicari)) {
                if (ketemu == 0) {
                    System.out.println("Daftar pendaftar jenis " + jenisDicari + ":");
                }
                System.out.println("- " + data[i][NAMA] + " (" + data[i][NIM] + "), IPK: " + data[i][IPK]);
                ketemu++;
            }
        }
        if (ketemu == 0) {
            System.out.println("Tidak ada pendaftar untuk jenis beasiswa " + jenisDicari + ".");
        }
    }

    static void rata() {
        String[] jenisList = {"Reguler", "Unggulan", "Riset"};
        for (int j = 0; j < jenisList.length; j++) {      
            String jenis = jenisList[j];
            double total = 0; int hitung = 0;
            for (int i = 0; i < jml; i++) {
                if (data[i][JENIS].equalsIgnoreCase(jenis)) {
                    total += Double.parseDouble(data[i][IPK]);
                    hitung++;
                }
            }
            if (hitung > 0) {
                double r = total / hitung;
                System.out.println(jenis + " : rata-rata IPK = " + String.format("%.2f", r));
            } else {
                System.out.println(jenis + " : tidak ada pendaftar.");
            }
        }
    }
}
