import java.util.Scanner;
class nomor6{
  public static void main(String[] args){
    Scanner ap = new Scanner(System.in);
    int n = ap.nextInt(); //jumlah sepatu yang ada di toko
    int h[] = new int[n]; //ukuran sepatu yang ada di toko
    String colour[] = new String[n]; //warna sepatu yang ada di toko
    boolean found = false;

    for(int i = 0; i < n; i++){
      h[i] = ap.nextInt(); //ukuran sepatu pada indeks ke i
      colour[i] = ap.next(); //warna sepatu pada indeks ke i
    }

    int x = ap.nextInt(); //ukuran sepatu Winda
    String colourx = ap.next(); //warna sepatu yang dicari
    for(int i = 0; i < n; i++)
    {
      if(h[i] == x && colour[i].equalsIgnoreCase(colourx)){
        found = true;
        System.out.println("sepatu berwarna " + colour[i] + " berukuran " + h[i] + " ditemukan pada indeks ke " + i);
      }
      found = false;
    }
  }
}