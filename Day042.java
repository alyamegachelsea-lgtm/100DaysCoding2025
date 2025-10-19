import java.util.Scanner;

public class GajiBersih {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan gaji utuh: ");
        double gajiutuh = sc.nextDouble();

        System.out.print("Masukkan potongan gaji: ");
        double potongan = sc.nextDouble();

        double gajibersih = gajiutuh - potongan;

        System.out.println("gaji bersih: " + gajibersih);
    }
}
