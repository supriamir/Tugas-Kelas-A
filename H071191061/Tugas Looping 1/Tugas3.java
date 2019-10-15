import java.util.Scanner;
class Tugas3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input bilangan : ");
        int n = input.nextInt();
        int odd = 0;
        System.out.print("Bilangan ganjil = ");
        if (n > 0)
        {
            for (int i = 1; i <= n; i++)
            {
                if (i % 2 != 0)
                {
                    odd ++;
                    System.out.print(i+ ", ");
                }
            } 
        }else if (n < 0)
        {
            for (int i = 0; i >= n; i--)
            {
                if (i % 2 != 0)
                {
                    odd++;
                    System.out.print(i+ ", ");
                }
            }
        }else
        {
            System.out.print("Tidak Ada");
        }
        System.out.println(" ");
        System.out.println("Jumlah bilangan ganjil = "+odd);
        input.close();
    }
}