import java.util.Scanner;
class Tugasloop2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int sum = 0;

        for (int i=1; i<=N; i++) {
            if (N%i==0) {
                sum += i;
            }
        
        }
    System.out.println("Sum = " + sum);
    }
}