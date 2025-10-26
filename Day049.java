import java.util.Scanner;

public class TernaryUmur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = sc.nextInt();

        String termasuk = (umur >= 18) ? "Dewasa" : "Anak-anak";

        System.out.println("termasuk: " + termasuk);
    }
}
