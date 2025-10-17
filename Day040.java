import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Kalkulator ===");
        System.out.print("Masukkan operator (+-*/): ");
        String operator = sc.nextLine();
        System.out.print("Masukkan angka1: ");
        double angka1 = sc.nextDouble();
        System.out.print("Masukkan angka2: ");
        double angka2 = sc.nextDouble();
        
        if (operator.equals ("+")){
            System.out.println("angka1 + angka2" + " = "+(angka1 + angka2) );
        }
        else if (operator.equals ("-")){
            System.out.println("angka1 - angka2" + " = "+(angka1 - angka2) );
        }
        else if (operator.equals ("*")){
            System.out.println("angka1 * angka2" + " = "+(angka1 * angka2) );
        }
        else {
            System.out.println("angka1 / angka2" + " = "+(angka1 / angka2) );
        }
    }
}
        
