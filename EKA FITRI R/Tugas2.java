import java.util.Scanner;
class Tugas2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= N; i++){
            if (N % i == 0){
                sum = sum + i;
            }
        }
        System.out.print("Sum = " + sum);

        
        sc.close();
    }
}