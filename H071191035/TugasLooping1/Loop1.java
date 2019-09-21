import java.util.Scanner;

class Loop1 {

  public static void main(String[] args) {

    Scanner obj = new Scanner(System.in);
    System.out.println("Input number : ");
    int a = obj.nextInt();
    System.out.printf("~~~~~~~~~\n%d memiliki faktor yaitu %n",a);
    if(a > 0) {
      for(int i = 1; i <= a; i++) {
        if(a % i == 0) {
          System.out.printf("%d ",i);
        }
      }
    } else if(a < 0) {
        for(int i = 1; i <= (-1*a) ; i++) {
            if(a % i == 0) {
          System.out.printf("%d ",i);
        }
      }
    } else {
      System.out.print("...");
    }
  }
}
