package latihan_c;
import java.util.Scanner;
public class Latihan_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [] angka = {40,20,30,10};       
        
        int minm = angka[0];
        for (int i = 0; i < angka.length; i++) {
            if(angka[i]<minm){
                minm = angka[i];
            }
        }  
        
        System.out.println(minm);
    }
  }
}
    
