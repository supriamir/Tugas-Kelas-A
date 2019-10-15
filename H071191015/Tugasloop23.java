import java.util.Scanner;
class Tugasloop23 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        double b, c;


        System.out.println("Rumus 1");
        for (int x = 0; x <= 50; x+=5) {
            a = (4*x)+1;
            System.out.printf("x=%d\ty=%d \n", x, a);
        }

        System.out.println("Rumus 2");
        for (double x = 1; x <= 10; x++) {
            b = Math.sqrt(x)-1;
            System.out.printf("x=%.1f\ty=%.1f \n", x, b);
        }

        System.out.println("Rumus 3");
        for (double x = 1; x <= 5; x+=0.5) {
            c = (5*(x*x))+(3*x)-2;
            System.out.printf("x=%.1f\ty=%.1f \n", x, c);
        }
    }
}