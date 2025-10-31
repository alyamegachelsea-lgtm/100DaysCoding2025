package day054.java;
import java.util.Scanner;
public class Day054Java {
    public static void main(String[] args) {  
        String[] nama = {"Chelsea", "Alya", "Mega", "aaaa"};

        System.out.println("Menampilkan nama, kecuali 'Mega':");
        for (String n : nama) {
            if (n.equals("Mega")) {
                continue; // lewati saat nama adalah "Mega"
            }
            System.out.println(n);
        }
    }
}
