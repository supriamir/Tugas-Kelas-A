import java.util.Scanner;
class nomor10{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int m = in.nextInt();
    int n = in.nextInt();
    int matrix[][] = new int[m][n];
    for(int i = 0; i < m; i++)
    {
      for(int j = 0; j < n; j++)
      {
        matrix[i][j] = in.nextInt();
      }
    }
    for(int i = 0; i < n; i++)
    {
      for(int j = m-1; j >= 0; j--)
      {
        System.out.print(matrix[j][i] + " ");
      }
      System.out.println();
    }
  }
}