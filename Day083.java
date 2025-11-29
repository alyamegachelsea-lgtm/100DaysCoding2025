public class Day_083 {
    public static void main(String[] args) {
        int[] angka = {10, 15, 20, 25, 30}; 
        int jumlah = 0;

        // Menjumlahkan semua elemen array
        for (int i = 0; i < angka.length; i++) {
            jumlah += angka[i];
        }

        System.out.println("Jumlah semua elemen array: " + jumlah);
    }
}
