Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int j = in.nextInt();
            if (max<=j) max=j;
            if (min>=j)min=j;
        }
        System.out.println("max: "+max);
        System.out.println("min: "+min);
