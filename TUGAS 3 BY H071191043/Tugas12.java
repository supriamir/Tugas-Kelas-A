import java.util.Scanner;
class Tugas12{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ukuran[] = new int[n];
        String warna[] = new String[n];
        boolean found = false;
        
        for (int i = 0; i < n; i++){
            ukuran[i] = sc.nextInt();
            warna[i] = sc.next();
        }
        int x = sc.nextInt();
        String warnax = sc.next();
        for (int i = 0; i < n; i++){
            found = true;
            System.out.println("Sepatu berwarna " + warna[i] + " berukuran " + ukuran[i] + " ditemukan pada indeks ke " + i);
        }
    }
}