package jobsheet14;

import java.util.Scanner;

public class Percobaan2 {
    static int hitungPangkat(int x, int y) {
        if (y==0) {
            return (1);
        } else {
            return (x *hitungPangkat(x, y-1));
        }
    }
    
    static void cetakDeretPangkat(int x, int y) {
        for (int i = 1; i <= y; i++) {
            System.out.print(x + " x ");
        }
        System.out.print("1");  
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.println("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.println("Pangkat: ");
        pangkat = sc.nextInt();

        System.out.println(hitungPangkat(bilangan, pangkat));

        System.out.print("Perhitungan: ");
        cetakDeretPangkat(bilangan, pangkat);
        System.out.println(" = " + hitungPangkat(bilangan, pangkat));


    }
}
