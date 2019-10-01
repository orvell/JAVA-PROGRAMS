/*Name:Orvell Ferreira  Roll No: 8671 Date:  24/07/2019 */
import java.util.*;
class menu
{ 
static int factorial(int x)
{
  int i,fact=1;
 for(i=1;i<=x;i++)
  {
    fact=fact*i;
}
    return (fact);
  
}

static void armstrong(int x)
{ 
int n=x,d=0,sum=0;
 while(x>0)
{
 d=x%10;
 x=x/10;
 sum=sum+(d*d*d);
}
if(n==sum)
  System.out.println("\nThe armstrong number is: "+ sum);
else
  System.out.println("\nThe number is not armstrong ");
}

static void prime(int x)
{
  int n=x,i,c=0;
 for(i=2;i<=x;i++)
{

  if(x%i==0)
  c++;
  break;

}
  if(c==0)
   System.out.println("\nThe Prime is: "+ n);
  else
   System.out.println("\nThe number is not prime ");
}
public static void main(String arg[])
 {
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the Number: ");
  int x= sc.nextInt();
  System.out.println("Enter the 1 to factorial \nEnter the 2 to Armstrong \nEnter the 3 to CheckPrime ");
  int y= sc.nextInt();
  
  switch(y)
  {
  case 1: int a= factorial(x);
          System.out.println("\nThe factorial is: "+ a);
	  break;
  case 2: armstrong(x);
       	  break;
  case 3:prime(x);
          
	  break;
    }
 }
}
/* Output:
Enter the Number: 
5
Enter the 1 to factorial 
Enter the 2 to Armstrong 
Enter the 3 to CheckPrime 
1

The factorial is: 120
Enter the Number: 
153
Enter the 1 to factorial 
Enter the 2 to Armstrong 
Enter the 3 to CheckPrime 
2
The armstrong number is: 153

Enter the Number: 
5
Enter the 1 to factorial 
Enter the 2 to Armstrong 
Enter the 3 to CheckPrime 
3

The Prime is: 5
*/
