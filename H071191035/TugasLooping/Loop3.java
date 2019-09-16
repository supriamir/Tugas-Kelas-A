import java.util.Scanner;

class Loop3 {
  public static void main(String[] args) {

    Scanner obj = new Scanner(System.in);
    System.out.println("Input number : ");
    int n = obj.nextInt();
    int ganjil = 0;
    System.out.print("Bilangan ganjil = ");
    if(n > 0) {
      for(int i = 1; i <= n; i++) {
        if(i % 2 != 0) {
            System.out.printf("%d ",i);
            ganjil++;
        }
      }
    } else if(n < 0) {
        for(int i = 0; i >= n ; i--)
          if(i % 2 != 0) {
            System.out.printf("%d ",i);
            ganjil++;
      }
    } else {
      System.out.print("...");
    }
    System.out.printf("\nBanyak bilangan ganjil = %d",ganjil);
  }
}