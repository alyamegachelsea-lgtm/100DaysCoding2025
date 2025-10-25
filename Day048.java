
import java.util.Scanner;
public class KalkulatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.println("=== Kalkulator Sederhana ===");
        System.out.print("Masukkan angka pertama: ");
        angka1 = sc.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = sc.next().charAt(0);  // baca karakter pertama

        System.out.print("Masukkan angka kedua: ");
        angka2 = sc.nextDouble();

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                  System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("Operator tidak valid!");
        }
    }
}
