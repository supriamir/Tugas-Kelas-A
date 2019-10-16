import java.util.*;
class Tugas10{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int M = n.nextInt();
        int N = n.nextInt();
        int matriks[][] = new int[M][N];
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                matriks[i][j] = n.nextInt();
            }
        }
        for (int i = 0; i < N; i++){
            for (int j = M-1; j >= 0; j--){
                System.out.print(matriks[j][i] + " ");
            }
            System.out.println();
        }
    }
}