import java.util.Scanner;
class tugasmid{
    public static void main(String[] args) {
        Scanner oh = new Scanner (System.in);
        int a = oh.nextInt();
        int sum = 0;
        int tr[] = new int[a];
        int cit[] = new int[a];
        for (int i = 0; i < a; i++) {
            int n = oh.nextInt();
            int nilai[] = new int[n];
            for (int j = 0; j < n; j++) {
                
            }
            sum /= n;
            tr[i] = sum;
            sum = 0;   
            cit[i] = 0;
            for (int l = 0; l < n; l++) {
             cit[i] += nilai[l] < tr[i] ? 1:0;
                
            }
            
        }
        for (int i = 0; i < a; i++) {
            System.out.println(cit[i]);
        }

    }
}