import java.util.Scanner;
class Nomor13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int sum = 0;
        int murid[] = new int[t];
        int nilai[] = new int[t];

        for (int i = 0 ; i < t ; i++) {
            int n = sc.nextInt();
            int skor[] = new int[n];
            
            for (int j = 0 ; j < n ; j++) {
                skor[j] = sc.nextInt();
                sum += skor[j];
            }
            sum /= n;
            murid[i] = sum;
            sum = 0;
            nilai[i] = 0;

            for (int a = 0 ; a < n ; a++) {
                nilai[i] += nilai[a] < murid[i] ? 1:0;
            }
        } 
        for (int i = 0 ; i < t ; t++) {
            System.out.println(murid[i]);
        }
        sc.close();
    }
}