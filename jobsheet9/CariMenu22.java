package jobsheet9;
import java.util.Scanner;

public class CariMenu22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] daftarMenu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };

        System.out.println("Daftar menu:");
        for (int i = 0; i < daftarMenu.length; i++) {
            System.out.println((i + 1) + ". " + daftarMenu[i]);
        }

        System.out.print("\nMasukkan nama makanan yang ingin dicari: ");
        String cariMenu = sc.nextLine();

        int letakMenu = -1;
        for (int i = 0; i < daftarMenu.length; i++) {
            if (daftarMenu[i].equalsIgnoreCase(cariMenu)) {
                letakMenu = i;
                break;
            }
        }

        if (letakMenu != -1) {
            System.out.println("Makanan tersedia di menu: " + daftarMenu[letakMenu] +
                               " (no " + letakMenu + ")");
        } else {
            System.out.println("Makanan yang dicari tidak ada di menu.");
        }

        sc.close();
    }
}