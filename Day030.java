import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nomer1: ");
        int a = sc.nextInt();
        System.out.print("Masukkan nomer2: ");
        double b = sc.nextDouble();
        
        System.out.println("apakah a <=b?\t" +(a<=b));
        System.out.println("apakah a >=b?\t" +(a>=b));

    }
}
