import java.util.Scanner;
class TGSRange3{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
            int A;
            double D;
            double C;
            sc.close();
            
            System.out.println("Rumus 1");
            for (int B = 0; B <= 50; B+=5){
                A = 4*B + 1;
                System.out.printf("x = %d , y = %d\n" , B, A);
            }
            System.out.println("\nRumus 2");
            for (double E = 1; E<= 10; E++){
                D = Math.acos(E) - 1;
                System.out.printf("x = %.2f , y = %.2f\n" , E, D); 
            }
            System.out.println("\nRumus 3");
            for (double F = 1; F<= 5; F=F+0.5){
                C = 5*F*F + 3*F -2;
                System.out.printf("x = %.2f , y = %.2f\n" , F, C);
            }
        }
    } 