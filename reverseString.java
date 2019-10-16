  
import java.util.Scanner;
class reverseString
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String words = sc.nextLine();
    char chars;
    for(int i = words.length()-1 ; i >= 0; i--)
    {
      chars = words.charAt(i);
      System.out.printf("%c",chars == '(' ? ')': chars == ')' ? '(':chars);
    }
  }
}