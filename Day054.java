
import java.util.Scanner;
public class arry_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("batas array: "); 
        int batas = sc.nextInt();

        String b[] = new String[batas];
        b[0] = "chelsea";
        b[1] = "alya";
        b[2] = "mega";

        System.out.print("String : ");
        for (String a : b) {
            System.out.println(a);

            if (a.equals("alya")) {
                System.out.println("Perulangan berhenti karena menemukan 'alya'");
                break;
            }
        }

        char c[] = new char[2];
        c[0] = 'a';
        c[1] = 'b';

        System.out.println("\nChar : ");
        for (char d : c) {
            System.out.println(d);

            if (d == 'a') {
                System.out.println("Perulangan berhenti karena menemukan 'a'");
                break;
            }
        }
    }
}
     
