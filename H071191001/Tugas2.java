import java.util.Scanner;

class Tugas2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        // jumlah dimulai dari 0
        for (int i=1 ; i <= N ; i++){
            if (N%i==0){
                sum += i;
            }
        }
        System.out.println("Sum = " + sum);
    }
}