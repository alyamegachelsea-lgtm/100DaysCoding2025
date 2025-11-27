public class AksesArray {
    public static void main(String[] args) {
        String[] hewan = {"kucing", "buaya", "kuda", "sapi", "kelinci"};

        System.out.println("Semua hewan:");
        for (int i = 0; i < hewan.length; i++) {
            System.out.println("Indeks ke-" + i + ": " + hewan[i]);
        }
      
        System.out.println("\nHewan pada indeks ke-2 adalah: " + hewan[2]);
    }
}
