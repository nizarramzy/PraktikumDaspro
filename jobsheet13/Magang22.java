import java.util.Scanner;

public class Magang22 {

    static final int MAX_PENDAFTAR = 100;
    static String[][] dataPendaftar = new String[MAX_PENDAFTAR][6];
    static int jumlahPendaftar = 0;

    static Scanner sc = new Scanner(System.in);

    static void tampilkanMenu() {
        System.out.println("=== Sistem Pendaftaran Magang Mahasiswa ===");
        System.out.println("1. Tambah Data Magang");
        System.out.println("2. Tampilkan Semu aPendaftar Magang");
        System.out.println("3. Cari Pendaftar berdasarkan Program Studi");
        System.out.println("4. Hitung Jumlah Pendaftar untuk Setiap Status");
        System.out.println("5. Keluar");
    }

    static int bacaInteger() {
        while (true) {
            if (sc.hasNextInt()) {
                int angka = sc.nextInt();
                sc.nextLine();  
                return angka;
            } else {
                System.out.print("Input harus berupa angka. Silakan ulangi: ");
                sc.next(); 
            }
        }
    }

    static void tambahDataMagang() {
        if (jumlahPendaftar >= MAX_PENDAFTAR) {
            System.out.println("Data pendaftar sudah penuh.");
            return;
        }
        System.out.print("Nama Mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Program Studi: ");
        String prodi = sc.nextLine();
        System.out.print("Perusahaan Tujuan Magang: ");
        String perusahaan = sc.nextLine();

        int semester;
        while (true) {
            System.out.print("Semester pengambilan magang (6 atau 7): ");
            semester = bacaInteger();
            if (semester == 6 || semester == 7) {
                break;
            } else {
                System.out.println("Semester hanya boleh 6 atau 7. Silakan ulangi.");
            }
        }

        String status;
        while (true) {
            System.out.print("Status magang (Diterima/Menunggu/Ditolak): ");
            status = sc.nextLine().trim();

            if (status.equalsIgnoreCase("Diterima")) {
                status = "Diterima";
                break;
            } else if (status.equalsIgnoreCase("Menunggu")) {
                status = "Menunggu";
                break;
            } else if (status.equalsIgnoreCase("Ditolak")) {
                status = "Ditolak";
                break;
            } else {
                System.out.println("Status hanya boleh Diterima, Menunggu, atau Ditolak. Silakan ulangi.");
            }
        }

        dataPendaftar[jumlahPendaftar][0] = nama;
        dataPendaftar[jumlahPendaftar][1] = nim;
        dataPendaftar[jumlahPendaftar][2] = prodi;
        dataPendaftar[jumlahPendaftar][3] = perusahaan;
        dataPendaftar[jumlahPendaftar][4] = String.valueOf(semester);
        dataPendaftar[jumlahPendaftar][5] = status;

        jumlahPendaftar++;

        System.out.println("Data pendaftaran magang berhasil ditambahkan. Total pendaftar: " + jumlahPendaftar);
    }

    static void tampilkanSemuaPendaftar() {
        if (jumlahPendaftar == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }

        System.out.println("Daftar Seluruh Pendaftar Magang");
        System.out.println("No\tNama\tNIM\tProgram Studi\tPerusahaan\tSemester\tStatus");

        for (int i = 0; i < jumlahPendaftar; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < 6; j++) {
                System.out.print(dataPendaftar[i][j]);
                if (j < 5) {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    static void cariPendaftarByProdi() {
        if (jumlahPendaftar == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }
        System.out.print("Masukkan Program Studi: ");
        String prodiCari = sc.nextLine().trim();

        System.out.println("No\tNama\tNIM\tProgram Studi\tPerusahaan\tSemester\tStatus");
        boolean ada = false;

        for (int i = 0; i < jumlahPendaftar; i++) {
            if (dataPendaftar[i][2].equalsIgnoreCase(prodiCari)) {
                ada = true;
                System.out.print((i + 1) + "\t");
                for (int j = 0; j < 6; j++) {
                    System.out.print(dataPendaftar[i][j]);
                    if (j < 5) {
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }
        }
        if (!ada) {
            System.out.println("Tidak ada pendaftar dari program studi tersebut.");
        }
    }

    static void hitungJumlahPerStatus() {
        if (jumlahPendaftar == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }
        int jmlDiterima = 0;
        int jmlMenunggu = 0;
        int jmlDitolak = 0;

        for (int i = 0; i < jumlahPendaftar; i++) {
            String status = dataPendaftar[i][5];

            if (status.equalsIgnoreCase("Diterima")) {
                jmlDiterima++;
            } else if (status.equalsIgnoreCase("Menunggu")) {
                jmlMenunggu++;
            } else if (status.equalsIgnoreCase("Ditolak")) {
                jmlDitolak++;
            }
        }
        System.out.println("Diterima : " + jmlDiterima);
        System.out.println("Menunggu : " + jmlMenunggu);
        System.out.println("Ditolak  : " + jmlDitolak);
        System.out.println("Total pendaftar: " + jumlahPendaftar);
    }

    public static void main(String[] args) {
        int pilihan;

        do {
            tampilkanMenu();
            System.out.print("Pilih menu (1-5): ");
            pilihan = bacaInteger();

            switch (pilihan) {
                case 1:
                    tambahDataMagang();
                    break;
                case 2:
                    tampilkanSemuaPendaftar();
                    break;
                case 3:
                    cariPendaftarByProdi();
                    break;
                case 4:
                    hitungJumlahPerStatus();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid.");
            }

            System.out.println();

        } while (pilihan != 5);
    }
}
