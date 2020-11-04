import java.util.Scanner;
class tugasmid5
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int input[][] = new int[n][n];
    for(int i = 0 ; i < n ; i++)
    {
      for(int j = 0 ; j <= i ; j++)
      {
        input[i][j] = sc.nextInt();
      }
    }
    int maindex = 0;
    int kiri= 0;
    int kanan= 0;
    int kirisum = input[maindex][kiri] + input[maindex+1][kiri];
    int kanansum= input[maindex][kanan] + input[maindex+1][kanan+1];
    rightdex = 1;
    for(maindex = maindex + 1 ; maindex < n - 1 ; maindex++)
    {
      if(kirisum + input[maindex+1][kiri] >= kiri sum + input[maindex+1][kiri+1])
      {
        kirisum += input[maindex+1][kiri];
        kiri = kiri;
      }
      else
      {
        kirisum += input[maindex+1][kiri+1];
        kiri = kiri + 1;
      }
      if(kanansum + input[maindex+1][kanan] >= kanansum + input[maindex+1][kanan+1])
      {
        kanansum += input[maindex+1][kanan];
        kanan = kanan;
      }
      else
      {
        kanansum += input[maindex+1][kanan+1];
        kanan = kanan + 1;
      }
    }
    if(kanansum > kirisum)
    {
      System.out.println(kanansum);
    }
    else
    {
      System.out.println(kirisum);
    }
  }
}