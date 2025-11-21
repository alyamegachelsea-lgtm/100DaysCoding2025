import java.util.Scanner;
public class Day075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();

        System.out.println("\n=== HASIL ===");
        System.out.println("Jumlah karakter: " + nama.length());
        System.out.println("Huruf kapital semua : " + nama.toUpperCase());
        System.out.println("Huruf kecil semua   : " + nama.toLowerCase());
    }
}
