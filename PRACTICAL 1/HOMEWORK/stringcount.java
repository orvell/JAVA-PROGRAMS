/*Name:Orvell Ferreira  Roll No: 8671 Date:  24/07/2019 */
import java.util.*;
class stringcount
{
   public static void main(String arg[])

   { 
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the String");
	 String str= s.nextLine();
	 char[] ch = str.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int specialsymbols = 0;
		for(int i = 0; i < str.length(); i++)
		{
			if(Character.isLetter(ch[i]))
			{
				letter ++ ;
			}
			else if(Character.isDigit(ch[i]))
			{
				num ++ ;
			}
			else if(Character.isSpaceChar(ch[i]))
			{
				space ++ ;
			}
			else
			{
				specialsymbols ++;
			}
		}
		System.out.println("The String is :" + str);
		System.out.println("Number of Alphabets: " + letter);
		System.out.println("Space: " + space);
		System.out.println("Number: " + num);
		System.out.println("Special symbols: " + specialsymbols);
   }
}

/* Output:
orvell ferreira 8671 @IT
The String is :orvell ferreira 8671 @IT
Number of Alphabets: 16
Space: 3
Number: 4
Special symbols: 1   */
