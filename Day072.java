import java.util.Scanner;
public class Day072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan tinggi segitiga: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {           // Mulai dari n sampai 1 (baris menurun)
            for (int c = 1; c <= i; j++) {       // Cetak angka  sebanyak nilai i
                System.out.print(" # ");
            }
            System.out.println();                
        }
    }
