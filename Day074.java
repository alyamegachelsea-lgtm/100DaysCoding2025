import java.util.Scanner;

public class Day_74 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
       int pilihan;

        do {
            System.out.println("===== MENU BILANGAN =====");
            System.out.println("1. Cek Ganjil / Genap");
            System.out.println("2. Cek Positif / Negatif");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan angka: ");
                int n = sc.nextInt();
                if (n % 2 == 0) {
                    System.out.println("Angka yang anda masukkan adalah GENAP");
                } else {
                    System.out.println("Angka yang anda masukkan adalah GANJIL");
                }

            } else if (pilihan == 2) {
                System.out.print("Masukkan angka: ");
                int n = sc.nextInt();
                if (n >= 0) {
                    System.out.println("Angka yang anda masukkan POSITIF");
                } else {
                    System.out.println("Angka yang anda masukkan NEGATIF");
                }

            } else if (pilihan == 3) {
                System.out.println("Program dihentikan.");
            } else {
                System.out.println("Pilihan tidak valid!");
            }

            System.out.println();

        } while (pilihan != 3);
    }
}
  
