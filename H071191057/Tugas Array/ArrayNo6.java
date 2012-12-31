import java.util.Scanner;
class ArrayNo6{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int input[][] = new int[N][N];
    for(int i = 0 ; i < N ; i++){
      for(int j = 0 ; j <= i ; j++){
        input[i][j] = sc.nextInt();
      }
    }
    int indeksUtama = 0;
    int indeksKiri = 0;
    int indeksKanan = 0;
    int jumlahKiri = input[indeksUtama][indeksKiri] + input[indeksUtama + 1][indeksKiri];
    int jumlahKanan = input[indeksUtama][indeksKanan] + input[indeksUtama + 1][indeksKanan + 1];
    indeksKanan = 1;
    for(indeksUtama = indeksUtama + 1 ; indeksUtama < N - 1 ; indeksUtama++)
    {
      if(jumlahKiri + input[indeksUtama+1][indeksKiri] >= jumlahKiri + input[indeksUtama + 1][indeksKiri + 1])
      {
        jumlahKiri += input[indeksUtama+1][indeksKiri];
        indeksKiri = indeksKiri;
      } else {
        jumlahKiri += input[indeksUtama+1][indeksKiri + 1];
        indeksKiri = indeksKiri + 1;
      }
      if(jumlahKanan + input[indeksUtama + 1][indeksKanan] >= jumlahKanan + input[indeksUtama + 1][indeksKanan + 1])
      {
        jumlahKanan += input[indeksUtama+1][indeksKanan];
        indeksKanan = indeksKanan;
      }
      else
      {
        jumlahKanan += input[indeksUtama+1][indeksKanan+1];
        indeksKanan = indeksKanan + 1;
      }
    }
    if(jumlahKanan > jumlahKiri)
    {
      System.out.println(jumlahKanan);
    }
    else
    {
      System.out.println(jumlahKiri);
    }
  }
}