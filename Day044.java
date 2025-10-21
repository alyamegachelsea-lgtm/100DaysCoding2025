import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String user = "chelsea";
        int pin1 = 1234;
         
        System.out.print("Masukkan username: ");
        String user1 = sc.nextLine();
        System.out.print("Masukkan pin: ");
        int pin = sc.nextInt();
        
        int nilai = 0;
        if(user1.equals(user)&&pin==pin1)
         System.out.print("Masukkan nilai: ");
            nilai = sc.nextInt();
            if (nilai>=90&&nilai<=100) {
                    System.out.println("Grade : A");
                }else if (nilai>=80&&nilai<90) {
                    System.out.println("Grade : B");
                }else if (nilai>=70&&nilai<80) {
                    System.out.println("Grade : C");
                }else if (nilai>=60&&nilai<70) {
                    System.out.println("Grade : D");
                }else if (nilai<60){
                    System.out.println("Grade : E");
                }else {
                    System.out.println("Username atau pasword salah!");
                }
    }
}

      
