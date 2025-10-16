import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("=== Makanan Padang ===");
        System.out.println("Rendang");
        System.out.println("Ikan goreng");
        System.out.println("Ayam bakar");
        System.out.print("Pilih menu di atas : ");
        int pilihan = sc.nextInt();
        int harga1, harga2, harga3;
        harga1 = 70000;
        harga2 = 60000;
        harga3 = 90000;
        
        if (pilihan==1){
            
            System.out.println("selamat menikmati rendang ");
            System.out.println("rendang: "+harga1);
        } else if (pilihan == 2){
            
            System.out.println("semalat manikmati ikan goreng ");
            System.out.println("ikan goreng "+harga2);
        } else if (pilihan == 3){
            
            System.out.println("selamat menikmati ayam bakar ");
            System.out.println("ayam bakar "+harga3);
            
        } else if (pilihan < 1 || pilihan > 3){
            System.out.println("Menu tidak tersedia");
        }
    }
}

        
