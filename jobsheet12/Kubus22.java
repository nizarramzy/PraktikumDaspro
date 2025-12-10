package jobsheet12;
import java.util.Scanner;

public class Kubus22 {
    
    
    static int volumeKubus(int sisi) {
        return sisi * sisi * sisi;
    }

    
    static int luasPermukaanKubus(int sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int s = sc.nextInt();

        int volume = volumeKubus(s);
        int luas = luasPermukaanKubus(s);

        System.out.println("\nVolume kubus = " + volume);
        System.out.println("Luas permukaan kubus = " + luas);
    }
}

    

