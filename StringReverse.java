import java.util.Scanner;
class StringReverse
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String words = scan.nextLine();
    char chars;
    for(int i = words.length()-1 ; i >= 0; i--)
    {
      chars = words.charAt(i);
      System.out.printf("%c",chars == '(' ? ')': chars == ')' ? '(':chars);
    }
  }
}