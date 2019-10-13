import java.util.Scanner;
class Tugas1No7{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input jumlah anggota kelompok : ");
    int inputs = input.nextInt();
    String indi[] = new String[inputs];
    int indiScore[] = new int[inputs];
    System.out.println("Input nama dan point masing-masing anggota kelompok : ");
    for(int i =0;i<inputs;i++){
      indi[i] = input.next();
      indiScore[i] = input.nextInt();
    }
    int topScorers[][] = new int[3][2];
    for (int i=0;i<inputs ;i++ ) {
      for (int j=0; j<3;j++){
        if(indiScore[i]>topScorers[j][1]){
          for(int k = j; k<3; k++){
              topScorers[j+1][0] = topScorers[j][0];
              topScorers[j+1][1] = topScorers[j][1];

          }
          topScorers[j][0] = i;
          topScorers[j][1] = indiScore[i];
          break;
        }
      }
    }
    int accumulatedScore =0;
    for (int i =0;i<3 ;i++ ) {
      accumulatedScore += topScorers[i][1];
    }
    System.out.print("\nPoint total : ");
    System.out.println(accumulatedScore);
    for (int i =0;i<3 ;i++ ) {
      System.out.println(indi[topScorers[i][0]]);
    }
  }
}
