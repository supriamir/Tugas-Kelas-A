import java.util.*;
public class Looping3{
    public static void main(String[] args) {
        Scanner main = new Scanner(System.in);
        
        System.out.print("Masukan bilangan\nN = ");
        int N = main.nextInt();
        int sum = 0;
        System.out.println("Angka Bilangan Ganjil =");
        
        for (int A= 0; A <= N; A++){
            if (A % 2 == 1){
                System.out.print(A +" ");
                sum+=1;
            }
        }
        System.out.printf("\nBanyaknya bilangan ganjil =\n"+ sum);
    }
}