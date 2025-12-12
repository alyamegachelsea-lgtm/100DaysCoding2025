public class Kalkulator {
    public static int tambah(int a, int b) {
        return a + b;
    }

    public static int kurang(int a, int b) {
        return a - b;
    }

    public static int kali(int a, int b) {
        return a * b;
    }
  
    public static double bagi(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        int h = 20;
        int i = 10;

        System.out.println("Penjumlahan: " + tambah(h, i));
        System.out.println("Pengurangan: " + kurang(h, i));
        System.out.println("Perkalian: " + kali(h, i));
        System.out.println("Pembagian: " + bagi(h, i));
    }
}
