package latihan_c;

import java.util.Scanner;

public class Latihan_c {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] angka = {10,20,30,40};       
        
        int maks = 0;
        for (int i = 1; i < angka.length; i++) {
            if(angka[i]>maks){
                maks = angka[i];
            }
                
        }
        System.out.println("angka terbesar array: "+maks);
