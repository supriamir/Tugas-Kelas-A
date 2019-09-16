import java.util.Scanner;
public class Loop1{
    public static void main(String[] args) {
        Scanner wan = new Scanner(System.in);
        System.out.print("N = ");
        int N = wan.nextInt();
        System.out.printf("Faktor dari %s adalah = ", N);
        for (int i=1;i<=N;i++){
            if(N%i==0){
                System.out.print(i + " ");

            }
        }
    }
}