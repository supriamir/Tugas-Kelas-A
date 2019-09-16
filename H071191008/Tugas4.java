import java.util.Scanner;
class Tugas4{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int bilanganGenap = 0;
        int bilanganGanjil = 0;
        int bilanganPositif = 0;
        int bilanganNegatif = 0;


        for (int i = 0; i < 5; i++){
            a = input.nextInt();
            if(a > 0){
                bilanganPositif++;
            } else {
                bilanganNegatif++;
            }

            if (a % 2 == 0){
                bilanganGenap++;
            } else {
                bilanganGanjil++;

            }
        }
        System.out.println(bilanganPositif + " Bilangan Positif ");
        System.out.println(bilanganNegatif + " Bilangan Negatif ");
        System.out.println(bilanganGanjil + " Bilangan Ganjil ");
        System.out.println(bilanganGenap + " Bilangan Genap ");
    }
}