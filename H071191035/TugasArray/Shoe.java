import java.util.Scanner;

class Shoe {
  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    
    System.out.print("Berapa jumlah sepatu yang ada di toko : ");
    int n = key.nextInt();
    int size[] = new int[n];
    String color[] = new String[n];

    System.out.println("Masukkan ukuran sepatu secara berurutan : ");
    for(int i = 0; i < n; i++) {
      size[i] = key.nextInt(); //ukuran sepatu pada indeks ke i
    }
    System.out.println("Masukkan warna secara berurutan : ");
    for (int i = 0; i < n; i++) {
        color[i] = key.next(); //warna sepatu pada indeks ke i
    }
    System.out.println("Ukuran dan warna sepatu apa yang dicari ?");
    int x = key.nextInt(); //ukuran sepatu yang dicari
    String y = key.next(); //warna sepatu yang dicari
    key.close();
    for(int i = 0; i < n; i++) {
      if(size[i] == x && color[i].equalsIgnoreCase(y)) {
        System.out.println("Sepatu berwarna " + color[i] + " berukuran " + size[i] + " ditemukan pada indeks ke " + i);
      }
    }
  }
}