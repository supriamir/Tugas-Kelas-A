import java.util.Scanner;
class tugas3{
    public static void main(String[] args) {
    Scanner yuk = new Scanner(System.in);
    int n = yuk.nextInt();
    int odd = 0;
    System.out.println("Bilangan Ganjil");

    if (n > 0){
        for (int i = 1; i <= n; i++){
            if (i % 2 != 0){
                odd++;
                System.out.println(i);
            }
        }
    }else if (n < 0){
        for (int i = 0; i <= n; i--){
            if (i % 2 != 0){
                odd++;
                System.out.println(i);
            }
        }
    }else{
        System.out.println("Tidak ada");
    }
    System.out.println("");
    System.out.println("Jumlah Bilangan Ganjil ="+ odd);
    }
}