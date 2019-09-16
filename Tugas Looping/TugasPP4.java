import java.util.Scanner;
class TugasPP4{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a;
        int bilanganGenap = 0;
        int bilanganGanjil = 0;
        int bilanganPositif = 0;
        int bilanganNegatif = 0;
        for (int i=0; i<5; i++){
            a = sc.nextInt();
            if(a>0){
                bilanganPositif++;
            }else if (a<0){
                bilanganNegatif++;
            }
            
            if (a%2==0){
                bilanganGenap++;
            }else if (a%2!=0){
                bilanganGanjil++;
            }

        }
        System.out.println(bilanganPositif + " bilangan positif ");
        System.out.println(bilanganNegatif + " bilangan negatif ");
        System.out.println(bilanganGanjil + " bilangan ganjil ");
        System.out.println(bilanganGenap + " bilangan genap ");
    }
}