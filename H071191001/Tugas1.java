import java.util.Scanner;

class Tugas1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.print("Faktor dari " + N + " adalah ");
        for (int i = 1 ; i <= N; i++){
            if (N%i==0){
                System.out.print(i + " ");
            }
        }
    }
}