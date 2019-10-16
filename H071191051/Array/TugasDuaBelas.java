import java.util.Scanner;

class TugasDuaBelas{
    public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    int n = userInput.nextInt();          //jumlah sepatu yang ada di toko
    int h[] = new int[n];                 //ukuran sepatu yang ada di toko
    String colour[] = new String[n];      //warna sepatu yang ada di toko
    boolean found = false;
    
    for(int i = 0; i < n; i++){
        h[i] = userInput.nextInt();         //ukuran sepatu pada indeks ke i
        colour[i] = userInput.next();       //warna sepatu pada indeks ke i
    }
    int x = userInput.nextInt();            //ukuran sepatu Winda
    String colourx = userInput.next();      //warna sepatu yang dicari
    
    for(int i = 0; i < n; i++){
        if(h[i] == x && colour[i].equalsIgnoreCase(colourx)){
            found = true;
            System.out.println("sepatu berwarna " + colour[i] + " berukuran " + h[i] + " ditemukan pada indeks ke " + i);
        }
        found = false;
        }
    }
}