import java.util.Scanner;
class Aa3n3b{
    public static void main(String[] args) {
        Scanner oScanner = new Scanner(System.in);
        System.out.println("**Menu**\n1. y = 1. 4x + 1\n2. y = (x^1/2) - 1\n3. y = 5x^2 + 3x - 2\n");
        boolean check = true;
        try{
        while(check){
                int input = oScanner.nextInt();
                double y = 0;
                double y1 = 0;
                if(input == 1){
                    double x = oScanner.nextDouble();
                    for(double i = 0; i <= x; i += 5){
                        y = (4*i) + 1;
                        System.out.printf("x = %.2f y = %.2f\n", i, y);
                        check = false;
                    }
                }else if(input == 2){
                    double x = oScanner.nextDouble();
                    for(double i = 0; i <= x; i++){
                        y1 = (Math.sqrt(i)) - 1;
                        System.out.printf("x = %.2f y = %.2f\n", i, y1);
                        check = false;
                    }
                }else if(input == 3){
                    double x = oScanner.nextDouble();
                    for(double i = 0; i <= x; i += 0.5){
                        y1 = (5*Math.pow(i, 2)) + 3*i -2;
                        System.out.printf("x = %.2f y = %.2f\n", i, y1);
                        check = false;
                    }
                }else{
                    System.out.println("Ulang Input");
                }
            }
            }catch(Exception ime){
                System.out.println("Salah Input");
                return;
        }
    }
} 