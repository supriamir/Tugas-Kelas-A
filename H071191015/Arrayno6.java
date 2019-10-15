import java.util.Scanner;
class Arrayno6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [][] arr = new int[n][n];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        int indeksUtama = 0;
        int indeksKiri = 0;
        int indeksKanan = 0;
        int jumlahKiri = arr[indeksUtama][indeksKiri] + arr[indeksUtama+1][indeksKiri];
        int jumlahKanan = arr[indeksUtama][indeksKanan] + arr[indeksUtama+1][indeksKanan+1];
        indeksKanan = 1;
        for (indeksUtama = indeksUtama+1; indeksUtama < n-1; indeksUtama++) {
            if (jumlahKiri + arr[indeksUtama+1][indeksKiri] >= jumlahKiri + arr[indeksUtama+1][indeksKiri+1]) {
                jumlahKiri += arr[indeksUtama+1][indeksKiri];
                indeksKiri = indeksKiri;
            } else {
                jumlahKiri += arr[indeksUtama+1][indeksKiri+1];
                indeksKiri = indeksKiri +1;
            }
            if (jumlahKanan + arr[indeksUtama+1][indeksKanan] >= jumlahKanan + arr[indeksUtama+1][indeksKanan+1]) {
                jumlahKanan += arr[indeksUtama+1][indeksKanan];
                indeksKanan = indeksKanan;
            } else {
                jumlahKanan += arr[indeksUtama+1][indeksKanan+1];
                indeksKanan = indeksKanan+1;
            }
        }

        if (jumlahKanan>jumlahKiri) {
            System.out.println(jumlahKanan);
        } else {
            System.out.println(jumlahKiri);
        }
    }
}