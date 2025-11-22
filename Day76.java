import java.util.*;
public class NewClass {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan anu e kata: ");
        String anu = sc.nextLine();
        if (anu.contains("kata")) {
            System.out.println("COUBTENS");
        }if (anu.equals("haha")) {
            System.out.println("EQUALS");
        }if (anu.equalsIgnoreCase("hihi")) {
            System.out.println("EQUALS IGNORCASE");
        }if (anu.isEmpty()) {
            System.out.println("isEmpty");
        }
    }  
}
