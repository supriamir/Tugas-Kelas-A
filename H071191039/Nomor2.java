import java.util.Scanner;

class Nomor2 { 

public static void main(String[] args) { 
  
    Scanner Nomor2 = new Scanner(System.in);
    int a = Nomor2.nextInt();
    int sum = 0;
    for(int i = 1; i <= a; i++)
    {
      if(a % i == 0)
      {
        sum += i;
      }
    }
    System.out.printf("sum = %d",sum);
  }
}