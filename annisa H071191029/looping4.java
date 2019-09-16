import java.util.Scanner;
class looping4{
    public static void main(String[] args) {
        Scanner ww = new Scanner(System.in);
        int ganjil = 0;
        int genap = 0;
        int positif = 0;
        int negatif = 0;
        System.out.println("Angka = ");
        for (int x = 1; x <=5; x++){
            int angka = ww.nextInt();
            int ganjilGenap = angka%2 == 0 ? genap++ : ganjil++;
            int posotifNegatif = angka>0 ? positif++ : negatif++;
        }
        System.out.println(genap + " bilangan genap");
        System.out.println(ganjil + " bilangan ganjil");
        System.out.println(positif + " bilangan positif");
        System.out.println(negatif + " bilangan negatif");

        
    }
}