import java.util.*;
public class DAY_79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String email, sandi;
        
        String email1 = "CHELSEA_ALYA";
        String sandi1 = "28102005";
        
        while (true) {
            System.out.print("Masukkan email: ");
            email = sc.nextLine();
            System.out.print("Masukkan sandi: ");
            sandi = sc.nextLine();
            
            if (email.equalsIgnoreCase(email1)&&sandi.equalsIgnoreCase(sandi1)) {
                System.out.println("\nLOGIN BERHASIL!!!\nSELAMAT DATANG CHELSEA!!");
                return;
            }else{
                System.out.println("\nLogin gagal!! \nSilahkan masukkan ulang email dan sandi anda!!");
            }
        }
  }
}
