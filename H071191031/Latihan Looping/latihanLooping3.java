class latihanLooping3 {
    public static void main(String[] args) {
        int y;
        double x;
        double z;

        System.out.println("Rumus 1");
        for (int i = 0; i <= 50; i=i+5) {
            y = 4*i+1;
            System.out.printf("x=%d y=%d \n",i,y);
        }

        System.out.println("Rumus 2");
        for (double i = 1; i <= 10; i++) {
            x = Math.sqrt(i)-1;
            System.out.printf("x=%.2f y=%.2f \n",i,x);
        }

        System.out.println("Rumus 3");
        for (double i = 1; i <= 5; i+=0.5) {
            z = (5*i*i) + (3*i)-2;
            System.out.printf("x=%.2f y=%.2f \n",i,z);
        }
    }
}