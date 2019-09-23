import java.util.Scanner;
class Loop3{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double y;
        System.out.println("pilihan = 1.x =(0 - 50 dengan increment 5), 2.x = (1 - 10 dengan increment 1) 3.x = (1 - 5 dengan increment 0,5");
        System.out.println("Masukkan pilihan =");
        int persamaan = sc.nextInt();
        sc.close();

        switch (persamaan){
            case 1 :
                System.out.println("x" + " " + "y");
                for (double x = 0; x <= 50; x += 5){
                    y = (4 * x) + 1;
                    System.out.printf("x= %.0f y= %.0f\n", x,y);
                }
                break;
            case 2 :
                System.out.println("x" + " " + "y");
                for (double x = 1; x <= 10; x++){
                    y = Math.sqrt(x) - 1;
                    System.out.printf("x= %.0f y= %.0f\n", x,y);
                }
                break;
            case 3 :
                System.out.println("x" + " " + "y");
                for (double x = 1; x <= 5; x += 0.5){
                    y = (5 * (x * x) + (3 * x) - 2);
                    System.out.printf("x= %.02f y= %.02f\n", x,y);
                }
                break;
        }
    }
}