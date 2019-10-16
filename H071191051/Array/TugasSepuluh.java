import java.util.Scanner;

public class TugasSepuluh{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int m = userInput.nextInt();
        int n = userInput.nextInt();
        int matrix[][] = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
        matrix[i][j] = userInput.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = m-1; j >= 0; j--){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}