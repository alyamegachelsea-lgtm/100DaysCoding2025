import java.util.Scanner;
public class Mencetakangka1N_dan_angkaN1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input nilai 
        System.out.print("Masukkan nilai : ");
        int N = sc.nextInt();

        // Mencetak angka 1 sampai N
        System.out.println("\nAngka 1 sampai " + N + ":");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }

        // Mencetak angka N sampai 1
        System.out.println("\n\nAngka " + N + " sampai 1:");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
