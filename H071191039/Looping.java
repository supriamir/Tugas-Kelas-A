import java.util.Scanner;
public class Looping {

    public static void main(String[] args) {
        Scanner ip = new Scanner (System.in);
        System.out.print("Base = ");
        int base = ip.nextInt();
        System.out.print("pangkat = ");
        int pangkat = ip.nextInt();
        int pow = 1;

        if ( pangkat > 0 ) {
            for ( int i = 1 ; i <= pangkat ; i++ ) { 
            pow = pow * base;
        }
            System.out.printf("%d ^ %d = %d ", base, pangkat, pow);            
    }else if ( pangkat < 0 ) {
        for ( int i = -1 ; i >= pangkat ; i-- ) {
            pow = pow * base;
        }
            System.out.printf(" %d ^ %d = 1%d", base, pangkat, pow); 
    }else {
        for ( int i = 1 ; i <= pangkat ; i++) {
            pow = pow * 1 ;
        }
            System.out.printf(" %d ^ %d = %d", base, pangkat, pow);
    } 
    
    }    
    }
}
