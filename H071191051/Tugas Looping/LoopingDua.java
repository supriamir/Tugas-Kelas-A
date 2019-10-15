import java.util.Scanner;

public class LoopingDua{
    public static void main(String []args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan Angka = ");
        int angka = userInput.nextInt();
        int jumlah = 0;

        System.out.println("Faktor dari " + angka + " adalah ");
        for ( int a = 1 ; a <= angka ; a++){ 
            if ( angka % a == 0){
                System.out.print(a + " ");  
                jumlah += a; 
            }
        }
        System.out.println("\nJumlah = " + jumlah);
    }
}