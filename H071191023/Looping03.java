import java.util.Scanner;
class Looping03{
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int N= in.nextInt();
    int sum = 0;
    System.out.println(" bilangan ganjil");

    for (int i=1; i<=N;i+=2){
    sum +=1;
    System.out.println(i + " ");  
    } 
    System.out.println("\n banyak bilangan ganjil="+sum);

    }
}
