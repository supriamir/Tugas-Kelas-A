import java.util.*;
public class Looping4{
    public static void main(String[] args) {
        Scanner main = new Scanner(System.in);
        
        int ganjil = 0;
        int genap = 0;
        int positif = 0;
        int negatif = 0;
        System.out.println("Masukkan Bilangan =");
        
        for (int i = 0; i < 5; i++){
            int Bilangan = main.nextInt();
            if (Bilangan % 2 == 0 && Bilangan != 0){
                genap++;
                if (Bilangan > 0){
                    positif++;
                }
                else{
                    negatif++;
                }
            }
            else if (Bilangan % 2 != 0 && Bilangan != 0){
                ganjil++;
                if (Bilangan > 0){
                    positif++;
                }
                else{
                    negatif++;
                }
            }
        }
        System.out.println("Bilangan genap = "+ genap);
        System.out.println("Bilangan ganjil = "+ ganjil);
        System.out.println("Bilangan positif = "+ positif);
        System.out.println("Bilangan negatif = "+ negatif);
    }
}





