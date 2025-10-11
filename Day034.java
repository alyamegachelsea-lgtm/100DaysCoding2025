import java.util.Scanner;
public class NewClass1 {
  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan tahun: ");
        int tahun = sc.nextInt();
        
        if(tahun %4==0 && tahun %100!=0 || tahun %4001==0 ){
            System.out.println("adalah tahun kabisat");
        
        }else{System.out.println("bukan tahun kabisat");
          
         }
  }
}
