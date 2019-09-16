import java.util.Scanner;
public class Loop2{
    public static void main(String[] args) {
        Scanner wan = new Scanner(System.in);
        System.out.print("N = ");
        int N=wan.nextInt();

        int sum=0;
        System.out.printf("jumlah faktor dari %s = ",N);

        for(int i=1;i<=N;i++){
            if(N%i==0){
                sum+=i;
                System.out.println(sum);
                

            }
        }
    }
}