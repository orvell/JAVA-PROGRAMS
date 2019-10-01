/*Name:Orvell Ferreira  Roll No: 8671 Date: 31/07/2019 */
import java.util.*;
 
class vowels
 {

     public static void main(String args[])
	 {
		  Scanner s = new Scanner(System.in); 
          System.out.println("Enter the String : ");
          String str = s.nextLine();
          char[] letters = str.toCharArray();

      int consonants = 0,vowels = 0;
     
      for (int i=0;i<str.length();i++) 
	  {
          if(letters[i]=='a'|| letters[i]=='e'|| letters[i]=='i'|| letters[i]=='o'|| letters[i]=='u')
			  vowels ++;
		  else if(letters[i]=='A'|| letters[i]=='E'|| letters[i]=='I'|| letters[i]=='O'|| letters[i]=='U')
			  vowels ++;
          else if(letters[i]>='A'&& letters[i]<='z')
			  consonants ++;
       }
            System.out.println("Number of vowels in String : " + vowels);
            System.out.println("Number of consonants in String : " + consonants);
	 }
  
 }
 
 
 /* Output:
 Enter the String :
Orvell Ferreira
Number of vowels in String : 6
Number of consonants in String : 8 */