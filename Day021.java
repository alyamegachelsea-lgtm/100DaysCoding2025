import java.util.Scanner;
public class Day17 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
      
        System.out.println("Sebelum ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        a = a+b; //jadi ini 30
        b = a-b; //hasilnya 10
        a = a-b; //20
                    
        System.out.println("Sesudah ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
