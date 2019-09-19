import java.util.Scanner;

class Loping2 {

    public static void main (String[] args) {
        Scanner Loping2 = new Scanner (System.in);
        int a = Loping2.nextInt();
        int sum = 0;
        for(int i = 1; i<= a; i++)
        {
            if(a % i == 0)
            {
                sum +=i;

            }
        }
        System.out.printf("sum = %d",sum);

    }
}