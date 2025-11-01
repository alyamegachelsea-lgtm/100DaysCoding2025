import java.util.Scanner;

public class Angka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input data
        System.out.print("Batas Bawah : ");
        int bawah = sc.nextInt();
        
        System.out.print("Batas Atas : ");
        int atas = sc.nextInt();
        
        System.out.print("Angka : ");
        int angka = sc.nextInt();
        
        // Pengecekan
        if (angka >= bawah && angka <= atas) {
            System.out.println("YAYAYAYA");
        } else {
            System.out.println("NONONONO");
        }
    }
}




