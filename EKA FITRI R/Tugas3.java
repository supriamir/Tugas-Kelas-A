import java.util.Scanner;
class Tugas3{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        System.out.println("Bilangan ganjil = ");
        int sum = 0;
    
        for (int k = 1; k <= N; k += 2){
                System.out.println(k + " ");
                sum++;
        }
        System.out.println("Jumlah bilangan Ganjil : " + sum);
                
        sc.close();
    }
}