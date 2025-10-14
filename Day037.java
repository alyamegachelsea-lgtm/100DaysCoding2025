import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("masukkan bilanga: ");
        int bilangan = sc.nextInt();
        
        if(bilangan % 2 != 0){
            System.out.println("bilangan " + bilangan + " adalah ganjil");
        
        }else{System.out.println("bilangan " + bilangan + " adalah genap");        
        
        }
    }
}
