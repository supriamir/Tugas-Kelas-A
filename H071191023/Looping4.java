import java.util.Scanner;
class Looping4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int ganjil = 0;
        int genap = 0;
        int positif = 0;
        int negatif = 0;

        for (int a=0; a<5; a++) {
        int nilai = input.nextInt();
        if (nilai%2==0) {
        genap++;
        if (nilai>0) {
        positif++;
        } else {
        negatif++;
        }
        } else {
        ganjil++;
        if (nilai>0) {
        positif++;
        } else {
        negatif++;
        }
        }
        }
        System.out.println(genap + " Bilangan Genap ");
        System.out.println(ganjil + " Bilangan Ganjil ");
        System.out.println(positif + " Bilangan Positif ");
        System.out.println(negatif + " Bilangan Negatif ");
    }
}