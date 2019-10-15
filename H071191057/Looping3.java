import java.util.Scanner;
class Looping3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N = ");
        int N = input.nextInt();
        System.out.print("Bilangan ganjil = ");
        int odd = 0;
        for (int x = 1 ; x <= N ; x+=2){
            System.out.print(x + ",");
            odd += 1;
            }

            System.out.println("\nBanyak bilangan ganjil = " + odd);
        }
        
        
    }
