import java.util.Scanner;
class Tugasloop3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int sum = 0;
        System.out.print("Bilangan Ganjil adalah ");

        for (int i=1; i<=N; i+=2) {
            System.out.print(i + " ");
            sum += i;
        }
    System.out.println("\nBanyaknya Bilangan Ganjil adalah " + sum);
    input.close();
    }
}