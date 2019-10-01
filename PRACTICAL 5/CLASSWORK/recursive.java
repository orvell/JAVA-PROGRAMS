/*Name:Orvell Ferreira  Roll No: 8671 Date: 31/07/2019 */
import java.util.*;
class recursive
{
  static int rev=0,i=1,sum=0;
  static int reverse(int x)
  {
  int n;
  if(x!=0)
  {
     n=x%10;
     rev=rev*10+n;
     reverse(x/10);
  }
  return rev;
  }
  static int series(int y)
  {
   if(y!=0)
   {
   sum=sum+i;
   i++;
   series(--y);
   }
   return sum;
  }
  
  public static void main(String args[])
	 {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter 1 for Reverse of a number \nEnter 2 to calculate sum of series 1+2+3+......+(n-1)+n\n");
	  int x=sc.nextInt();
	  switch(x)
	  {
	  case 1: System.out.println("Enter the number: ");
	          int m=sc.nextInt();
	          int a=reverse(m);
	          System.out.println("The reversed number is: "+ a+"\n");
	  		 break;
	  case 2:System.out.println("Enter the number of terms: ");
	          int n=sc.nextInt();
	          int b=series(n);
	          System.out.println("The Sum of series is "+ b);
	  		 break;
	  default : System.out.println("Invalid Input");
	  }
	 }
}
/* OUTPUT
Enter 1 for Reverse of a number 
Enter 2 to calculate sum of series 1+2+3+......+(n-1)+n

1
Enter the number: 
563
The reversed number is: 365
Enter 1 for Reverse of a number 
Enter 2 to calculate sum of series 1+2+3+......+(n-1)+n

2
Enter the number of terms: 
5
The Sum of series is 15
*/
