import java.util.Scanner;
class looping1{
    public static void main(String[] args) {
        Scanner ww = new Scanner(System.in);
        System.out.println("N = ");
        int N = ww.nextInt();
        System.out.println("Faktor dari " + N + " adalah ");
        for (int i = 1 ; i <= 4; i++){
            if (N%i==0){
                System.out.println(i + ",");
            }
        }
        
    }
}