import java.util.Scanner;

class looping2
{
  public static void main(String[] args)
  {
    Scanner key = new Scanner(System.in);
    int a = key.nextInt();
    int sum = 0;
    for(int i = 1; i <= a; i++)
    {
      if(a % i == 0)
      {
        sum += i;
      }
    }
    System.out.printf("sum = %d",sum);
  }
}