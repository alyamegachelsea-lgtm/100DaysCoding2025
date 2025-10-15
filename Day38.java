import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("masukkan bilangan bulat: ");
        int angka = sc.nextInt();
        
        if ( angka >= 1){
            System.out.println("angka " + angka + " positif ");
        
        } else if ( angka <= -1){
            System.out.println("angka " + angka + " negatif ");
        
         
        } else{
            System.out.println("anda memasukkan angka nol ");
        }
    }
}
