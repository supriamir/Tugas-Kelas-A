import java.util.Scanner;
class nomor12{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(); 
    int h[] = new int[n]; 
    String colour[] = new String[n]; 
    boolean found = false;
    for(int i = 0; i < n; i++)
    {
      h[i] = in.nextInt(); 
      colour[i] = in.next();
    }
    int x = in.nextInt();
    String colourx = in.next();
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