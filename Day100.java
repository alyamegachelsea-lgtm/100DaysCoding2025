import java.util.Scanner;

public class StringCantikISC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama = sc.nextLine().toUpperCase();

        boolean adaI = false;
        boolean adaS = false;
        boolean cantik = false;

        for (int i = 0; i < nama.length(); i++) {
            char huruf = nama.charAt(i);

            if (huruf == 'I') {
                adaI = true;
            } else if (huruf == 'S' && adaI) {
                adaS = true;
            } else if (huruf == 'C' && adaI && adaS) {
                cantik = true;
                break;
            }
        }

        if (cantik) {
            System.out.println("CANTIK");
        } else {
            System.out.println("TIDAK CANTIK");
        }
    }
}
