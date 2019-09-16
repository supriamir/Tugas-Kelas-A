import java.util.Scanner;
class TugasPP1{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("N = ");
        int N = sc.nextInt();
        System.out.print("Faktor dari " + N + " adalah ");
        for(int i = 1; i<=N; i++){
            if (N%i==0){
                System.out.print(i + ",");
            sc.close();
            }
        }
    }
}