/*Name:Orvell Ferreira  Roll No: 8671 Date: 31/07/2019 */
import java.util.*;
class equality
{
	public static void main(String args[])
  { 
   String str1=args[0];
   String str2=args[1];
   System.out.println("String 1: " + str1);
   System.out.println("String 2: " + str2);
    if(str1.equals(str2))
       System.out.println("Strings is Equal");
    else
       System.out.println("Strings is Not Equal");
  }
}

/*Output:
java equality orvell orvell        //executing using command line argument method
String 1: orvell
String 2: orvell
Strings is Equal
java equality orvell ferreira      //executing using command line argument method
String 1: orvell
String 2: ferreira
Strings is Not Equal */