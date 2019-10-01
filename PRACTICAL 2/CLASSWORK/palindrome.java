/*Name:Orvell Ferreira  Roll No: 8671 Date:17/07/2019 */
import java.util.*;
class palindrome
{
   public static void main(String arg[])
{
      Scanner s= new Scanner(System.in);
      System.out.println(" Enter the String:");
      String str1=s.next();
      String str2="";
      for(int i=str1.length()-1;i>=0;i--)
      {
        str2=str2+ str1.charAt(i);
      }
        if(str1.equals(str2))
          System.out.println("String is Palindrome");
        else
          System.out.println("String is Not Palindrome");
}
}

/* output
Enter the String:
madam   
String is Palindrome*/

