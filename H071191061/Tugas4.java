import java.util.Scanner;
class Tugas4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int odd = 0, even = 0, pos = 0, neg =0;
        System.out.println("Input 5 Bilangan : ");
        for (int i = 0; i < 5; i++)
        {
            int n = input.nextInt();
            if (n % 2 == 0 && n > 0)
            {
                even++;
                pos++;
            }
            else if (n % 2 == 0 && n < 0)
            {
                neg++;
                even++;
            }
            else if (n % 2 != 0 && n > 0 )
            {
                odd++;
                pos++;
            }
            else if (n % 2 != 0 && n < 0)
            {
                odd++;
                neg++;
            }
            else
            {
                even++;
            }
        }
        System.out.printf("%d Bilangan genap%n",even);
        System.out.printf("%d Bilangan ganjil%n",odd);
        System.out.printf("%d Bilangan positif%n",pos);
        System.out.printf("%d Bilangan negatif%n",neg);
        input.close();
    }
}