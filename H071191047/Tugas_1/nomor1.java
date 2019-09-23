import java.util.Scanner;

class nomor1
{
  public static void main(String[] args)
  {
    Scanner key = new Scanner(System.in);
    int a = key.nextInt();
    System.out.printf("%d merupakan kelipatan dari ",a);
    if(a > 0)
    {
      for(int i = 1; i <= a; i++)
      {
        if(a % i == 0)
        {
          System.out.printf("%d ",i);
        }
      }
    }
    


  }
}