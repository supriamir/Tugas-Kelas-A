import java.util.Scanner;
class Tugas13{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input jumlah kasus = ");
        int t = sc.nextInt();
        int jumlah = 0;
        int rata[] = new int[t];//rata - rata nilai mahasiswa
        int bermasalah[] = new int[t];

        if (t <= 100){
            for (int i = 0; i < t; i++){
                System.out.println("Input jumlah murid = ");
                int n = sc.nextInt();
                int nilai[] = new int[n];
                for (int j = 0; j < n ; j++){
                    nilai[j] = sc.nextInt();
                    jumlah += nilai[j];
                }
                jumlah = jumlah / n;
                rata[i] = jumlah;
                jumlah = 0;
                bermasalah[i] = 0;
                System.out.println(rata[i]);
                for (int l = 0; l < n ; l++){
                    bermasalah[i] += nilai[l] < rata[i] ? 1 : 0;
                }
            }
            for (int i = 0; i < t ; i++){
                System.out.println(bermasalah[i]);
            }
        }
    }
}