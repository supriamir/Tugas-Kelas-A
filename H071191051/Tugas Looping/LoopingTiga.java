import java.util.Scanner;

public class LoopingTiga{
    public static void main(String []args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan Angka = ");
        int angka = userInput.nextInt();
        int jumlah = 0;

        for ( int a = 0 ; a <= angka ; a++){
            if ( a % 2 == 1){
                System.out.print(a + " ");
                jumlah++;
            }
        }
        System.out.println("\nBanyak bilangan ganjil = " + jumlah);
    }
}