import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input (L/P) :");
        String kode1 = sc.nextLine();
        switch(kode1){
            case "L" :
                System.out.println("laki-laki");
                break;
                
            case "P" :
                System.out.println("perempuan");
                break;
                
            default :    
                System.out.println("kode error");
                break;
        
        
        }
        
        
        
        
        
    }
}
