import java.util.Scanner;
class Aa3n2{
    public static void main(String[] args) {
        Scanner kScanner = new Scanner(System.in);
        int password = 2002;
        boolean check = true;
        while(check){
            int input = kScanner.nextInt();
            if(input == password){
                System.out.println("Password Benar");
                check = false;
            }else{
                System.out.println("Password Salah");
            }
        }
    }
}