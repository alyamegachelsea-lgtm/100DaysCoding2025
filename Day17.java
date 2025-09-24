package day17;

import java.util.Scanner;
public class Day17 {
    public static void main(String[] args) {
        Scanner chel = new Scanner(System.in);
         System.out.print("Masukkan angka pertama: ");
         int angka1 = chel.nextInt();
         System.out.print("Masukkan angka kedua: ");
         int angka2 = chel.nextInt();
         System.out.println();
         System.out.println("Hasil sisa bagi: "+angka1%angka2);
     }
    
}
