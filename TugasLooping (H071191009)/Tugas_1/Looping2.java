import java.util.*;
public class Looping2{
    public static void main(String[] args) {
        Scanner main = new Scanner(System.in);
        
        System.out.print("Masukan nilai N\n= ");
        int N = main.nextInt();
        int sum = 0;
        System.out.printf("Hasil Pemfaktor atau sum dari angka %s adalah \n= ",N);
        
        for (int A = 1; A <= N; A++){
            if (N % A == 0){
            sum += A;
            }
        }
        System.out.println(sum);
    }
}