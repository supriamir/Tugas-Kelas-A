import java.util.Scanner;
class Tugas1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        System.out.println("Faktor dari " + N + " : ");

        for (int i = 1; i <= N; i++){
            if (N % i == 0){
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}