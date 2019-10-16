import java.util.*;
class Tugas13{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int N = n.nextInt();
        int sum = 0;
        int a[] = new int[N];
        int count[] = new int[N];
        for (int i = 0; i < N; i++){
            int M = n.nextInt();
            int nilai[] = new int[M];
            for (int j = 0; j < M; j++){
                nilai[j] = n.nextInt();
                sum += nilai[j];
            }
            sum /= M;
            a[i] = sum;
            sum = 0;
            count[i] = 0;
            for (int l = 0; i < M; l++){
                count[i] += nilai[l] < a[i] ? 1 : 0;
            }
        }
        for (int i = 0; i < N; i++){
            System.out.println(count[i]);
        }
    }
}