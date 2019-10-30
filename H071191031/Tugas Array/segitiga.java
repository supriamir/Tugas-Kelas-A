import java.util.Scanner;
class segitiga {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int input[][] = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i ; j++) {
        input[i][j] = sc.nextInt();
      }
    }
    int maindex = 0;
    int leftdex = 0;
    int rightdex = 0;
    int leftSum = input[maindex][leftdex] + input[maindex+1][leftdex];
    int rightSum = input[maindex][rightdex] + input[maindex+1][rightdex+1];
    rightdex = 1;
    for (maindex = maindex+1; maindex < n-1; maindex++) {
      if (leftSum + input[maindex][leftdex] >= leftSum + input[maindex+1][leftdex+1]) {
        leftSum += input[maindex+1][leftdex];
        leftdex = leftdex;
      }
      else {
        leftSum += input[maindex+1][leftdex+1];
        leftdex = leftdex + 1;
      }
      if (rightSum + input[maindex+1][rightdex] >= rightSum + input[maindex+1][rightdex+1]) {
        rightSum += input[maindex+1][rightdex];
        rightdex = rightdex;
      }
      else {
        rightSum += input[maindex+1][rightdex+1];
        rightdex = rightdex + 1;
      }
    }
    if (rightSum > leftSum) {
      System.out.println(rightSum);
    }
    else {
      System.out.println(leftSum);
    }
  }
}