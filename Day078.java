public class Day078 {
    public static void main(String[] args) {
        String kata = "  Aku Suka Belajar di Rumah  ";
      
        String trimKalimat = kalimat.trim();
        System.out.println("Setelah trim: " + trimKalimat);
        System.out.println("Lowercase: " + trimKalimat.toLowerCase());
        System.out.println("Uppercase: " + trimKalimat.toUpperCase());
        String gantiKata = trimKalimat.replace("Kelas", "Sekolah");
        System.out.println("Setelah replace: " + gantiKata);

        if (trimKalimat.contains("Rumah")) {
            System.out.println("Kalimat menggunakan kata 'Rumah'");
        }

        String potongan = trimKalimat.substring(9, 16);
        System.out.println("Potongan kata: " + potongan);

        String a = "Halo";
        String b = "halo";
      
        System.out.println("equals(): " + a.equals(b)); // false
        System.out.println("equalsIgnoreCase(): " + a.equalsIgnoreCase(b)); // true
    }
}
