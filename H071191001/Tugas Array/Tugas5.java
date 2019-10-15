import java.util.Scanner;

class Tugas5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        int sum = 0;
        int rata[] = new int[t]; 
        int siswa[] = new int[t]; 
        
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int nilai[] = new int[n]; 
            
            for(int j = 0; j < n; j++){
                nilai[j] = sc.nextInt(); 
            }

        sum /= n;
        rata[i] = sum; 
        sum = 0;  
        
        for(int l = 0; l < n; l++){
             siswa[i] += nilai[l] < rata[i] ? 1:0; 
            }
        }
        for(int i = 0; i < t; i++){
            System.out.println(siswa[i]);
        }
    }
}