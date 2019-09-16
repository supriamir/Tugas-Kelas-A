import java.util.Scanner;
class Tugas1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input bilangan : ");
        int n = input.nextInt();
        System.out.printf("Faktor nya adalah : ");
        int plus = 0;
        if (n > 0)
        {
            for (int z = 0; z <= n; z++)
            {
                plus++;
                    if (n % plus == 0)
                    {
                    System.out.print(plus+ ", ");
                    }
            }
        }else if (n < 0)
        {
            for (int z = 1; z <= (-1*n); z++)
            {
                if (n % z==0)
                {
                    System.out.print(z+ ", ");
                }
            }
        }else
        {
            System.out.println("null");
        }
        input.close();
    }
}