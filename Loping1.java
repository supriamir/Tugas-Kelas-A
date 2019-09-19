import java.util.Scanner;

class Loping1{
    public static void main (String[] args){
        Scanner Loping1 = new Scanner (System.in);
        int a = Loping1.nextInt();
        System.out.printf("%d merupakan kelipatan dari ",a);
        if(a > 0)
        {
            for(int i = 1; i <= a; i++)
            {
                if(a % i == 0);
                {
                    System.out.printf("%d ",i);    
                }
            }
        }



        
    }
}






