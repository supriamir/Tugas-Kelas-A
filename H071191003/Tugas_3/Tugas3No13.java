import java.util.Scanner;
class Tugas3No13{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input banyak kasus : ");
    int t = input.nextInt();
    int belowAverage[] = new int[t];
    for(int i=0;i<t;i++){
      System.out.printf("Input jumlah murid di kelas, pada kasus %d : ",i+1);
      int n = input.nextInt();
      int studentsScore[] = new int[n];
      int studentsAccumulativeScore = 0 ;
      System.out.println("Input nilai murid-murid : ");
      for (int j =0;j<n ;j++ ) {
        studentsScore[j] = input.nextInt();
        studentsAccumulativeScore += studentsScore[j];

      }
      for (int j = 0;j<n ;j++ ) {
        if(studentsScore[j]<(double)studentsAccumulativeScore/n){
          belowAverage[i] ++;
        }
      }
    }
    for (int i =0;i<t;i++) {
      System.out.printf("Jumlah siswa yang memiliki nilai dibawah rata-rata pada kasus %d : %d\n", i+1,belowAverage[i]);
    }
  }
}
