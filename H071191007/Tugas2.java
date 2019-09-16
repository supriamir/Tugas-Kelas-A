import java.util.Scanner;
class Tugas2 {
    public static void main(String[] args) {
        Scanner ra = new Scanner(System.in);
        int N = ra.nextInt();
        int sum = 0;

        for (int j = 1; j <= N; j++) {
            if (N % j == 0) {
                sum += j;

            }
        }
        System.out.println("Sum = " + sum);
    }
}