Scanner sc = new Scanner(System.in);
        String [] buah = {"apel","anggur","jeruk","mangga","naga"};
        
        String cari = sc.nextLine();
        int a = 0;
        for (int i = 0; i < buah.length; i++) {
            if (cari.contains(buah[i])) a++;
        }
        if (a>0) {
            System.out.println("tersedia");
        }else{
            System.out.println("tidak tersedia");
        }
    }
}
