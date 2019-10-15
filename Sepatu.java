import java.util.Scanner;
class Sepatu{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt(); 
    int h[] = new int[n]; 
    String colour[] = new String[n];
    boolean found = false;
    for(int i = 0; i < n; i++)
    {
      h[i] = scan.nextInt();
      colour[i] = scan.next(); 
    }
    int x = scan.nextInt(); 
    String colourx = scan.next(); 
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