import java.util.Scanner;
class looping3
{
  public static void main(String[] args)
  {
    Scanner key = new Scanner(System.in);
    int n = key.nextInt();
    int ganjil = 0;
    System.out.printf("bilangan ganjil = ");
    if(n > 0)
    {
      for(int i = 1; i <= n; i++)
      {
        if(i % 2 != 0)
        {
          ganjil++;
          System.out.printf("%d ",i);
        }

      }
    }
    else if(n < 0)
    {
      for(int i = 0; i >= n ; i--)
      if(i % 2 != 0)
      {
        ganjil++;
        System.out.printf("%d ",i);
      }
    }
    else
    {
      System.out.printf("gak ada");
    }

    System.out.println("");
    System.out.printf("jumlah bilangan ganjil = %d",ganjil);
  }
}