import java.util.Scanner;

public class MenuMakanan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Makanan Padang ===");
        System.out.println("1. Rendang Rp70.000");
        System.out.println("2. Ikan goreng Rp60.000");
        System.out.println("3. Ayam bakar Rp90.000");
        System.out.print("Pilih menu di atas : ");
        
        int pilihan = sc.nextInt();

        int harga1, harga2, harga3;
        harga1 = 70000;
        harga2 = 60000;
        harga3 = 90000;

        if (pilihan == 1) {
            System.out.println("Pesanan anda segera dibuat, mohon menunggu");
            System.out.println("Rendang: " + harga1);
        } else if (pilihan == 2) {
            System.out.println("Pesanan anda segera dibuat, mohon menunggu");
            System.out.println("Ikan goreng: " + harga2);
        } else if (pilihan == 3) {
            System.out.println("Pesanan anda segera dibuat, mohon menunggu");
            System.out.println("Ayam bakar: " + harga3);
        } else if (pilihan < 1 || pilihan > 3) {
            System.out.println("Menu tidak tersedia");
        }
    }
}
