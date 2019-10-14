import java.util.Scanner;
class Tugaslab3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan angka");
        int angka = scan.nextInt();
        int jumlah = 0;

        for ( int a = 0 ; a <= angka ; a++){
            if ( a % 2 == 1){
                System.out.println(a + " ");
                jumlah++;
            }
        }
        System.out.printf("\nBanyak bilangan ganjil = " + jumlah);
    }
}