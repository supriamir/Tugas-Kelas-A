class Looping7{
    public static void main(String[] args) {
        int y;
        double x;
        double z;

        System.out.println("Rumus 1 :");

        for (int c = 0; c <= 50; c += 5){
            y = (4 * c) + 1;
            System.out.printf("x=%d\ty=%d \n", c , y);
        }
        System.out.println("\nRumus 2 :");

        for (double c = 1; c <= 10; c++){
            x = Math.sqrt(c) - 1;
            System.out.printf("x=%.1f\ty=%.1f \n" , c , x);
        }
        System.out.println("\nRumus 3 :");

        for (double c = 1; c <= 5; c += 0.5){
            z = (5 * (c * c)) + (3 * c) - 2;
            System.out.printf("x=%.1f\ty=%.1f\n" , c , z);
        }

    }
}