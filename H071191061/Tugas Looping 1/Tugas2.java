import java.util.Scanner;
class Tugas2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input bilangan : ");
        int n = input.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                sum += i;
            }
        }
        System.out.printf("Sum = %d",sum);
    input.close();
    }
}