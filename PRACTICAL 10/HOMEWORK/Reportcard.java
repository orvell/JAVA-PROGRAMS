/*Name:Orvell Ferreira  Roll No: 8671 Date: 18/09/2019 */
import java.util.*;
class MarksOutOfBoundsException extends Exception
{
	MarksOutOfBoundsException()
	{
		System.out.println("The Entered marks are greater than 100 or less than 0");
	}
}

class Reportcard
{
	public static void main(String args[])
	{
		try
		{	
			Scanner s=new Scanner(System.in);
			System.out.print("Enter Name of Student: ");
			String name=s.nextLine();
			System.out.print("Enter the Date: ");
			String date=s.nextLine();
			System.out.print("Enter Seat Number of Student: ");
			long seatno=s.nextLong();
			
			System.out.print("Enter the Center Number: ");
			int centerno=s.nextInt();
			System.out.println("Enter Marks of Semester 3 Exam: ");
			System.out.print("Enter Marks Subject 1(Maths - III): ");
			double s1=s.nextDouble();
			System.out.print("Enter Marks Subject 2(DSA): ");
			double s2=s.nextDouble();
			System.out.print("Enter Marks Subject 3(DBMS): ");
			double s3=s.nextDouble();
			System.out.print("Enter Marks Subject 4(PC): ");
			double s4=s.nextDouble();
			System.out.print("Enter Marks Subject 5(LOGIC DESIGN): ");
			double s5=s.nextDouble();
			System.out.print("Enter Marks Subject 6(JAVA): ");
			double s6=s.nextDouble();
			if(s1<0 || s1>100 || s2<0 || s2>100 || s3<0 || s3>100 || s4<0 || s4>100 || s5<0 || s5>100 || s6<0 || s6>100)
			{
			throw new MarksOutOfBoundsException();
			}
			System.out.println("Result");
			System.out.println("Name of Student: "+ name + "    Seat number: " + seatno + "    Center Number: "+centerno+"    Date: "+date);
			System.out.println("Maths - III: "+ s1);
			System.out.println("DSA: "+ s2);
			System.out.println("DBMS: "+ s3);
			System.out.println("PC: "+ s4);
			System.out.println("LOGIC DESIGN: "+ s5);
			System.out.println("JAVA: "+ s6);
			
			double result=((s1+s2+s3+s4+s5+s6)*100)/600;
			System.out.println("PERCENTAGE : " + result+" %");
		}
			catch(Exception e)
		{
		}
		
	}
}
/*OUTPUT :
Enter Name of Student: Orvell Ferreira
Enter the Date: 15/09/2019
Enter Seat Number of Student: 20198671
Enter the Center Number: 100005
Enter Marks of Semester 3 Exam:
Enter Marks Subject 1(Maths - III): 95.62
Enter Marks Subject 2(DSA): 92.36
Enter Marks Subject 3(DBMS): 94.89
Enter Marks Subject 4(PC): 97.65
Enter Marks Subject 5(LOGIC DESIGN): 90.89
Enter Marks Subject 6(JAVA): 98.99
Result
Name of Student: Orvell Ferreira    Seat number: 20198671    Center Number: 100005    Date: 15/09/2019
Maths - III: 95.62
DSA: 92.36
DBMS: 94.89
PC: 97.65
LOGIC DESIGN: 90.89
JAVA: 98.99
PERCENTAGE : 95.06666666666666 %
*/
