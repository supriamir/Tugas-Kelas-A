import java.util.Scanner;
class ArrayNo10{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int matrice[][] = new int[m][n];
    for(int i = 0; i < m; i++)
    {
      for(int j = 0; j < n; j++)
      {
        matrice[i][j] = sc.nextInt();
      }
    }
    for(int i = 0; i < n; i++)
    {
      for(int j = m-1; j >= 0; j--)
      {
        System.out.print(matrice[j][i] + " ");
      }
      System.out.println();
    }
  }
}