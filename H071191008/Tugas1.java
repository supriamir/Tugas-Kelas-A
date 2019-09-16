import java.util.Scanner;
class Tugas1 {
    public static void main(String[] args) {
        int n, i;

        Scanner input = new Scanner(System.in);
        System.out.print("N = ");
        n = input.nextInt();

        System.out.print("Faktor dari " + n + " adalah ");
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i);
                System.out.print((i < n) ? "," : "");
            }
            }
        }

    }