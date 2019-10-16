import java.util.Scanner;
class Tugasloop4{
    public static void main(String[] args) {
        Scanner key= new Scanner(System.in);
        int ganjil=0;
        int genap=0;
        int positif=0;
        int negatif=0;
        System.out.println("input bilangan");
        for(int a=0;a<5;a++){
            int Bilangan=key.nextInt();
            if(Bilangan%2==0){
                genap++;
                if(Bilangan>0){
                    positif++;
                }
                else if(Bilangan<=0){
                    negatif++;
                }
            }
            else if(Bilangan%2!=0){
                ganjil++;
                if(Bilangan>0){
                    positif++;
                }
                else if(Bilangan<=0){
                    negatif++;
                }
                
            }
        }
        System.out.println("Bilangan genap = "+genap);
        System.out.println("Bilangan ganjil = "+ganjil);
        System.out.println("Bilangan positif = "+positif);
        System.out.println("Bilangan negatif = "+negatif);
    }
} 
            