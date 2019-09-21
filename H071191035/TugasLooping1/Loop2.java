import java.util.Scanner;

class Loop2 {

  public static void main(String[] args) {

    Scanner obj = new Scanner(System.in);

    System.out.println("Input number : ");
    int a = obj.nextInt(), sum = 0;
    for(int i = 1; i <= a; i++) {
      if(a % i == 0) {
        sum += i;
      }
    } System.out.printf("Jumlah faktor = %d",sum);
  }
}