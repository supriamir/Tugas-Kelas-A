import java.util.Scanner;
class Looping2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int password = 2002;
        boolean benar = true;
        System.out.print("Input password anda              : ");
        
        while (benar = true) {
            int inputPassword = input.nextInt();
            if (inputPassword == password) {
            System.out.println("\nPASSWORD ANDA BENAR");     
            break;   
            }
            else {
            System.out.println("\nPASSWORD ANDA SALAH!!!");
            System.out.print("\nInput password anda dengan benar : ");
            benar = false;
            }
            
        }
     input.close();   
    }
}