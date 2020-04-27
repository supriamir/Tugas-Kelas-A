import java.util.Scanner;
class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pilih Persamaan");
        System.out.println("1. 0-50 dengan increment 5");
        System.out.println("2. 1-10 dengan increment 1");
        System.out.println("3. 1-5 dengan increment 0.5");
        
        int rumus = sc.nextInt();
        double y;
        System.out.println();
        switch (rumus) {
            case 1 :
                System.out.println("Rumus 1");
                for (int x = 0 ; x <= 50 ; x+=5) {
                    y = ((4*x) + 1);
                    System.out.printf("(x=%d y=%.0f) \n" , x , y);
                } break;
            case 2 : 
                System.out.println("Rumus 2");
                for (int x = 1; x <= 10 ; x+=1) {
                    y = (Math.sqrt(x) - 1);
                    System.out.printf("(x=%d y=%.2f) \n" , x , y);
                } break;
            case 3 :
                System.out.println("Rumus 3");
                for (double x = 1 ; x <= 5 ; x+=0.5) {
                    y = ((5*x*x) + (3*x) - 2);
                    System.out.printf("(x=%.1f y=%.2f) \n" , x , y);
                } break;
        }
        sc.close();
    }
}