import java.util.Scanner;

class Triangle {
  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);

    System.out.print("Input height : ");
    int n = key.nextInt();
    int triangle[][] = new int[n][n];
    
    System.out.println("Input triangle value : ");
    for(int i = 0 ; i < n ; i++) {
      for(int j = 0 ; j <= i ; j++) {
        triangle[i][j] = key.nextInt();
      }
    }
    key.close();
    int peak = 0, left = 0, right = 0;
    int sumLeft = triangle[peak][left] + triangle[peak+1][left];
    int sumRight = triangle[peak][right] + triangle[peak+1][right+1]; right = 1;

    for(peak = peak + 1; peak < n - 1; peak++) {
      if(sumLeft + triangle[peak + 1][left] >= sumLeft + triangle[peak + 1][left + 1]) {
        sumLeft += triangle[peak + 1][left];
      } else {
        sumLeft += triangle[peak + 1][left + 1];
        left = left + 1;
      } 
      if(sumRight + triangle[peak + 1][right] >= sumRight + triangle[peak + 1][right + 1]) {
        sumRight += triangle[peak + 1][right];
      } else {
        sumRight += triangle[peak + 1][right + 1];
        right = right + 1;
      }
    } if(sumRight > sumLeft) {
      System.out.println(sumRight);
    } else {
      System.out.println(sumLeft);
    }
  }
}