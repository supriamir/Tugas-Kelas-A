import java.util.Scanner;
class looping3{
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        int odd = 0;
        System.out.println("bilangan ganjil = ");
        if(n > 0){
            for(int i = 1; i <= n; i++){
                if(i%2 !=0){
                    odd++;
                    System.out.printf("%d",i);
                
            }else{
                System.out.println("tdk ada");
            }System.out.printf("jumlah bilangan ganjil = %d",odd);
        }
    }
}
}