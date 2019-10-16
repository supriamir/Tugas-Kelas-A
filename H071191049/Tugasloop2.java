import java.util.Scanner;
class Tugasloop2{
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        System.out.print("N = ");
        int N=key.nextInt();
        int sum=0;
        System.out.printf("Jumlah faktor dari %s = ",N);
        for(int j=1;j<=N;j++){
            if(N%j==0){
            sum+=j;
            }
        }
        System.out.println(sum);
    }
}