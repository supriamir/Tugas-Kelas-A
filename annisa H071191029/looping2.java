import java.util.Scanner;
class looping2{
    public static void main(String[] args) {
        Scanner ww = new Scanner(System.in);
        System.out.println("N = ");
        int N = ww.nextInt();
        int sum = 0;
        for (int x=1 ; x <= N ; x++){
            if (N%x==0){
                sum += x;
            }
        }
        System.out.println("sum = " + sum);
        ww.close();
    }
}