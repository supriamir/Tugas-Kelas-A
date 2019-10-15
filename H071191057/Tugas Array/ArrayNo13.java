import java.util.Scanner;
class ArrayNo13{
  public static void main(String[] args)
  {
    Scanner alk = new Scanner(System.in);
    int t = alk.nextInt(); // jumlah kasus
    int jumlah = 0;
    int rata[] = new int[t]; // rata-rata dalam setiap kasus
    //memasukkan nilai nilai mahasiswa sebanyak kasus
    int banyak[] = new int[t]; //banyak mahasiswa yang bermasalah tiap kasus
    for(int i = 0; i < t; i++){
      int n = alk.nextInt();
      int nilai[] = new int[n]; //nilai mahasiswa sebanyak n mahasiswa

      for(int j = 0; j < n; j++){
        nilai[j] = alk.nextInt(); //input nilai mahasiswa
        jumlah += nilai[j];
      }
      jumlah /= n;
      rata[i] = jumlah; //rata2 nilai mahasiswa dalam setiap kasus
      jumlah = 0;
      banyak[i] = 0;
      for(int l = 0; l < n; l++){
        banyak[i] += nilai[l] < rata[i] ? 1:0; //menghitung jumlah mahasiswa yang bermasalah
      }
    }
    for(int i = 0; i < t; i++){
      System.out.println(banyak[i]);
    }
  }
}