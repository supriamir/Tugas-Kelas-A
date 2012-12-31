import java.util.Scanner;
class ArrayNo12{
  public static void main(String[] args){
    Scanner alk = new Scanner(System.in);
    int N = alk.nextInt(); //jumlah sepatu yang ada di toko
    int h[] = new int[n]; //ukuran sepatu yang ada di toko
    String warna[] = new String[n]; //warna sepatu yang ada di toko
    boolean sepatu = false;
    for(int i = 0; i < N; i++){
      h[i] = alk.nextInt(); //ukuran sepatu pada indeks ke i
      warna[i] = alk.next(); //warna sepatu pada indeks ke i
    }
    int x = alk.nextInt(); //ukuran sepatu Winda
    String warnax = alk.next(); //warna sepatu yang dicari
    for(int i = 0; i < N; i++){
      if(h[i] == x && warna[i].equalsIgnoreCase(warnax)){
        sepatu = true;
        System.out.println("sepatu berwarna " + warna[i] + " berukuran " + h[i] + " ditemukan pada indeks ke " + i);
      }
      sepatu = false;
    }
  }
}