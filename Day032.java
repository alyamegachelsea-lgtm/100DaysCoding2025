import java.util.Scanner;
public class percabangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai praktek: ");
        int nilai = sc.nextInt();
        System.out.print("Masukkan nilai uts:  ");
        int NilaiUTS = sc.nextInt();

        // Operator logika OR (||)
        if (nilai>=75 || NilaiUTS >=75) {
            System.out.println("Selamat anda lolos ujian ");
        } else {
            System.out.println("Silahkan mencoba lagi tahun depan ");
        }

    }
}
