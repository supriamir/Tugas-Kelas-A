import java.util.Scanner;

class TugasNo13 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
    
        System.out.print("Masukkan banyaknya kasus : ");
        int x = inp.nextInt();
        int average[] = new int[x]; // rata-rata dalam setiap kasus, memasukkan nilai nilai mahasiswa sebanyak kasus
        int student[] = new int[x]; //banyak mahasiswa yang bermasalah tiap kasus
        int sum = 0;

        System.out.print("Berapa jumlah mahasiswa : ");
        for(int i = 0; i < x; i++) {
            int n = inp.nextInt();
            int nilai[] = new int[n]; //nilai mahasiswa sebanyak n mahasiswa

            System.out.print("Masukkan nilai : ");
            for(int j = 0; j < n; j++) {
                nilai[j] = inp.nextInt(); //input nilai mahasiswa
                sum += nilai[j];
            }

            sum /= n;
            average[i] = sum; //rata-rata nilai mahasiswa dalam setiap kasus
            sum = 0;
            student[i] = 0;

            for(int k = 0; k < n; k++) {
                student[i] += nilai[k] < average[i] ? 1 : 0; //menghitung jumlah mahasiswa yang bermasalah
            }   
        }

        for(int i = 0; i < x; i++) {
            System.out.println(student[i]);
        }
        inp.close();
    }
}