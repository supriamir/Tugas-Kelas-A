import java.util.Scanner;
class Tugas13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //jumlah kasus
        int sum = 0;
        int ratarata[] = new int [t];

        int mahasiswa [] = new int [t]; //mahasiswa bermasalah
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int nilai [] = new int [n]; //nilai mahasiswa sebanyak n mahasiswa

            for (int j = 0; j < n; j++) {
                nilai[j] = sc.nextInt(); //input nilai mahasiswa 
                sum += nilai[j];                
            }

            sum /= n;
            ratarata[i] = sum; //rata2 nilai setiap kasuss
            sum = 0;
            mahasiswa[i] = 0;
            
            for (int l = 0; l < n; l++) {
                mahasiswa[i] += nilai[l] < ratarata[i] ? 1:0; //jumlah mahasiswa yang bermasalah
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(mahasiswa[i]);
        }
    }
}