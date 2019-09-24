import java.util.Scanner;
class Tugaslab1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int angka = scan.nextInt();
        
        System.out.println("Faktorial dari " + angka + " adalah ");
        for(int i = 1; i <= angka; i++){
            if(angka % i == 0){
                System.out.println(i + " ");
            }
        }
    }
}