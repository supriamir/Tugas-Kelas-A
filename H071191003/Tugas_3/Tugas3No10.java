import java.util.Scanner;
class Tugas3No10{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int m = input.nextInt();
    int matrix[][] = new int[n][m];
    for(int i =0; i<n;i++){
      for (int j =0;j<m;j++ ) {
        matrix[i][j] = input.nextInt();
      }
    }

    System.out.println();
    for(int j = 0; j<n; j++){
      for (int i =0; i<m;i++){
        System.out.print(matrix[(n-1)-i][j]+ " ");
      }
      System.out.println();
    }
  }
}
