import java.util.Scanner;

class Looping5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.println(i);
                sum += i;
            }

            System.out.println(sum);
        }

    }
}