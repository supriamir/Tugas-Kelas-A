import java.util.Scanner;
class TugasPP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("N = ");
        int n = sc.nextInt();
        int a = 0;
        System.out.print("Bilangan ganjil = ");

        for (int i = 1 ; i <= n ; i++) {
            if (i %2==1) {
            System.out.printf(" %d " , i);
            a++;
            }
        }
        System.out.printf("\nBanyak bilangan ganjil = " + a);
        sc.close();
    }
}