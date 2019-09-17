import java.util.Scanner;
class tugas1{
    public static void main(String[] args) {
    Scanner yuk = new Scanner(System.in);
    int n = yuk.nextInt();
    System.out.println("Faktor dari n ="+ n +"adalah");

    if (n > 0){
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                System.out.println(i);
            }
        }
    }else if (n < 0){
        for (int i = 1; i <= (-1*n); i++){
            if (n % i == 0){
                System.out.println(i);
            }
    }
    }else{
        System.out.println("null");
    }
    }
} 