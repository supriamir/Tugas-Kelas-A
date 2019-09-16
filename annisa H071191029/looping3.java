import java.util.Scanner;
class looping3{
    public static void main(String[] args) {
        Scanner ww = new Scanner(System.in);
        System.out.println("N = ");
        int N = ww.nextInt();
        System.out.println("bilangan ganjil = ");
        int odd = 0;
        for (int x =1  ; x <= N ; x+=2){
            System.out.println(x+",");
            odd += 1;
            
            }

            System.out.println("\n banyak bilangan ganjil =" + odd);
        
    }
}