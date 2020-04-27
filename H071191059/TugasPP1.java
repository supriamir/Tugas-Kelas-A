import java.util.Scanner;
class TugasPP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        
        System.out.printf("Faktor dari %d adalah = ", n);
        for (int i = 1; i <= n; i++) {
            if (n %i==0) {
                System.out.printf("%d, " , i); //%d untuk menampilkan output integer
            }
        } sc.close();
    }
}