import java.util.Scanner;
class Looping4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ganjil = 0;
        int genap = 0;
        int positif = 0;
        int negatif = 0;

        for (int x = 1; x <= 5; x++){
            int angka = input.nextInt();
            if (angka%2==0){
                genap++;
                if (angka>0){
                    positif++;
                } else {
                    negatif++;
                }  
            } else {
                ganjil++;
                if (angka>0) {
                    positif++;
                } else {
                    negatif++;
                }

            }
        
        }
        System.out.println(genap + " Bilangan genap");
        System.out.println(ganjil + " Bilangan ganjil");
        System.out.println(positif + " Bilangan positif");
        System.out.println(negatif + " Bilangan negatif");
        }
    }