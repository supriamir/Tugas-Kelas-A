import java.util.Scanner;
class ArrayNo7{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int urutan1 = 0;
    int urutan2 = 0;
    int urutan3 = 0;
    String orang1 = null;
    String orang2 = null;
    String orang3 = null;
    for(int i = 0 ; i < n ; i++){
      String nama = sc.next();
      int poin = sc.nextInt();
      if(poin > urutan3){
        urutan3 = poin;
        orang3 = nama;
        if(poin > urutan2)
        {
          urutan3 = urutan2;
          orang3 = orang2;
          urutan2 = poin;
          orang2 = nama;
          if(poin > urutan1){
            urutan2 = urutan1;
            orang2 = orang1;
            urutan1 = poin;
            orang1 = nama;
          }
        }
      }
    }
      System.out.println();
      System.out.println(urutan1 + urutan2 + urutan3);
      System.out.println(orang1);
      System.out.println(orang2);
      System.out.println(orang3);

  }
}