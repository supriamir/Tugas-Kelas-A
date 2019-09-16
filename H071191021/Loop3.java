import java.util.Scanner;
class Loop3{
    public static void main(String[] args) {
        Scanner wan=new Scanner(System.in);
        System.out.print("Input bilangan = ");
        int N = wan.nextInt();
        int sum=0;
        System.out.println("Bilangan ganjil = ");
        for(int i=0;i<=N;i++){
            if(i%2==1){
                System.out.println(i+" ");
                sum+=1;
            }
        }
        System.out.println("\nbanyaknya bilangan ganjil ="+sum);
    }
}