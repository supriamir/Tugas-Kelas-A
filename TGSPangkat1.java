import java.util.Scanner;
class TGSPangkat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("base = ");
        int x = sc.nextInt();
        System.out.print("pangkat = ");
        int y = sc.nextInt();
        float n = x;
        sc.close();
        
        if (y > 0) {
            for (int i = 1; i < y; i++) {
                n = n * x;
            System.out.printf("%d^%d = %.1f", x, y, n);
            }

        } else {
            for (int i = 1; i < y; i++) {
                n = n / x;
            System.out.printf("%d^%d = %.2f", x, y, 1 / n);
            }
        }
    }
} 