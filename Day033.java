import java.util.Scanner;
public class NewClass1 {
  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Masukkan umur: ");
        int umur = sc.nextInt();

        // Mengecek apakah umur tidak lebih dari atau sama dengan 50
        if (!(umur >= 50)) {
            System.out.println("kamu masih muda ");
        } else {
            System.out.println("kamu bau tanah ");
        }  
  }
    
}
