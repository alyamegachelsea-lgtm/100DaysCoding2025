import java.util.Scanner;
public class PolaPersegi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan ukuran sisi persegi: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // baris
            for (int j = 1; j <= n; j++) { // kolom
                System.out.print(" 1 ");
            }
            System.out.println(); 
    }
}


