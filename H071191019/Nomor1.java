import java.util.Scanner;
class Nomor1{
  public static void main(String[] args){
    Scanner fa = new Scanner(System.in);
    int x = fa.nextInt();
    System.out.printf("Faktor dari"+x+" adalah ");
    if(x > 0){
      for(int b = 1; b <= x; b++){
        if(x % b == 0){
          System.out.printf("%d ",b);
        }
      }
    }else if(x < 0){
      for(int b = 1; b <= (-1*x); b++){
        if(x % b == 0){
          System.out.printf("%d ",b);
        }
      }
    }else{
      System.out.printf("null");
    }
  }
}
