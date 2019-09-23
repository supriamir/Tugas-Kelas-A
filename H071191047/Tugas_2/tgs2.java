import java.util.Scanner;
public class Password {

    public static void main(String[] args) {
        Scanner bay= new Scanner(System.in);
        while (true){
            int pass = bay.nextInt();
            if (pass == 2002){
                System.out.println("pasword benar ");
                break;
            }
            System.out.println("pasword salah ");
        }
           
    }
}
