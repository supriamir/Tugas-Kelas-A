import java.util.Scanner;
class Tugasloop3{
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        System.out.print("Input batas bilangan = ");
        int N=key.nextInt();
        int sum=0;
        System.out.print("Bilangan ganjil = ");
        for (int j=0;j<=N;j++){
            if(j%2==1){
                System.out.print(j+" ");
                sum+=1;
            }
        }
        System.out.printf("\nBanyaknya bilangan ganjil = "+sum);
    }
}