import java.util.Scanner;

public class TugasEnam{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    int n = userInput.nextInt();
    int input[][] = new int[n][n];
    for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j <= i ; j++){
          input[i][j] = userInput.nextInt();
        }
    }
    int maindex = 0;
    int leftdex = 0;
    int rightdex = 0;
    
    int jumlahKiri = input[maindex][leftdex] + input[maindex+1][leftdex];
    int jumlahKanan = input[maindex][rightdex] + input[maindex+1][rightdex+1];
    rightdex = 1;
    for(maindex = maindex + 1 ; maindex < n - 1 ; maindex++){
      if(jumlahKiri + input[maindex+1][leftdex] >= jumlahKiri + input[maindex+1][leftdex+1]){
        jumlahKiri += input[maindex+1][leftdex];
        leftdex = leftdex;
      }
      else{
        jumlahKiri += input[maindex+1][leftdex+1];
        leftdex = leftdex + 1;
      }
      if(jumlahKanan  + input[maindex+1][rightdex] >= jumlahKanan  + input[maindex+1][rightdex+1]){
        jumlahKanan  += input[maindex+1][rightdex];
        rightdex = rightdex;
      }
      else{
        jumlahKanan  += input[maindex+1][rightdex+1];
        rightdex = rightdex + 1;
      }
    }
    if(jumlahKanan  > jumlahKiri){
      System.out.println(jumlahKanan );
    }
    else{
      System.out.println(jumlahKiri);
    }
  }
}