import java.util.Scanner;
class Tpp3{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int y  = sc.nextInt();
        for (int i = 0; i<=50; i+=5){
            System.out.println(i + " " + (4*i+1));
        }

        for (int i = 1; i<=10; i++){
            System.out.println(i + " " + (Math.sqrt(i)-1));
        }

        for (double i=1; i<=5; i+=0.5){
            System.out.println(i + " " + ((5*Math.pow(i, 2)+(3*i)-2)));
        }

    }
}
