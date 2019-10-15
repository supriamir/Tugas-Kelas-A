import java.util.Scanner;

class ClockwiseRotationMatrix {
  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    System.out.println("Input row and column : ");
    int m = key.nextInt();
    int n = key.nextInt();
    int matrix[][] = new int[m][n];
    
    System.out.println("Input element : ");
    for(int i = 0; i < m; i++) {
      for(int j = 0; j < n; j++) {
        matrix[i][j] = key.nextInt();
      }
    }
    System.out.println("Matrix : ");
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println("Clockwise rotation : ");
    for(int i = 0; i < n; i++) {
      for(int j = m-1; j >= 0; j--) {
        System.out.print(matrix[j][i] + " ");
      }
      System.out.println();
    }
    key.close();
  }
}