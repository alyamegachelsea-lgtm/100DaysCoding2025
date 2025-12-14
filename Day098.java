import java.util.Scanner;

public class DeretFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        int n = input.nextInt();

        int a = 0, b = 1;
        System.out.print("Deret Fibonacci: ");

        while (b <= n) {
            System.out.print(b + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
