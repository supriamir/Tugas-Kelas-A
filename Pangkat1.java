import java.util.Scanner;
class Pangkat1{
    public static void main(String[] args){
        Scanner fa = new Scanner (System.in);
        System.out.print("Input angka"); int angka = fa.nextInt();
        System.out.print("Input pangkat"); int pangkat = fa.nextInt();
        int i = 0;
        double x=1;
        if (pangkat<0) {
            while (i>pangkat) {
                x=x*angka;
                i--;
            }
        }else{
            while (i<pangkat) {
                x=x*angka;
                i++;
            }
            System.out.println(x);
        }
    }
}