  
import java.util.Scanner;
class MuridBermasalah
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt(); 
    int sum = 0;
    int avg[] = new int[t]; 
    int count[] = new int[t]; 
    for(int i = 0; i < t; i++)
    {
      int n = scan.nextInt();
      int nilai[] = new int[n]; 

      for(int j = 0; j < n; j++)
      {
        nilai[j] = scan.nextInt();
        sum += nilai[j];
      }
      sum /= n;
      avg[i] = sum; 
      sum = 0;
      count[i] = 0;
      for(int l = 0; l < n; l++)
      {
        count[i] += nilai[l] < avg[i] ? 1:0; 
      }
    }
    for(int i = 0; i < t; i++)
    {
      System.out.println(count[i]);
    }
  }
}