import java.util.Scanner;

class Tugas4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sepatu = sc.nextInt();
        int size[] = new int[sepatu];
        String warna[] = new String[sepatu];
        boolean cari = false;

        for (int i = 0; i < sepatu; i++) {
        size[i] = sc.nextInt();
        warna[i] = sc.next();
        }

        int size2 = sc.nextInt();
        String warna2 = sc.next();
        for (int i = 0; i < sepatu; i++) {
            if (size[i] == size2 && warna[i].equalsIgnoreCase(warna2)) {
                cari = true;
                System.out.println("sepatu warna " + warna[i] + " berukuran " + size[i] + " ditemukan pada indeks ke " + i);
            }
        }
    }
}