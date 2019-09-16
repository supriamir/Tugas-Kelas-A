import java.util.Scanner;
class Tugas1 {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int N = ar.nextInt();
         System.out.print("Faktor dari " + N + " adalah " + " ");

        for (int j = 1; j <= N; j++) {
            if (N % j == 0) {
                System.out.print(j + ",");
             

            }
        }

   
    }
}