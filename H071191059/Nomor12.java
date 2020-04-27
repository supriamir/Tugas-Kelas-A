import java.util.Scanner;
class Nomor12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        String warna[] = new String[n];
        boolean ada = false;

        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
            warna[i] = sc.next();
        }
        
        int ukuranX = sc.nextInt();
        String warnaX = sc.next();

        for (int i = 0 ; i < n ; i++) {
            if (arr[i] == ukuranX && warna[i].equalsIgnoreCase(warnaX)) {
                ada = true;
                System.out.printf("Sepatu warna " + warna[i] + " dengan ukuran " + arr[i] + " berada pada index ke " + i);
            }
        }
        if (!ada) {
            System.out.printf("Sepatu warna " + warnaX + " dengan ukuran " + ukuranX + " tidak ada ");
        }
        sc.close();
    }
}