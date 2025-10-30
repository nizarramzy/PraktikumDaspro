package jobsheet8;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        for (int x = 1; x <= n; x++) {
            int jumlah = 0;
            System.out.print("n = " + x + " = jumlah kuadrat = ");

            for (int i = 1; i <= x; i++) {
                int kuadrat = i * i;
                jumlah += kuadrat;
                System.out.print(kuadrat);

                if (i < x) {
                    System.out.print(" + ");
                }
            }

            System.out.println(" = " + jumlah);
        }
    }
}

    

