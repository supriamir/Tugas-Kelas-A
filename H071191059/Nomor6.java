import java.util.Scanner;
class Nomor6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[][] = new int [n][n];

        for(int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j <= i ; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int p = 0;
        int r = 0;
        int l = 0;
        int sumL = array[p][l] + array[p + 1][l];
        int sumR = array[p][r] + array[p + 1][r + 1];
        r = 1;

        for (p = p + 1 ; p < n - 1 ; p++) {
            if (sumL + array[p + 1][l] >= sumL + array[p + 1][l + 1]) {
                sumL += array[p + 1][l];
            } else {
                sumL += array[p + 1][l + 1];
                l = l + 1;
            }
            if (sumR + array[p + 1][r] >= sumR + array[p + 1][r + 1]) {
                sumR += array[p + 1][r];
            } else {
                sumR += array[p + 1][r + 1];
                r = r + 1;
            }
        }
        if (sumR > sumL) {
            System.out.println(sumR);
        } else {
            System.out.println(sumL);
        }
        sc.close();
    }
}