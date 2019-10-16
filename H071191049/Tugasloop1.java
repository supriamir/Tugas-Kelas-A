import java.util.Scanner;
class Tugasloop1{
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        System.out.print("N = ");
        int N=key.nextInt();
        System.out.printf("Faktor dari %s adalah = ",N);
        for (int j=1;j<=N;j++){
            if(N%j==0){
                System.out.print(j + " ");
            }
        }
    }
}