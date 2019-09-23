import java.util.Scanner;
class While{
    public static void main(String[] args){
        Scanner fa = new Scanner(System.in);
        int password = fa.nextInt();
        while (password != 2002) {
            System.out.println("Password anda salah");
        int pass=fa.nextInt();
        if (pass == 2002) {
            System.out.println("Password anda benar");
            }
        }
    }
}