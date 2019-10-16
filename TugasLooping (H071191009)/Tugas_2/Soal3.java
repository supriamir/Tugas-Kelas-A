import java.util.*;
public class Soal3{
    public static void main(String[] args) {
        double y;
        System.out.println("x" + "       "+ "y");
        for(double x = 0; x <= 50; x += 5){
            y = (4*x) + 1;
            System.out.printf("%.0f -- %.0f \n",x,y);
        }
        System.out.println("x" + "       " + "y");
        for (double x= 1; x <= 10; x++){
            y = Math.sqrt(x) - 1;
            System.out.printf("%.1f -- %.1f \n",x,y);
        }
        System.out.println("x" + "       " + "y");
        for (double x = 1; x <= 5; x += 0.5){
            y = (5*(x*x)) + (3*x) - 2;
            System.out.printf("%.1f -- %.1f \n",x,y);
        }
    }
}