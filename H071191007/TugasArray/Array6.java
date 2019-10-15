import java.util.Scanner;
class Array6 {
  public static void main(String[] args) {
    Scanner array = new Scanner(System.in);
    int n = array.nextInt();
    int input[][] = new int[n][n];
    for(int i = 0 ; i < n ; i++) {
      for(int j = 0 ; j <= i ; j++) {
        input[i][j] = array.nextInt();
      }
    }
    int indeksUtama = 0;
    int indeksKiri = 0;
    int indeksKanan = 0;
    int jumlahKiri = input[indeksUtama][indeksKiri] + input[indeksUtama+1][indeksKiri];
    int jumlahKanan= input[indeksUtama][indeksKanan] + input[indeksUtama+1][indeksKanan+1];
    indeksKanan = 1;
    for(indeksUtama = indeksUtama + 1 ; indeksUtama < n - 1 ; indeksUtama++) {
      if(jumlahKiri + input[indeksUtama+1][indeksKiri] >= jumlahKiri + input[indeksUtama+1][indeksKiri+1]) {
        jumlahKiri += input[indeksUtama+1][indeksKiri];
        indeksKiri = indeksKiri;
      }
      else{
        jumlahKiri += input[indeksUtama+1][indeksKiri+1];
        indeksKiri = indeksKiri + 1;
      }
      if(jumlahKanan + input[indeksUtama+1][indeksKanan] >= jumlahKanan + input[indeksUtama+1][indeksKanan+1]) {
        jumlahKanan += input[indeksUtama+1][indeksKanan];
        indeksKanan = indeksKanan;
      }
      else {
        jumlahKanan += input[indeksUtama+1][indeksKanan+1];
        indeksKanan = indeksKanan + 1;
      }
    }
    if(jumlahKanan > jumlahKiri) {
      System.out.println(jumlahKanan);
    }
    else {
      System.out.println(jumlahKiri);
    }
  }
}
