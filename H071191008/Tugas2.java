import java.util.Scanner;
public class Tugas2{

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int n,sum,i;

        System.out.print("N = ");
        n = input.nextInt();
        sum = 0;

        for(i = 1; i <= n; i++){
            if (n%i == 0){
                sum = sum + i;
            }
        }

        System.out.println("Sum = " + sum);

    }
} 