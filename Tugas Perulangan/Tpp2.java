import java.util.Scanner;
class Tpp2{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int password = 2002;
        boolean pass = false;
        while (pass == false){
            int inputPassword = sc.nextInt();
            if (inputPassword == password){
                System.out.println("password anda benar");
                pass = true;

            } else {
                System.out.println("password anda salah");
            }
            
        }
        
    }
}