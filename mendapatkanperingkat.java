import java.util.Scanner;
class mendapatkanperingkat {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int peringkat1 = 0;
    int peringkat2 = 0;
    int peringkat3 = 0;
    String nama1 = null;
    String nama2 = null;
    String nama3 = null;
    for(int i = 0 ; i < n ; i++) {
      String nama = sc.next();
      int score = sc.nextInt();
      if(score > peringkat3) {
        peringkat3 = score;
        nama3 = nama;
        if(score > peringkat2) {
          peringkat3 = peringkat2;
          nama3 = nama2;
          peringkat2 = score;
          nama2 = nama;
          if(score > peringkat1) {
            peringkat2 = peringkat1;
            nama2 = nama1;
            peringkat1 = score;
            nama1 = nama;
          }
        }
      }
    }
      System.out.println();
      System.out.println(peringkat1 + peringkat2 + peringkat3);
      System.out.println(nama1 + " " + peringkat1);
      System.out.println(nama2 + " " + peringkat2);
      System.out.println(nama3 + " " + peringkat3);

  }
}