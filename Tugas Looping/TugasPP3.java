import java.util.Scanner;
class TugasPP3{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        System.out.print("Bilangan ganjil = ");
        int sum = 0;
        for(int i = 1; i<=N; i++){
                if (i%2==1){
                    System.out.print(i + ",");
                    sum += 1;
                }
        }
        System.out.print("\nBanyak bilangan ganjil = " + sum);
    }
}