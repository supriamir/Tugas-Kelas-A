import java.util.Scanner;

class Tugas3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int jumlah = 0;
        System.out.print("ganjil ");
        for (int i = 1; i <= N ; i+=2) {
            if (N%2==1) {
                jumlah += 1;
                System.out.println(i + " ");  
            }
          
        }
        System.out.println("banyak nya bilangan ganjil " + jumlah);
    }
}