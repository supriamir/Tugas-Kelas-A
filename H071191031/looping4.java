import java.util.Scanner;
class looping4
{
  public static void main(String[] args)
  {
    int ganjil=0,genap=0,positif=0,negatif=0;
    Scanner key = new Scanner(System.in);
    for(int i = 0 ; i < 5 ; i++)
    {
      int n = key.nextInt();
      if(n % 2 == 0 && n > 0)
      {
        genap++;
        positif++;
      }
      else if(n % 2 == 0 && n < 0)
      {
        negatif++;
        genap++;
      }
      else if(n % 2 != 0 && n > 0)
      {
        ganjil++;
        positif++;
      }
      else if(n % 2 != 0 && n < 0)
      {
        ganjil++;
        negatif++;
      }
      else
      {
        genap++;
      }
    }
    System.out.printf("%d bilangan genap%n",genap);
    System.out.printf("%d bilangan ganjil%n",ganjil);
    System.out.printf("%d bilangan positif%n",positif);
    System.out.printf("%d bilangan negatif%n",negatif);
  }
}