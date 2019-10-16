import java.util.*;
class Tugas11{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int N = n.nextInt();
        int a[] = new int[N];
        String warna[] = new String[N];
        boolean found = false;
        for (int i = 0; i < N; i++){
            a[i] = n.nextInt();
            warna[i] = n.next();
        }
        int y = n.nextInt();
        String warnay = n.next();
        for (int i = 0; i < N; i++){
            if (a[i] == y && warna[i].equalsIgnoreCase(warnay)){
                found = true;
                System.out.println("sepatu berwarna" + warna[i] + "berukuran" + a[i] + "ditemukan pada indeks ke" + i);
            }
            found = false;
        }
    }
}