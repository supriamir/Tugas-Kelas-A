import java.util.Scanner;
class Aa3n1{
    public static void main(String[] args) {
        Scanner dScanner = new Scanner(System.in);
        double sum = 1;
        int base = dScanner.nextInt();
        int pangkat = dScanner.nextInt();
        if(pangkat >= 0){
            for(int i = 1; i <= pangkat; i++){
                sum = sum*base;
            }
        }else if(pangkat < 0){
            for(int i = 0; i > pangkat; i--){
                sum = sum*((float)1/base);
            }
        }System.out.println(base+" ^ "+pangkat + " = " + sum);
    }
}