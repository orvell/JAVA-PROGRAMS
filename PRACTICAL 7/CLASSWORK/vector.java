/*Name:Orvell Ferreira  Roll No: 8671 Date: 07/08/2019 */
import java.util.*;
class vector
{
public static void main(String[] arg) 
{ 
 int i;
 Scanner s=new Scanner(System.in);
 Vector v = new Vector(); 
 System.out.println("Enter the number of strings the vector must contain: ");	
 String n=s.nextLine();
 int p=Integer.parseInt(n);
 System.out.println("Enter the Strings");	
		for(i=0;i<p;i++)
		{
			String a=s.nextLine();
			  v.add(a);
		}
System.out.println("The vector list is" + v);
System.out.println("Enter the string to be checked: ");	
String b=s.nextLine();

   if(v.contains(b))
   {
   v.remove(b);
   System.out.println("The vector element is removed \n"+ "the vector list is" + v);
   }
   else
   { 
    v.add(b);
    System.out.println("The vector element is Inserted \n"+ "the vector list is" + v);
   }
  
  }
}
/* output:
Enter the number of strings the vector must contain:																	//vector removed
5
Enter the Strings
aaa
bbb
ccc
ddd
eee
The vector list is[aaa, bbb, ccc, ddd, eee]
Enter the string to be checked:
bbb
The vector element is removed
the vector list is[aaa, ccc, ddd, eee]

Enter the number of strings the vector must contain:																	//vector inserted
5
Enter the Strings
aaa
bbb
ccc
ddd
eee
The vector list is[aaa, bbb, ccc, ddd, eee]
Enter the string to be checked:
fff
The vector element is Inserted
the vector list is[aaa, bbb, ccc, ddd, eee, fff]

*/

			
