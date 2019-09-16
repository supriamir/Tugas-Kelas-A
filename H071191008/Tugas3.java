import java.util.Scanner;
class Tugas3{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,sum,i;
        sum = 0;

        System.out.print("N = ");
        n = input.nextInt();
        System.out.print("Bilangan ganjil = ");
        for(i = 1; i <= n; i = i + 2){
            System.out.print(i);
            System.out.print(i < n ? "," : "\n");
            sum++;
        }


        System.out.print("Banyak bilangan ganjil = " + sum);

    }
} 