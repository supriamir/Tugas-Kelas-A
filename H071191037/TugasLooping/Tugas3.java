import java.util.Scanner;
class Tugas3{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt(),i = 1,sum=0;
        inp.close();
        System.out.printf("Bilangan Ganjil = ");
        while(i <= n){
            if(i %2 == 1){
                System.out.printf("%d,",i);
                sum+=1;
            }
            i++;
        }
        System.out.printf("\nBanyak bilangan ganjil = %d",sum);
    }
}