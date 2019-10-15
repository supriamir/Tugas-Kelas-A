import java.util.Scanner;
class TugasNo12 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("input panjang array");
        int n = inp.nextInt(); 
        int arr[] = new int[n]; 
        String colour[] = new String[n]; 
        boolean find = false;

        for(int i = 0; i < n; i++) {
            arr[i] = inp.nextInt(); //input ukuran sepatu
            colour[i] = inp.next(); //input warna sepatu
        }

        int sizex = inp.nextInt(); //input ukuran sepatu yang dicari
        String colourx = inp.next(); //input warna sepatu yang dicari
        for(int i = 0; i < n; i++) {
            if(arr[i] == sizex && colour[i].equalsIgnoreCase(colourx)) {
                find = true;
                System.out.printf("sepatu berwarna " + colour[i] + " berukuran " + arr[i] + " ditemukan pada indeks ke " + i);
            }
        }
        if(!find){
            System.out.println("sepatu berwarna " + colourx + " berukuran " + sizex + " tidak ditemukan");
        }
        inp.close();
    }
}