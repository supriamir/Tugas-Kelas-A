import java.util.Scanner;
class Tugas2{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt(), i = 1,sum=0;
        inp.close();

        while(i <= n){
            if(n %i == 0){
                sum += i;
            }
            i++;
        }
        System.out.printf("sum = %d",sum);
    }
}