import java.util.Scanner;
class tugaslab2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int angka = scan.nextInt();
        int jumlah = 0;

        System.out.println("Faktor dari " + angka + " Adalah ");
        for ( int a = 1 ; a <= angka ; a++){
            if ( angka % a == 0){
                System.out.println(a + " ");
                jumlah += a;

            }
        }
        System.out.printf("\nJumlah = " + jumlah);
    }
}