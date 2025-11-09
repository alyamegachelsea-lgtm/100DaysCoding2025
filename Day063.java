package mengalikan_;
import java.util.Scanner;
public class Mengalikan_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();

        // menyimpan hasil kali
        int hasil = 1;

        
        for (int i = 1; i <= N; i++) {
            hasil = hasil * i;
        }

        
        System.out.println("Hasil perkalian 1 sampai " + N + " adalah: " + hasil);
    }
}  
