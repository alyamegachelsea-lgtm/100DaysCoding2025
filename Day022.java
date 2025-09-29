import java.util.Scanner;

public class java {
   public static void main(String[] args) {
        Scanner chel = new Scanner(System.in);

        // panjang sisi int
        System.out.print("Masukkan sisi persegi integer: ");
        int sisiInt = chel.nextInt();

        // panjang sisi double
        System.out.print("Masukkan sisi persegi double: ");
        double sisiDouble = chel.nextDouble();

        // hitung luas 
        int luasInt = sisiInt * sisiInt;
        double luasDouble = sisiDouble * sisiDouble;

        // untuk menampilkan hasil
        System.out.println("Luas persegi int    : " + luasInt);
        System.out.println("Luas persegi double : " + luasDouble);
        
       
   }   
    
}
