import java.util.Scanner;
class Arrayno13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt(); //jumlah kasus
        int sum = 0;
        int avg[] = new int[t]; //rata-rata dalam setiap kasus
        //memasukkan nilai mahasiswa sebanyak kasus
        int count[] = new int[t]; //banyak mahasiswa yang bermasalah tiap kasus
        
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int nilai[] = new int[n]; //nilai mahasiswa sebanyak n mahasiswa

            for (int j = 0; j < n; j++) {
                nilai[j] = input.nextInt(); //input nilai mahasiswa
                sum += nilai[j];
            }

            sum /= n;
            avg[i] = sum; //rata2 nilai mahasiswa dalam setiap kasus
            sum = 0;
            count[i] = 0;
            for (int k = 0; k < n; k++) {
                count[i] += nilai[k] < avg[i] ? 1:0; //menghitung jumlah mahasiswa yang bermasalah
            }
        }

        for (int i = 0; i < t; i++) {
            System.out.println(count[i]);
        }
    }
}