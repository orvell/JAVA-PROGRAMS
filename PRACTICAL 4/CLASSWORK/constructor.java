/*Name:Orvell Ferreira  Roll No: 8671 Date: 31/07/2019 */
import java.util.*;
class Student
{
	int rollno,age;
	String name;
	Student()
	{
		name="Orvell";
		rollno=8671;
		age=18;
	}
	Student(int x,int y)
	{
		rollno=x;
	    age=y;
		
	}
	Student(String x,int y,int z)
	{
	 name=x;
	 rollno=y;
	 age=z;
	}
}
class constructor
{
	public static void main(String arg[])

   { 
	Scanner sc= new Scanner(System.in);
	Student s= new Student(); //default constructor
	System.out.println("Default values: " + "Name: " + s.name + "  RollNo: " + s.rollno + "  Age: " + s.age);
	System.out.println("Enter name of student");
	String p=sc.nextLine();
	System.out.println("Enter RollNo of student");
	int q=sc.nextInt();
	System.out.println("Enter Age of student");
	int r=sc.nextInt();
    Student s1=new Student(p,q,r); //parameterised constructor with 3 variables
	System.out.println("Name: " + s1.name + "  RollNo: " + s1.rollno + "  Age: " + s1.age);
	System.out.println("Enter RollNo of student");
	int a=sc.nextInt();
	System.out.println("Enter Age of student");
	int b=sc.nextInt();
    Student s2=new Student(a,b); //parameterised constructor with 2 variables
	System.out.println("Name: " + s2.rollno + "  RollNo: " + s2.age);
	
   }
}
/*Output:
Default values: Name: Orvell  RollNo: 8671  Age: 18
Enter name of student
Clint
Enter RollNo of student
8670
Enter Age of student
18
Name: Clint  RollNo: 8670  Age: 18
Enter RollNo of student
8681
Enter Age of student
19
Name: 8681  RollNo: 19 */