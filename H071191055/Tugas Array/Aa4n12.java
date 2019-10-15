import java.util.Scanner;
class Aa4n12
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    int n = read.nextInt();
    int h[] = new int[n];
    String colour[] = new String[n];
    boolean found = false;
    for(int i = 0; i < n; i++)
    {
      h[i] = read.nextInt();
      colour[i] = read.next();
    }
    int x = read.nextInt();
    String colourx = read.next();
    for(int i = 0; i < n; i++)
    {
      if(h[i] == x && colour[i].equalsIgnoreCase(colourx))
      {
        found = true;
        System.out.println("sepatu berwarna " + colour[i] + " berukuran " + h[i] + " ditemukan pada indeks ke " + i);
      }
      found = false;
    }
  }
}
