/*Name:Orvell Ferreira  Roll No: 8671 Date:  24/07/2019 */
import java.util.*;
class Quadratic
   {

	public static void main(String args[]) 
	{
                Scanner sc= new Scanner(System.in);
		double root1,root2,imaginary,d;
		System.out.print("Please Enter the Values of a, b, c of Quadratic Equation : ");
		double a=sc.nextDouble();	
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		System.out.println("The value of a="+ a + " The value of b=" + b + " The value of c=" + c );
		d=(b*b)-(4*a*c);
	  	
	  	if(d>0)
	  	{
	  		root1=(((-b)+(Math.sqrt(d)))/(2*a));
	  		root2=(((-b)-(Math.sqrt(d)))/(2*a));
	  		System.out.println("Two Distinct Real Roots Exists: root1 = " + root1 + " and root2 = " + root2);
	  	}
	  	else if(d==0)
	  	{
	  		root1=root2=(-b)/(2* a);
	  		System.out.println("Two Equal and Real Roots Exists: root1 = " + root1 + " and root2 = " + root2);
	  	}
	  	else if(d<0)
	  	{
	  		root1=root2=-b/(2*a);
	  		imaginary=Math.sqrt(-d)/(2*a);
	  	System.out.println("Two Distinct Complex Roots Exists: root1 = " + root1 + " + " + imaginary +"i"+ " and root2 = " + root2 +" - " +imaginary+"i");
	  	}		
	}
  }
/* OUTPUT:
Please Enter the Values of a, b, c of Quadratic Equation : 1
-4
3
The value of a=1.0 The value of b=-4.0 The value of c=3.0
Two Distinct Real Roots Exists: root1 = 3.0 and root2 = 1.0 */

 
 
