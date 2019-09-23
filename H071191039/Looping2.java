import java.util.Scanner;
public class Looping2 {

    public static void main(String[] args) {
        Scanner ip = new Scanner (System.in);
        boolean condititon = true ;

        while (condition) {
            int password = ip.nextInt();
            if (password != 2002) {
                System.out.println("password anda salah");
            } else if ( password == 2002 ) {
                comdition = false ;
                System.out.println("password anda benar");
            } 
        }
    }
}