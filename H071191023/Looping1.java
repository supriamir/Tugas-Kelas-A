import java.util.Scanner;
 public class Looping1{
public static void main(String[] args) {
    Scanner input =new Scanner (System.in);
    int N= input.nextInt();
    System.out.print("faktor dari"+ N +"adalah ");

    for (int i= 1; i<=N; i++){
    if (N%i==0){
        System.out.print(i+" ");
        

    }
}
}
 }
