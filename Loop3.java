import java.util.Scanner;
class Loop3{
    public static void main(String[] args){
        Scanner fa = new Scanner (System.in);
        System.out.println("Rumus 1");
        for (int i = 0; i <= 50; i+=5) {
            int y = 4*i+1;
            System.out.printf("x = %d , y = %d\n", i,y);
        }
        System.out.println("Rumus 2");
    for (double i2 = 1; i2 <= 10; i2++) {
        double y2=Math.sqrt(i2)-1;
        System.out.printf("x = %.1f , y = %.1f\n",i2,y2);
        }
        System.out.println("Rumus 3");
    for (double i3 = 1; i3 <= 5; i3+=0.5) {
        double y3=5*i3*i3+3*i3-2;
        System.out.printf("x = %.1f , y = %.1f\n",i3,y3);
    }
    }
}