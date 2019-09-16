import java.util.Scanner;
class Aa2n4{
    public static void main(String[] args) {
        Scanner zScanner = new Scanner(System.in);
        int ganjil, genap, pos, neg;
        ganjil = 0; genap = 0; pos = 0; neg = 0;
        for(int i = 1; i <= 5; i++){
            int angka = zScanner.nextInt();
            if(angka % 2 == 0){
                genap++;
            }else {
                ganjil++;
            }if(angka < 0){
                neg++;
            }else{
                pos++;
            }
        }System.out.println("Banyak Bilangan Genap : "+genap);
        System.out.println("Banyak Bilangan Ganjil : "+ganjil);
        System.out.println("Banyak Bilangan Positif : "+pos);
        System.out.println("Banyak Bilanagn Negatif : "+neg);
    }
}