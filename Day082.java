import java.util.Scanner;
public class Perulangan_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlah = sc.nextInt();

        int[] angka = new int[jumlah];
      
        System.out.println("\n=== Input Data Angka ===");
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }

        // Menampilkan array dengan for-each
        System.out.println("\n=== Menampilkan Semua Angka ===");
        for (int nilai : angka) {
            System.out.println("Nilai: " + nilai);
        }
