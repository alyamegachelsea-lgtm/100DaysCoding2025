package Day035;
import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai ddp: ");
        int ddp = in.nextInt();
        System.out.print("Masukkan nilai aok: ");
        int aok = in.nextInt();
        
        if(ddp>=78){
            System.out.println("Nilai ddp  Lulus");
            if(aok>=78){
                System.out.println("Nilai aok juga lulus");
            }else{
                System.out.println("Tapi nilai aok tidak lulus");
            }
        }else{
            System.out.println("Nilai ddp dan aok tidak lulus");
 }
}
}
        
        
