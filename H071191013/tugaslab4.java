import java.util.Scanner;
class Tugaslab4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ganjil = 0;
        int genap = 0;
        int positif = 0;
        int negatif = 0;
        int nol = 0;

        for ( int a = 1 ; a <= 5 ; a++){
            int input = scan.nextInt();
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
        System.out.printf("\nBilangan genap " + genap);
        System.out.printf("\nBilangan ganjil " + ganjil);
        System.out.print("\nBilangan positif " + positif);
        System.out.println("\nBilangan negatif " + negatif);
        System.out.println("\nBilangan nol " + nol);
    }
}