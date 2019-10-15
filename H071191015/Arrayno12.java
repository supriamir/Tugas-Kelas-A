import java.util.Scanner;
class Arrayno12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //jumlah sepatu yang ada di toko
        int h[] = new int[n]; //ukuran sepatu yang ada di toko
        String colour[] = new String[n]; //warna sepatu yang ada di toko
        boolean found = false;
        for (int i = 0; i < n; i++) {
            h[i] = input.nextInt(); //ukuran sepatu pada indeks ke i
            colour[i] = input.nextLine(); //warna sepatu pada indeks ke i
        }

        int x = input.nextInt(); //ukuran sepatu Winda
        String colourx = input.nextLine(); //warna sepatu Winda
        for (int i = 0; i < n; i++) {
            if (h[i]==x && colour[i].equalsIgnoreCase(colourx)) {
                found = true;
                System.out.println("Sepatu Berwarna " + colour[i] + " berukuran " + h[i] + " ditemukan pada indeks ke " + i);
            }
            found = false;
        }
    }
}