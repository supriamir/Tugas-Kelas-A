import java.util.Scanner;
class Loop2{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pass = 2002;
        boolean kondisi = true;
        
        while (kondisi){
            System.out.println("Input password = ");
            int password = in.nextInt();
            if (password != pass) {
                System.out.println("Password anda salah");
            }
            else {
                System.out.println("Password anda benar");
                kondisi = false;
            }
        }
        in.close();
    }
}