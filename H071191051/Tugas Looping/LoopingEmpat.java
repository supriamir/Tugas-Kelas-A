import java.util.Scanner;

public class LoopingEmpat{
    public static void main(String []args){
        System.out.print("Masukkan Angka = ");
        Scanner userInput = new Scanner(System.in);

        int ganjil = 0;
        int genap = 0;
        int positif = 0;
        int negatif = 0;
        int nol = 0;

        for ( int a = 1 ; a <= 5 ; a++){
            int input = userInput.nextInt();
            if (input % 2 == 0){
                genap++;
            }else{
                ganjil++;
            }
            if (input < 0){
                negatif++;
            }else{
                positif++;
            }
            if (input == 0){
                nol++;
            }
        }
        System.out.println("\nBilangan genap " + genap);
        System.out.println("Bilangan ganjil " + ganjil);
        System.out.println("Bilangan negatif " + negatif);
        System.out.println("Bilangan positif " + positif);
        System.out.println("Bilangan nol " + nol);

    }
}