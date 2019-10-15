import java.util.Scanner;

//MATRIKS YANG DIPUTAR KE KIRI 90 DERAJAT

class Tugas10 {

    public static void main(String[] args) {
        Scanner sep = new Scanner (System.in);
        int m = sep.nextInt();
        int n = sep.nextInt();
        int matriks [][] = new int [m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriks [i][j] = sep.nextInt();
            }
            
        }
        for (int i = 0; i < n; i++) {
            for (int j = m-1; j >= 0; j--) {
                System.out.print(matriks[j][i] + " ");
            }
            System.out.println();
            
        }
        
    }
}