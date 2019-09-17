import java.util.Scanner;
class Tugas1{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp .nextInt(),i = 1;
        inp.close();
        System.out.printf("Faktor dari %d adalah ",n);

        while(i <= n){
            if(n %i == 0){
                System.out.printf("%d, ",i);
            }
            i++;
        }    
    }
}