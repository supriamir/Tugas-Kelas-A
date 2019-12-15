import java.util.Scanner;
class Tugas3 {
    public static void main(String[] args) {
        Scanner ai = new Scanner(System.in);
        int N = ai.nextInt();
        int sum = 0;
        System.out.print("Bilangan ganjil = ");

        for (int k = 1; k <= N; k += 2) {
            System.out.print(k + ",");
            sum += 1;
        }
     System.out.print("\nBanyak bilangan ganjil = " + sum);

    }
}