import java.util.Scanner;
public class Day080 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("batas array: "); 
        int batas = sc.nextInt();
        String b [] = new String [batas];
        b [0] = "chelsea";
        b [1] = "alya";
        b [2] = "mega";
       
        System.out.print("Nama: ");
        for(String a : b){
            System.out.println(a);
        }
    }
}
