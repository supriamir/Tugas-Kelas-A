import java.util.Scanner;
class Array10 {
  public static void main(String[] args) {
    Scanner array = new Scanner(System.in);
    int m = array.nextInt();
    int n = array.nextInt();
    int matriks[][] = new int[m][n];
    for(int i = 0; i < m; i++) {
      for(int j = 0; j < n; j++) {
        matriks[i][j] = array.nextInt();
      }
    }
    for(int i = 0; i < n; i++) {
      for(int j = m-1; j >= 0; j--) {
        System.out.print(matriks[j][i] + " ");
      }
      System.out.println();
    }
  }
}