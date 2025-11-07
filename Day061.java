import java.util.Scanner;
public class Kelipatan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();

        System.out.print("Masukkan nilai M (kelipatan): ");
        int M = sc.nextInt();

        System.out.println("Bilangan kelipatan " + M + " dari " + N + " ke 1:");
        for (int i = N; i >= 1; i--) {
            if (i % M == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
