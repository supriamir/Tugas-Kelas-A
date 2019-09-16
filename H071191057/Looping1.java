import java.util.Scanner;
class Looping1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("N = ");
        int N = input.nextInt();
        System.out.print("Faktor dari " + N + " adalah ");
        for (int i = 1 ; i <= 4; i++){
            if (N%i==0){
                System.out.print(i + ",");
        input.close();
    }
}
}
}
