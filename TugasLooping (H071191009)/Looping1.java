import java.util.*;
public class Looping1{
    public static void main(String[] args) {
        Scanner lab = new Scanner(System.in);
        
        System.out.println("Masukan nilai N =");
        int N = lab.nextInt();
        System.out.printf("Faktor dari %s adalah \n= ",N);

        for (int A = 1; A <= N; A++){
            if (N % A == 0){
                System.out.print( A +" ");
            }
            
        }
    }
}