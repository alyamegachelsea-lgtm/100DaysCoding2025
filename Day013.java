import java.util.Scanner;
public class Day013Java {
    public static void main(String[] args) {
        
     Scanner input = new Scanner(System.in);   
     
        System.out.print("Masukkan judul buku :");
        String judul = input.nextLine();
                
        System.out.print("Masukkan harga buku :");
        double harga = input.nextDouble();
        
        System.out.print("Masukkan jumlah eksamplar :");
        int jumlah = input.nextInt();
                
        System.out.print("Masukkan true or false :");
        boolean t = input.nextBoolean();
        
        System.out.printf("\nbuku berjudul %s dengan kode rak b berharga Rp %.2f " ,judul,harga);
        System.out.printf("\njumlah eksplar yang tersedia %d" ,jumlah);
        System.out.printf("\napakah tersedia versi e-book ? %s " ,t);
        
        
        
        
        
        
        
        
        
    }
    
}
