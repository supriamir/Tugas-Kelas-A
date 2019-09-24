import java.util.*;
public class Looping1{
    public static void main(String[] args) {
        Scanner lab = new Scanner(System.in);
        
        System.out.println("Masukan nilai N =");
        int N = lab.nextInt();
        System.out.printf("Faktor dari %s adalah \n= ",N);

        for (int i = 1; i <= N; i++){
            if (N % i == 0){
                System.out.print( i +" ");
            }
            
        }
    }
}