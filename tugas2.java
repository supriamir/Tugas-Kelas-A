import java.util.Scanner;
class tugas2{
    public static void main(String[] args) {
    Scanner yuk = new Scanner(System.in);
    int n = yuk.nextInt();
    System.out.println("Nilai n ="+ n);
    int sum = 0;
    
    for (int i = 1; i <= n; i++){
        if (n % i == 0){
            sum += i;
        } 
    }
    System.out.println("sum ="+ sum);
    }
}