import java.util.Scanner;
class Nomor4
{
  public static void main(String[] args)
  {
    int odd=0,even=0,pos=0,neg=0;
    Scanner Nomor4 = new Scanner(System.in);
    for(int i = 0 ; i < 5 ; i++)
    {
      int n = Nomor4.nextInt();
      if(n % 2 == 0 && n > 0)
      {
        even++;
        pos++;
      }
      else if(n % 2 == 0 && n < 0)
      {
        neg++;
        even++;
      }
      else if(n % 2 != 0 && n > 0)
      {
        odd++;
        pos++;
      }
      else if(n % 2 != 0 && n < 0)
      {
        odd++;
        neg++;
      }
      else
      {
        even++;
      }
    }
    System.out.printf("%d bilangan genap%n",even);
    System.out.printf("%d bilangan ganjil%n",odd);
    System.out.printf("%d bilangan positif%n",pos);
    System.out.printf("%d bilangan negatif%n",neg);
  }
}