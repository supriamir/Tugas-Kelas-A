import java.util.Scanner;
class Array7 {
  public static void main(String[] args) {
    Scanner ar = new Scanner(System.in);
    int n = ar.nextInt();
   
    int ranking1 = 0;
    int ranking2 = 0;
    int ranking3 = 0;
    String nama1 = null;
    String nama2 = null;
    String nama3 = null;
    for(int i = 0 ; i < n ; i++) {
      String nama = ar.next();
      int nilai = ar.nextInt();
      if(nilai > ranking3) {
        ranking3 = nilai;
        nama3 = nama;
        if(nilai > ranking2) {
          ranking3 = ranking2;
          nama3 = nama2;
          ranking2 = nilai;
          nama2 = nama;
          if(nilai > ranking1) {
            ranking2 = ranking1;
            nama2 = nama1;
            ranking1 = nilai;
            nama1 = nama;
          }
        }
      }
    }
      System.out.println();
      System.out.println(ranking1 + ranking2 + ranking3);
      System.out.println(nama1);
      System.out.println(nama2);
      System.out.println(nama3);

  }
}
