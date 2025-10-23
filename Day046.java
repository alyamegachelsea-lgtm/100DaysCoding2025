import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int pesan1, porsi, harga =0;
        System.out.print("       === Menu makanan ===\n");
        System.out.print("1.Seblak / 2.Mie ayam / 3.Bakso ");
        System.out.print("Pilih: ");
        pesan1 = sc.nextInt();
       
        
        switch (pesan1){
            case 1 :
                System.out.print("porsi: ");
                porsi = sc.nextInt();
                System.out.println("Seblak(12k/porsi)");
                harga = 10000 * porsi;
                break;
                
            case 2 :   
                System.out.print("porsi: ");
                porsi = sc.nextInt();
                System.out.println("Mie ayam(15k/porsi)");
                harga = 12000 * porsi;
                break;
                
            case 3 :
                System.out.print("porsi: ");
                porsi = sc.nextInt();
                System.out.println("Bakso(18k/porsi)");
                harga = 18000 * porsi;
                break;
                
            default :
                System.out.println("Pilihan salah!!");
                break;
                
        }
       
        System.out.println("Total: Rp. "+harga);
    }
}
        
