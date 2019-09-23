import java.util.Scanner;
public class looping3 {

    public static void main(String[] args) {
        int x,y;
    System.out.println("----- Rumus 1 -----");
    System.out.printf("X \tY\n");
    for ( int i = 0 ; i <= 50 ; i += 5) {
        x = i;
        y = (4 * x) + 1;
        System.out.printf(" %d \t%d\n ", i, y);
    }
    System.out.println("----- Rumus 2 -----");
    System.out.printf("X \tY\n");
    for ( int i = 0 ; i <= 10 ; i += 1) {
        X = i ;
        double y1 = Math.sqrt(x) - 1 ;
        System.out.printf("%d \t%.2f\n", i, y1);
    }
    System.out.println("----- Rumus 3 -----");
    System.out.printf("X \tY\n");
    for ( double i = 1 ; i <= 5 ; i += 0.5 ) {
        double x1= i;
        double y2= (5 *x1 * x1 ) + ( 3 * x1 ) - 2 ;
        System.out.printf(" %.1f \t%.2f\n", i, y2);
    }
    }
}