class Looping3 {
    public static void main(String[] args) {
        int i;
        double j;
        double k;

       System.out.println("Rumus 1");
       for (int x = 0; x <= 50; x+=5) {
           i = (4*x)+1;
           System.out.printf("x=%d\ty=%d \n",x,i);
       }
       System.out.println("\nRumus 2");
       for (double x = 1; x <= 10; x+=1) { 
           j = Math.sqrt(x)-1;
           System.out.printf("x=%.1f\ty=%.1f \n",x,j);
       }
       System.out.println("\nRumus 3");
       for (double x = 1; x <= 5; x+=0.5) {
           k = ((5*x*x) + (3 * x) - 2);
           System.out.printf("x=%.1f\ty=%.1f \n",x,k);
       }
    }
}