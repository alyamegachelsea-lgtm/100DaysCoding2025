import java.util.Scanner;

public class day024java {
      public static void main(String[] args) {
      Scanner chel = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double jari = chel.nextDouble();

        double luas = Math.PI * jari * jari;

        System.out.println("Luas lingkaran dengan jari-jari " + jari + " adalah: " +luas);

    }
    
}
