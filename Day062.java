import java.util.Scanner;
public class Jumlah{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();

        int i = 1;
        int total = 0;

        while (i <= N) {
            total += i;
            i++;
        }

        System.out.println("Jumlah dari 1 sampai " + N + " adalah: " + total);
    }
}
