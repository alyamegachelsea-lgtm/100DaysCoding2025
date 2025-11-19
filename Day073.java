import java.util.Scanner;
public class Day073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka;
        int total = 0;

        System.out.println("Program Penjumlahan Angka (berhenti kalau inputnya negatif)");
        
        while (true) {
            System.out.print("Masukkan angka: ");
            angka = sc.nextInt();

            // berhenti kalau nanti angkanya negatif
            if (angka < 0) {
                break;
            }

            total = total + angka; // menjumlahkan
        }

        System.out.println("Total penjumlahan = " + total);
    }
}
