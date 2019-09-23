import java.util.Scanner;
class Tugasloop21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int pangkat = input.nextInt();

        double n = 1;
        
        if (pangkat>=0) {
            for (int i = 1; i <= pangkat; i++) {
                n = n*base;
            }
            System.out.printf("%d ^ %d = %.0f", base, pangkat, n);
        } else { //pangkat<0
            for (int i = -1; i >= pangkat; i--) {
                n = n*base;
            }
            System.out.printf("%d ^ %d = %.3f", base, pangkat, (1/n));
        }

        
        

        
        
       
        



    }    
}