import java.util.Scanner;

public class PolaHorizontal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah bintang: ");
        int n = sc.nextInt();

        System.out.print("Pola horizontal: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(" 1 ");
        }
    }
}
