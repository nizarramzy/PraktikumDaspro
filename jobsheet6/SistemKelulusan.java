package jobsheet6;
import java.util.Scanner;
public class SistemKelulusan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== INPUT DATA MAHASISWA ===");

        System.out.print("Masukkan nama : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        int NIM = sc.nextInt();

//matkul 1
        System.out.println("--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Masukkan Nilai UTS: ");
        double UTS1 = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double UAS1 = sc.nextDouble();
        System.out.print("Masukkan Nilai Tugas: ");
        double Tugas1 = sc.nextDouble();

        double NilaiAkhir1 = (UTS1 * 0.3) + (UAS1 * 0.4) + (Tugas1 * 0.3);
        
        String Status1;
        String Huruf1;

        if (NilaiAkhir1 >= 60) {
            Status1 = "LULUS";
        } else {
            Status1 = "TIDAK LULUS";
        }    
        
        if (NilaiAkhir1 > 80 && NilaiAkhir1 <= 100) {
            Huruf1 = "A";
        } else if (NilaiAkhir1 > 73 && NilaiAkhir1 <= 80) {
            Huruf1 = "B+";
        } else if (NilaiAkhir1 > 65 && NilaiAkhir1 <= 73) {
            Huruf1 = "B";
        } else if (NilaiAkhir1 > 60 && NilaiAkhir1 <= 65) {
            Huruf1 = "C+";
        } else if (NilaiAkhir1 > 50 && NilaiAkhir1 <= 60) {
            Huruf1 = "C";
        } else if (NilaiAkhir1 > 39 && NilaiAkhir1 <= 50) {
            Huruf1 = "D";
        } else {
            Huruf1 = "E";
        }
        
//Matkul 2
        System.out.println("--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Masukkan Nilai UTS: ");
        double UTS2 = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double UAS2 = sc.nextDouble();
        System.out.print("Masukkan Nilai Tugas: ");
        double Tugas2 = sc.nextDouble();
        
        double NilaiAkhir2 = (UTS2 * 0.3) + (UAS2 * 0.4) + (Tugas2 * 0.3);

        String Status2;
        String Huruf2;

        
        if (NilaiAkhir2 >= 60) {
            Status2 = "LULUS";
        } else {
            Status2 = "TIDAK LULUS";
        }

        if (NilaiAkhir2 > 80 && NilaiAkhir2 <= 100) {
            Huruf2 = "A";
        } else if (NilaiAkhir2 > 73 && NilaiAkhir2 <= 80) {
            Huruf2 = "B+";
        } else if (NilaiAkhir2 > 65 && NilaiAkhir2 <= 73) {
            Huruf2 = "B";
        } else if (NilaiAkhir2 > 60 && NilaiAkhir2 <= 65) {
            Huruf2 = "C+";
        } else if (NilaiAkhir2 > 50 && NilaiAkhir2 <= 60) {
            Huruf2 = "C";
        } else if (NilaiAkhir2 > 39 && NilaiAkhir2 <= 50) {
            Huruf2 = "D";
        } else {
            Huruf2 = "E";
        }

        double RataNilai = (NilaiAkhir1 + NilaiAkhir2) / 2;
        String StatusSemester;

        if (Status1.equals("LULUS") && Status2.equals("LULUS")) {
            if (RataNilai >= 70) {
                StatusSemester = "LULUS";
            } else {
                StatusSemester = "TIDAK LULUS";
            }
        } else {
            StatusSemester = "TIDAK LULUS";
        }

        System.out.println("\n================ HASIL PENILAIAN AKADEMIK ================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + NIM);
        System.out.println();
        System.out.println("Mata Kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Algoritma Pemrograman\t" + UTS1 + "\t" + UAS1 + "\t" + Tugas1 + "\t" + String.format("%.2f", NilaiAkhir1) + "\t\t" + Huruf1 + "\t\t" + Status1);
        System.out.println("Struktur Data\t\t" + UTS2 + "\t" + UAS2 + "\t" + Tugas2 + "\t" + String.format("%.2f", NilaiAkhir2) + "\t\t" + Huruf2 + "\t\t" + Status2);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Rata-rata Nilai Akhir : " + String.format("%.2f", RataNilai));
        System.out.println("Status Semester       : " + StatusSemester);

        sc.close();
    }         
}

        
        
    
    

