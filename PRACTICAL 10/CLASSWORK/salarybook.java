/*Name:Orvell Ferreira  Roll No: 8671 Date: 11/09/2019 */
import java.util.*;
class PayOutOfBoundsException extends Exception
{
	PayOutOfBoundsException()
	{
		System.out.println("Basic salary must be more than 8000");
	}
}

class salarybook
{
	public static void main(String args[])
	{
		try
		{	Scanner s=new Scanner(System.in);
			System.out.println("Enter the basic salary: ");
			double sal=s.nextDouble();
			System.out.println("Enter the DA: ");
			double da=s.nextDouble();
			System.out.println("Enter the HRA: ");
			double hra=s.nextDouble();
			System.out.println("Enter the CA: ");
			double ca=s.nextDouble();
			System.out.println("Enter the TA: ");
			double ta=s.nextDouble();
			System.out.println("Enter the Professional Tax: ");
			double pt=s.nextDouble();
			System.out.println("Enter the TDs: ");
			double tds=s.nextDouble();
			System.out.println("Enter the pf: ");
			double pf=s.nextDouble();
			
			if(sal<8000)
			{
			throw new 	PayOutOfBoundsException();
			}
			double gs=sal+da+hra+ca+ta+pt+tds+pf;
			System.out.println("The gross Salary is: "+gs);
		}
		catch(Exception e)
		{
		}
	}
}
	/* OUTPUT:
	Enter the basic salary: 
450
Enter the DA: 
45
Enter the HRA: 
44
Enter the CA: 
474
Enter the TA: 
74
Enter the Professional Tax: 
74
Enter the TDs: 
744
Enter the pf: 
77
Basic salary must be more than 8000

Enter the basic salary: 
9000
Enter the DA: 
45
Enter the HRA: 
45
Enter the CA: 
4
Enter the TA: 

4
Enter the Professional Tax: 
1
Enter the TDs: 
4
Enter the pf: 
5
The gross Salary is: 9108.0
*/
