import java.util.Scanner;
class Nomor10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matriks[][] = new int[n][m];

        System.out.println("Input elemen matriks");
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                matriks[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriks");
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Hasil");
        for (int i = 0 ; i < m ; i++) {
            for (int j = n-1 ; j >= 0 ; j--) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}