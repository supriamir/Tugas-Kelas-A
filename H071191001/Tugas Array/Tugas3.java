import java.util.Scanner;

class Tugas3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr [][] = new int[n][m];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
               arr [i][j] = sc.nextInt();
            }
            
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = arr.length - 1; j >= 0; j--) {
                System.out.print(arr[j][i] + " ");
            }
        }
    }
}