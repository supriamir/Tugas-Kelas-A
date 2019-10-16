import java.util.Scanner;

class Loping3 {
    public static void main (String[] args){
        Scanner Loping3 = new Scanner (System.in);
        int n = Loping3.nextInt();
        int odd= 0;
        System.out.printf("bilangan ganjil = ");
        if (n > 0)
        {
            for(int i = 1; i <= n; i++)
            {
                if(i % 2 !=0)
                {
                    odd++;
                    System.out.printf("%d ", i);

                }
            }
        }
    }

    
}