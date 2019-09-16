import java.util.Scanner;
class Nomor3
{
  public static void main(String[] args)
  {
    Scanner Nomor3 = new Scanner(System.in);
    int n = Nomor3.nextInt();
    int odd = 0;
    System.out.printf("bilangan ganjil = ");
    if(n > 0)
    {
      for(int i = 1; i <= n; i++)
      {
        if(i % 2 != 0)
        {
          odd++;
          System.out.printf("%d ",i);
        }

      }
    }
   

    System.out.println("");
    System.out.printf("jumlah bilangan ganjil = %d",odd);
  }
}