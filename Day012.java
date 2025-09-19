import java.util.Scanner;
public class Day012.Java {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama: ");
        String nama = input.nextLine();
        
        System.out.print("Umur? ");
        int umur = input.nextInt();
        input.nextLine();
       
       
        System.out.print("tinggi? ");  
        double tinggi = input.nextDouble();
        
        System.out.println("nama saya :"+ nama);
        System.out.print("umur saya :"+ umur); 
        System.out.printf("\ntinngi saya %f" ,tinggi);
        }
    
}
