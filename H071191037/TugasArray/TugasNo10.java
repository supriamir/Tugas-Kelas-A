import java.util.Scanner;

class TugasNo10 {
  public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Input row and column : ");
        int m = inp.nextInt();
        int n = inp.nextInt();
        int arr[][] = new int[m][n];
    
        System.out.println("Input element : ");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = inp.nextInt();
            }
        }
        System.out.println("arr : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Clockwise rotation : ");
        for(int i = 0; i < n; i++) {
            for(int j = m-1; j >= 0; j--) {
                System.out.print(arr[j][i] + " ");
            }
        System.out.println();
        }
        inp.close();
    }
}