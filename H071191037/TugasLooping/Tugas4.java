import java.util.*;
class Tugas4{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int i = 1,genap=0,ganjil=0,neg=0,pos=0;
        inp.close();
        for(i = 1 ; i <= 5 ; i++){
            int n = inp.nextInt();
            if(n %2 == 0 && n > 0){
                genap++;
                pos++;
            }else if(n %2 == 0 && n < 0){
                genap++;    
                neg++;
            }else if(n %2 == 1 && n > 0){
                ganjil++;
                pos++;
            }else if(n %2 == 1 && n < 0){
                ganjil++;
                neg++;
            }else{
                neg++;
            }
        }
        System.out.printf("%d bilangan genap\n%d bilangan ganjil\n%d bilangan positif\n%d bilangan negatif",genap,ganjil,pos,neg);
    }
}